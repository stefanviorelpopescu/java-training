package code._3_in_class;

public class BuilderExample {

    public static void main(String[] args) {
        Person person01 = new Person.Builder("Popescu")
                .job("java developer")
                .university("FMI")
                .isMarried(0)
                .build();

        Person person02 = new Person.Builder("Ionescu")
                .drivingLicense("B")
                .isMarried(1)
                .build();
    }
}

