package code._4_student_effort;

import code._2_challenge.hard._2_dringking_time.LogExecutionTime;

public interface IPerson {
    void walk();

    @LogExecutionTime
    void drink();

    String getName();
}
