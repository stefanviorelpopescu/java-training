package code._4_student_effort.hardChallenge2;

import java.lang.reflect.Proxy;

public class Person implements IPerson {
    public String name;

    private Person(Builder builder) {
        this.name = builder.name;
    }

    @Override
    public void walk() {
        System.out.println(name + " walking!");
    }

    @Override
    public void drink() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        System.out.println(name + " drinking!");
    }

    @Override
    public String getName() {
        return name;
    }

    static class Builder {
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public IPerson build() {
            Person person = new Person(this);

            return (IPerson) Proxy.newProxyInstance(
              PersonInvocationHandler.class.getClassLoader(),
              new Class[]{IPerson.class},
              new PersonInvocationHandler(person));
        }
    }

}
