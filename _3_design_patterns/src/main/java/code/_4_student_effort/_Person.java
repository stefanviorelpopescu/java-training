package code._4_student_effort;

// Person Class from HardCodeChallenge2
public class _Person implements IPerson {

    public String name;

    @Override
    public void walk() {
        System.out.println(this.name + "is walking!");
    }

    @Override
    public void drink() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    public _Person(_Person.Builder builder) {
        this.name = builder.name;
    }

    static class Builder {
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public IPerson build() {
            _Person person = new _Person(this);

            return null;
        }
    }
}
