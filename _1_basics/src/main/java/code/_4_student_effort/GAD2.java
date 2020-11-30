package code._4_student_effort;

import java.util.ArrayList;

public class GAD2 {
    public void method(){

    }

    public void method(int n, String s, ArrayList<String> list){

    }

    public void method(Integer ... values){

    }

    public static void printDogInfo(Dog dog){
        System.out.println(dog.getName() + "is" + dog.getAge() + "years old" );
        dog.setName("Zdreanta");
    }


    public static void main(String[] args){
        Dog myDog = new Dog("Grivei", 2);
    }




    class Dog{
        String name;
        int age;

        public Dog(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    class Bulldog extends Dog implements Animal {

    }



}
