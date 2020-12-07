package code._4_student_effort;

import java.lang.reflect.Method;

public class PersonInvocationHandler implements java.lang.reflect.InvocationHandler {
    private IPerson pers;

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return null;
    }

    public PersonInvocationHandler(IPerson pers) {
        this.pers=pers;
    }
}
