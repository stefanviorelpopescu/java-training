package code._5_project.Builder;

/*Consider a scenario in which there is a certification website and they want to ask a person their personal information.
The person recieves a form that has multiple questions, but only their first name and last name are mandatory.
The website wants to save this information in an immutable object. The form has multiple questions and people can choose to answer only some of them.
The problem is that it is not practical to create a constructor with different combinations.
We can solve the issues with large number of parameters by providing a constructor with required parameters and then different setter methods
to set the optional parameteres. Builder pattern solves the issue byproviding a way to build the object step by step and provide a
method that will return the final Object;*/

public class Client {
    public static void main(String[] args) {

    Person p1=new Person.PersonBuilder("Ana","Lili").setAge(23).setGender("F").setCity("Timisoara").build();
    Person p2=new Person.PersonBuilder("Alin","Lala").setWorking(true).setSalary(4500).setExperience(4).build();
    System.out.println(p1);
    }
}
