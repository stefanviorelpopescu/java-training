package code._4_student_effort._hardcode_challenge_1;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class PersonInvocationHandler implements InvocationHandler {
    private IPerson thePerson;

    public PersonInvocationHandler(IPerson thePerson) {
        this.thePerson = thePerson;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Instant start = Instant.now();
        Object result = method.invoke(thePerson, args);
        Instant stop = Instant.now();

        if (isAnnotated(method)) {
            Duration duration = Duration.between(start, stop);
            System.out.println(thePerson.getName() + " has been " + method.getName() + "ing for " + duration);
        }
        return result;
    }

    public boolean isAnnotated(Method method) {
        Annotation[] annotations = method.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof LogExecutionTime) {
                return true;
            }
        }
        return false;
    }
}
