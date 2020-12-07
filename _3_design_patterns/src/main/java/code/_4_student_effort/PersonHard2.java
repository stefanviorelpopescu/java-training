package code._4_student_effort;

public class PersonHard2 implements IPerson{
    private String name;

    public PersonHard2(Builder builder){
        this.name=builder.name;
    }

    static class Builder {
        private String name; //required

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public IPerson build(){
            PersonHard2 personHard2 = new PersonHard2(this);
            IPerson personProxy = (IPerson) java.lang.reflect.Proxy.newProxyInstance(
                    PersonInvocationHandler.class.getClassLoader(),
                    new Class[]{IPerson.class},
                    new PersonInvocationHandler(personHard2));

            return personProxy;
        }

    }

    @Override
    public void walk() {
        System.out.println(name + "is walking!");
    }

    @Override
    public void drink() {

    }

    @Override
    public String getName() {
        return name;
    }

}
