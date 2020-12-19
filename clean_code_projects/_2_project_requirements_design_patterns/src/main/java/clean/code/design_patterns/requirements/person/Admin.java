package clean.code.design_patterns.requirements.person;

import clean.code.design_patterns.requirements.Course;
import clean.code.design_patterns.requirements.ITCompany;

public class Admin implements Person {
    private String username;

    private ITCompany company = ITCompany.getInstance("NextGen Trainings");

    public Admin(String username) {
        this.username = username;
        System.out.println(company);
    }

    @Override
    public void showPersonDetails() {
        showAllTrainers();
        showAllCoursants();

    }

    public void addTrainer(Trainer trainer) {
        company.getTrainers().add(trainer);
    }


    public void addCoursant(Coursant coursant) {
        company.getCoursants().add(coursant);
    }

    public void addCourse(Course course) {
        company.getCourses().add(course);
    }

    public void showAllCourses() {
        System.out.println("---------All company courses--------- ");
       company.getCourses().stream().forEach(course -> course.getCourseDetails());
    }

    public void showAllTrainers() {
        System.out.println("---------All company trainers--------- ");
        company.getTrainers().stream().forEach(trainer -> trainer.showPersonDetails());
    }

    public void showAllCoursants() {
        System.out.println("---------All company coursants--------- ");
        company.getCoursants().stream().forEach(coursant -> coursant.showPersonDetails());
    }
}
