public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle.Builder("Ford")
                .type("car")
                .doors(5)
                .wheels(4)
                .currentDirection(180)
                .currentVelocity(60)
                .build();

        Vehicle bike = new Vehicle.Builder("Cube")
                .type("bike")
                .doors(0)
                .wheels(2)
                .currentDirection(90)
                .currentVelocity(15)
                .build();
        System.out.println(bike);
        System.out.println(car);
        bike.stop();
        System.out.println(bike);
    }
}
