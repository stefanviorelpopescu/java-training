package code._4_student_effort.observer;

public class Main {
    public static void main(String [] args){
        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Ionescu");
        Student s03 = new Student("Dragomiresccu");

        teacher.register(s01);
        teacher.register(s02);
        teacher.register(s03);

        String [] javaTopics = new String[]{
                "Basics",
                "Oo",
                "Design Patterns"
        };

        for (String topic : javaTopics) {
            teacher.notifyObservers(topic);
        }


    }

}
