package code._5_project.Builder;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String gender;
    private String city;
    private String state;
    private String fatherName;
    private String motherName;
    private double height;
    private double weight;
    private boolean isMarried;
    private int numberOfKids;
    private boolean isWorking;
    private int salary;
    private int experience;

    public Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.city = builder.city;
        this.state = builder.state;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.height = builder.height;
        this.weight = builder.weight;
        this.isMarried = builder.isMarried;
        this.numberOfKids = builder.numberOfKids;
        this.isWorking = builder.isWorking;
        this.salary = builder.salary;
        this.experience = builder.experience;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", isMarried=" + isMarried +
                ", numberOfKids=" + numberOfKids +
                ", isWorking=" + isWorking +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    public static class PersonBuilder{
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String gender;
        private String city;
        private String state;
        private String fatherName;
        private String motherName;
        private double height;
        private double weight;
        private boolean isMarried;
        private int numberOfKids;
        private boolean isWorking;
        private int salary;
        private int experience;

        public PersonBuilder(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public PersonBuilder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public PersonBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public PersonBuilder setHeight(double height) {
            this.height = height;
            return this;
        }

        public PersonBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PersonBuilder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public PersonBuilder setNumberOfKids(int numberOfKids) {
            this.numberOfKids = numberOfKids;
            return this;
        }

        public PersonBuilder setWorking(boolean working) {
            isWorking = working;
            return this;
        }

        public PersonBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder setExperience(int experience) {
            this.experience = experience;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
