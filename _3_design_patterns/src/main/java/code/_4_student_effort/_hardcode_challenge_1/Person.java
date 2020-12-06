package code._4_student_effort._hardcode_challenge_1;

import static java.lang.reflect.Proxy.newProxyInstance;

public class Person implements IPerson {
    private String name;           // optional field

    // No public constructor
    private Person(Builder builder) {
        this.name = builder.name;
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking!");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking!");
    }

    @Override
    public String getName() {
        return name;
    }

    public static class Builder {
        private String name;           // optional field

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public IPerson build() {
            Person person = new Person(this);

            PersonInvocationHandler personInvocationHandler = new PersonInvocationHandler(person);

            IPerson personProxy = (IPerson) newProxyInstance(
                    PersonInvocationHandler.class.getClassLoader(),
                    new Class[] { IPerson.class },
                    personInvocationHandler);

            return personProxy;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

