package code._4_student_effort.observer;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Smith");
        Student s02 = new Student("Williams");
        Student s03 = new Student("Davies");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{"basics", "oo", "design patterns"};

        for (int i = 0; i < javaTopics.length; i++) {
            teacher.teach(javaTopics[i]);
        }
    }
}
