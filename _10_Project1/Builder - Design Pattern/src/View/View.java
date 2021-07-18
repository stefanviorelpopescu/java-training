package View;

import Controller.StudentController;
import Model.Student;

import java.util.Scanner;

public class View {

    StudentController controller=new StudentController();

    Scanner keyboard=new Scanner(System.in);


    public void menu(){
        System.out.println("-----Welcome-----");
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. List all students");
        System.out.println("4. Exit");
    }

    public void play(){

        boolean valid=false;

        menu();
        while(!valid){
            int choice=Integer.parseInt(keyboard.nextLine());
            switch(choice){
                case 1:
                    addStudent();
                    menu();
                    break;
                case 2:
                    removeStudent();
                    menu();
                    break;
                case 3:
                    listAllStudents();
                    menu();
                    break;
                case 4:
                    System.out.println("Goodbye");
                    valid=true;
                default:
                    System.out.println("Thank you for using the app!");
            }
        }
    }

    private void listAllStudents() {
        controller.display();
    }

    public void addStudent(){
        //Required
        String name;
        String lastName;
        int age;

        //Optional
        String faculty;
        int yearOfStudy;
        boolean isPaying;
        boolean graduate;

        String choice;

        //Enter the required attributes for the student object
        System.out.println("Enter the name of the student: ");
        name=keyboard.nextLine();
        System.out.println("Enter the last name of the student: ");
        lastName=keyboard.nextLine();
        System.out.println("Enter the age of the student: ");
        age=Integer.parseInt(keyboard.nextLine());

        //Enter the optional attributes  for the stuent object
        //If we don't want to set any optional attribute, the values will be 0 (for int), null (for string), false (for boolean)

        System.out.println("Add faculty? [Y/N]");
        choice=keyboard.nextLine();
        if(choice.equalsIgnoreCase("y")){
            System.out.println("Enter the name of the faculty: ");
            faculty=keyboard.nextLine();
        }else{
            faculty=null;
        }
        System.out.println("Add year of study? [Y/N]");
        choice=keyboard.nextLine();
        if(choice.equalsIgnoreCase("y")){
            System.out.println("Enter year of study: ");
            yearOfStudy=Integer.parseInt(keyboard.nextLine());
        }else{
            yearOfStudy=0;
        }
        System.out.println("Set paying? [Y/N]");
        choice=keyboard.nextLine();
        if(choice.equalsIgnoreCase("y")){
            isPaying=true;
        }else{
            isPaying=false;
        }
        System.out.println("Is the student a graduate? [Y/N]");
        choice= keyboard.nextLine();
        if(choice.equalsIgnoreCase("y")){
            graduate=true;
        }else{
            graduate=false;
        }


        Student student=new Student.Builder(name,lastName,age)
                .setFaculty(faculty)
                .setYearOfStudy(yearOfStudy)
                .setPaying(isPaying)
                .setGraduate(graduate)
                .build();

        controller.add(student);
    }

    public void removeStudent(){
        String name;
        String lastName;

        System.out.println("Enter the name of the student:");
        name=keyboard.nextLine();
        System.out.println("Enter the last name of the student:");
        lastName=keyboard.nextLine();

        Student student= controller.get(name,lastName);

        controller.remove(student);

    }
}
