package code._4_student_effort._hardcode_challenge_1;

public interface IPerson {
    void walk();

    @LogExecutionTime
    void drink();

    String getName();
}
