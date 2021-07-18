package Controller;

import Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    List<Student> students;

    public StudentController(){
        students=new ArrayList<>();
    }

    public Student get(String name,String lastName){
        for(Student student: students){
            if(student.getName().equals(name) && student.getLastName().equals(lastName))
                return student;
        }

        return null;
    }

    public void add(Student student){
        students.add(student);
    }

    public void remove(Student student){
        if(students.contains(student))
            students.remove(student);
    }

    public void display(){
        for(Student student:students){
            System.out.println(student);
        }
    }
}
