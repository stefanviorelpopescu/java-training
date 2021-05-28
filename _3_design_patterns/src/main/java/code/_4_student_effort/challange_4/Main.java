package code._4_student_effort.challange_4;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s1 = new Student("Popescu");
        Student s2 = new Student("Ionescu");
        Student s3 = new Student("Dragomirescu");

        teacher.register(s1);
        teacher.register(s2);
        teacher.register(s3);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };

        for (int i = 0; i < javaTopics.length; i++){
            teacher.notifyObservers(javaTopics[i]);
        }
    }
}
