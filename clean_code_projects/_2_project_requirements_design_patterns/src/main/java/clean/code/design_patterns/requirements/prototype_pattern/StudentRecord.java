package clean.code.design_patterns.requirements.prototype_pattern;

public class StudentRecord implements Cloneable {

    private int id;
    private String name;
    private String birthdate;
    private String classroom;

    public StudentRecord() { }

    public StudentRecord(int id, String name, String birthdate, String classroom) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public StudentRecord clone() {
        return new StudentRecord();
    }

    public static void main(String[] args) {
        //TODO implement your design patterns in this package
    }
}
