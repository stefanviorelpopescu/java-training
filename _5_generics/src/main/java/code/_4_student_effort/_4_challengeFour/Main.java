package code._4_student_effort._4_challengeFour;

public class Main {
    // https://github.com/AndreiZahan/BookProject/tree/main/src/main/java/org/sci/util - example of own implementation for a different Iterator

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        Bike[] bikes = new Bike[5];

        for (int i = 0; i < 5; i++) {
            cars[i] = new Car(i+1, "volkswagen");
            bikes[i] = new Bike(i + 1, "aprilia");
        }

        IArrayIterator<Car> carIArrayIterator = new ArrayIterator<>(cars);
        while (carIArrayIterator.hasNext()) {
            System.out.println(carIArrayIterator.next());
        }

        IArrayIterator<Bike> bikeIArrayIterator = new ArrayIterator<>(bikes);
        while (bikeIArrayIterator.hasNext()) {
            System.out.println(bikeIArrayIterator.next());
        }
    }
}
