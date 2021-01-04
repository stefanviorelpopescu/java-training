package Project;

public class main {

    public static void main(String[] args) {
        // In proiect am folosit design pattern Observer si Singleton
        // Am incercat sa creez mai multe statii meteo ce primesc valori de la senzori si le trimit mai departe unde afisez modificarile
        // parametrilor pe display.
        Display display = Display.getInstance();
        Sensor sensor = new Sensor("Temperature");
        Sensor sensor1 = new Sensor("Humidity");
        Sensor sensor2 = new Sensor("CO2");
        Sensor sensor3 = new Sensor("Pressure");
        WeatherStation weatherStation = new WeatherStation("S2819");

        weatherStation.registerObserver(display);

        sensor.registerObserver(weatherStation);
        sensor1.registerObserver(weatherStation);
        sensor2.registerObserver(weatherStation);
        sensor3.registerObserver(weatherStation);

        sensor.setSensorMeasurement(57);
        sensor1.setSensorMeasurement(90);
        sensor2.setSensorMeasurement(20);
        sensor3.setSensorMeasurement(0);
        sensor2.setSensorMeasurement(30);
        sensor1.setSensorMeasurement(60);
        sensor3.setSensorMeasurement(0);

        Sensor sensor4 = new Sensor("Temperature");
        Sensor sensor5 = new Sensor("Humidity");
        Sensor sensor6 = new Sensor("CO2");
        Sensor sensor7 = new Sensor("Pressure");
        WeatherStation weatherStation2 = new WeatherStation("SB2471");
        weatherStation2.registerObserver(display);

        sensor4.registerObserver(weatherStation2);
        sensor5.registerObserver(weatherStation2);
        sensor6.registerObserver(weatherStation2);
        sensor7.registerObserver(weatherStation2);

        sensor4.setSensorMeasurement(25);
        sensor4.setSensorMeasurement(37);
        sensor5.setSensorMeasurement(82);
        sensor6.setSensorMeasurement(40);
        sensor7.setSensorMeasurement(80);





    }
}
