package code._4_student_effort.fourthchallenge;

public class Car {

    private Long km;
    private Integer anFabricatie;

    public Car(Long km, Integer anFabricatie) {
        this.km = km;
        this.anFabricatie = anFabricatie;
    }

    public void setKm(Long km) {
        this.km = km;
    }

    public void setAnFabricatie(Integer anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public Long getKm() {
        return km;
    }

    public Integer getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public String toString() {
        return "Car{" +
                "km=" + km +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
