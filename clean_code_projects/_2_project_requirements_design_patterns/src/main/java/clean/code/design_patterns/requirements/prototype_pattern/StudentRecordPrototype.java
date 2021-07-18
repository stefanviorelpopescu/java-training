package clean.code.design_patterns.requirements.prototype_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentRecordPrototype {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader((new InputStreamReader(System.in)));

        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(buffer.readLine());

        System.out.print("Enter student name: ");
        String name = buffer.readLine();

        System.out.print("Enter student birthdate: ");
        String birthdate = buffer.readLine();

        System.out.print("Enter student classroom: ");
        String classroom = buffer.readLine();

        StudentRecord student1 = new StudentRecord(id, name, birthdate, classroom);

        System.out.println("Student 1");
        System.out.println("ID: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Birthdate: " + student1.getBirthdate());
        System.out.println("Classroom: " + student1.getClassroom());

        StudentRecord student2 = (StudentRecord) student1.clone();

        System.out.println("Student 2");
        System.out.println("ID: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Birthdate: " + student1.getBirthdate());
        System.out.println("Classroom: " + student1.getClassroom());
    }
}
