package code._4_student_effort;

public class ObserverExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student1 s01 = new Student1("Popescu");
        Student1 s02 = new Student1("Ionescu");
        Student1 s03 = new Student1("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[] {
                "basics",
                "oo",
                "design patterns"
        };
        for (int i = 0; i <javaTopics.length; i++) {
            teacher.teach(javaTopics[i]);
        }
    }
}
