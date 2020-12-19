package clean.code.design_patterns.requirements;

import clean.code.design_patterns.requirements.person.Coursant;
import clean.code.design_patterns.requirements.person.Trainer;

import java.util.ArrayList;
import java.util.List;

public class ITCompany {

    private static ITCompany single_instance = null;

    private String companyName;
    private List<Course> courses;
    private List<Trainer> trainers;
    private List<Coursant> coursants;


    private ITCompany(String companyName) {
        this.companyName = companyName;
        this.courses = new ArrayList<>();
        this.trainers = new ArrayList<>();
        this.coursants = new ArrayList<>();
    }

    public static ITCompany getInstance(String companyName)
    {
        if( single_instance == null )
            single_instance = new ITCompany(companyName);
            return single_instance;
    }

    public String getCompanyName() {
        return companyName;
    }


    public List<Course> getCourses() {
        return courses;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public List<Coursant> getCoursants() {
        return coursants;
    }
}
