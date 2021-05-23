package code._4_student_effort.Challenge2;

public class Prize {

    private String name;
    private int year;

    public Prize(String name, int year){
       this.name=name;
       this.year=year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
