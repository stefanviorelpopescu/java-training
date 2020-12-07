package code._4_student_effort;

public class StudentCC4 implements Observer{
    String name;
    StudentCC4(String name){
        this.name = name;
    }
    void listenTo(Teacher teacher){
        teacher.stud.add(this);
    }
    @Override
    public void update(String message){
        this.name = message;
    }
}
