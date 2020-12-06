package code._4_student_effort._4_challenge_observer;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void CodeChallenge4(){
        Teacher teacher = new Teacher();
        Student student01 = new Student("Popescu");
        Student student02 = new Student("Ionescu");
        Student student03 = new Student("Dragomirescu");

        student01.listenTo(teacher);
        student02.listenTo(teacher);
        student03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };

        for (String javaTopic : javaTopics) {
            teacher.teach(javaTopic);
        }

    }

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 4 ----" + ANSI_RESET);
        CodeChallenge4();
    }
}
