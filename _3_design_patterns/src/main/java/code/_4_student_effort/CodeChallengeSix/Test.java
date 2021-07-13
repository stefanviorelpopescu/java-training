package code._4_student_effort.CodeChallengeSix;

public class Test {
    public static void main(String[] args)
    {Person person1=new Person.Builder("Dorel").job("nu am").university("Poli").isMarried(true)
            .drivingLicense("Cat B").build();
        Person person2=new Person.Builder("Gigi").job("WellCode").university("Vest").isMarried(false)
                .drivingLicense("Cat B").build();
    }
}
