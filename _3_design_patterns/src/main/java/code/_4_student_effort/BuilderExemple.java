package code._4_student_effort;

public class BuilderExemple {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Popescu")
                .job("developer")
                .university("ACS")
                .build();

        Person person02 = new Person.Builder("Ionescu")
                .married(false)
                .license("A")
                .build();
    }
}
