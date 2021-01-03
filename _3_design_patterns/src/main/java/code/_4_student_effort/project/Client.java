package code._4_student_effort.project;

public class Client {

    public double budget;
    public String name;

    public Client (String name, double budget){
        this.name=name;
        this.budget=budget;
    }
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
