package clean.code.design_patterns.requirements;

import clean.code.design_patterns.requirements.person.Admin;
import clean.code.design_patterns.requirements.person.Coursant;
import clean.code.design_patterns.requirements.person.Trainer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* Used 2 Design Patterns
- Singleton for Company Class
- Composite for Employees, Coursants and a composite Class with manages the other classes, named Admin

used both imperative and funtional programming
 */



public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    private static boolean IS_LOGGED = false;
    private static ITCompany company = ITCompany.getInstance("NextGen Trainings" );   // Singleton Pattern
    private static Admin admin;
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to " + company.getCompanyName());

        login();

        if(IS_LOGGED){
            // adding data
            //Trainers
            Trainer trainer1 = new Trainer("Danut Moldovan", 33, "Java");
            Trainer trainer2 = new Trainer("Ivantie Gheorghiu", 29, "Python");
            Trainer trainer3 = new Trainer("Sandu Niculaie", 31, "C#");

            admin.addTrainer(trainer1);
            admin.addTrainer(trainer2);
            admin.addTrainer(trainer3);

            //Coursants
            Coursant coursant1 = new Coursant("Timotei Munteanu", 20, "Student");
            Coursant coursant2 = new Coursant("Emanuel Baboescu", 23, "Student");
            Coursant coursant3 = new Coursant("Codrin Ungur", 26, "Employee");
            Coursant coursant4= new Coursant("Nic Tudor", 41, "Employee");
            Coursant coursant5 = new Coursant("Rares Moldovanu", 35, "Employee");
            Coursant coursant6 = new Coursant("Viorel Iagar", 48, "Employee");
            Coursant coursant7= new Coursant("Arsenie Corbeanu", 35, "Unemployed");

            admin.addCoursant(coursant1);
            admin.addCoursant(coursant2);
            admin.addCoursant(coursant3);
            admin.addCoursant(coursant4);
            admin.addCoursant(coursant5);
            admin.addCoursant(coursant6);
            admin.addCoursant(coursant7);



            // Courses
            Course course1 = new Course("Java 8 Course", trainer1, new ArrayList<Coursant>(Arrays.asList(coursant1,coursant4,coursant6)));
            Course course2 = new Course("Python Machine Learning Course", trainer2, new ArrayList<Coursant>(Arrays.asList(coursant2,coursant3, coursant5)));
            Course course3= new Course("C# and .NET Course", trainer3, new ArrayList<Coursant>(Arrays.asList(coursant2,coursant4,coursant7)));


            admin.addCourse(course1);
            admin.addCourse(course2);
            admin.addCourse(course3);


            showMenu();
        }
    }


    private static void login() throws IOException {
        Map<String, String> usersData = new HashMap<>();
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "clean_code_projects\\" +
                        "_2_project_requirements_design_patterns\\" +
                        "src\\" +
                        "main\\" +
                        "java\\" +
                        "clean\\code\\design_patterns\\requirements\\" +
                        "db\\" +
                        "users_data.txt"));
        while((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(":");
            usersData.put(words[0], words[1]);
        }

        int chancesLeft = 4;
        System.out.println("\nPlease Enter Your Credentials:");

        while ( chancesLeft != 0 ) {
            System.out.print("username:");
            String username = scanner.nextLine();
            System.out.print("password:");
            String password = scanner.nextLine();

            boolean validated = Optional.ofNullable(usersData.get(username)).stream()
                    .anyMatch(s -> s.contains(password)); // funtional

            if ( validated ) {
                System.out.println("\nLogin Successful");
                IS_LOGGED = true;
                admin = new Admin(username);
                break;
            }
            else {
                chancesLeft--;
                if( chancesLeft == 0) {
                    System.out.println("IP Banned, please contact support");
                    break;
                }
                System.out.println("\nInvalid Credentials, please try again. You have " + chancesLeft + " chances left");
            }
        }
    }

    private static void showMenu() {
        String name;
        int age;

        System.out.println("---------------Menu---------------");
        System.out.println("1. Print all courses");
        System.out.println("2. Print all trainers");
        System.out.println("3. Print all coursants");
        System.out.println("4. Add a new trainer");
        System.out.println("5. Add a new coursant");
        System.out.println("6. Show all persons from company ");

        String userInput = scanner.nextLine();

        switch(userInput) {
            case "1":
            {
                admin.showAllCourses();
                break;
            }
            case "2":
            {
                admin.showAllTrainers();
                break;
            }
            case "3":
            {
                admin.showAllCoursants();
                break;
            }
            case "4":
            {
                System.out.print("\n----------------Adding new Trainer to Company----------------");
                System.out.print("\nPlease enter Trainer name: ");
                name = scanner.nextLine();
                System.out.print("\nPlease enter Trainer age: ");
                age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("\nPlease enter Trainer proficient Language: ");
                String language = scanner.nextLine();

                admin.addTrainer(new Trainer(name,age,language));
                break;
            }
            case "5":
            {
                System.out.print("\n----------------Adding new Coursant to Company----------------");
                System.out.print("\nPlease enter Coursant name: ");
                name = scanner.nextLine();
                System.out.print("\nPlease enter Coursant age: ");
                age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("\nPlease enter Coursant occupation: ");
                String occupation = scanner.nextLine();

                admin.addCoursant(new Coursant(name,age,occupation));
                break;
            }

            case "6":
            {
                admin.showPersonDetails();
                break;
            }

            default:
                System.out.println("Invalid Input");
        }
        System.out.print("\nDo you want to do another operation? ( YES / NO )\nInput:");
        userInput = scanner.nextLine();
        if(userInput.toUpperCase().equals("YES"))
            showMenu();
        else
            System.exit(0);
    }
}
