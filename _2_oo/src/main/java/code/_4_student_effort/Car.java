package code._4_student_effort;

public class Car {
    private int speed;
    private int topSpeed;
    private int steeringWheelPosition; //-1 is left , 0 is straight, 1 is right
    private String brand;
    private String color;

    public Car(int topSpeed, String brand, String color) {
        this.speed = 0;
        this.topSpeed = topSpeed;
        this.steeringWheelPosition = 0;
        this.brand = brand;
        this.color = color;
    }

    public void accelerate(){
        if(speed <= topSpeed - 10){
            this.speed += 10;
        }
        else if(speed > topSpeed - 10 && speed <= topSpeed){
            this.speed = topSpeed;
        }
        else {
            System.out.println("Already at top speed");
        }
    }
    public void breaking(){
        if(speed >= 10){
            this.speed -= 10;
        }
        else if(speed < 10 && speed > 0){
            this.speed = 0;
        }
        else {
            System.out.println("Car is stopped");
        }
    }

    public void turnSteeringWheel(String position){
        switch (position){
            case "left":{
                this.steeringWheelPosition = -1;
                break;
            }
            case "right":{
                this.steeringWheelPosition = 1;
                break;
            }
            case "straight":{
                this.steeringWheelPosition = 0;
                break;
            }
        }
    }
}
