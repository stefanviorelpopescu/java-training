package code._4_student_effort.hardChallenge2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class PersonInvocationHandler implements java.lang.reflect.InvocationHandler {
    private IPerson person;

    public PersonInvocationHandler(IPerson person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Instant start = Instant.now();
        Object result = method.invoke(person, args);
        Instant stop = Instant.now();

        Annotation[] annotations = method.getAnnotations();
        for(Annotation annotation : annotations)
            if(annotation instanceof LogExecutionTime) {

                Duration duration = Duration.between(start, stop);
                System.out.println("person: " + person.getName() + " action: " + method.getName() + " duration: " + duration);
            }
        return Duration.between(start, stop);
    }
}
