package clean.code.design_patterns.requirements;

import clean.code.design_patterns.requirements.person.Coursant;
import clean.code.design_patterns.requirements.person.Trainer;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private List<Coursant> coursantList;
    private Trainer trainer;
    private Instant startDate;
    private String zoomLink;

    public Course(String courseName, Trainer trainer) {
        this.courseName = courseName;
        this.trainer = trainer;
        this.startDate = Instant.now().plus(4, ChronoUnit.HOURS);
        this.coursantList = new ArrayList<>();
    }

    public Course(String courseName,Trainer trainer, ArrayList<Coursant> coursantList ) {
        this.courseName = courseName;
        this.coursantList = coursantList;
        this.startDate = Instant.now().plus(4, ChronoUnit.HOURS);
        this.trainer = trainer;
        this.zoomLink = "https://zoom.us/"+ RandomStringUtils.randomAlphabetic(1) + "/"+RandomStringUtils.random(11,false,true)+"?pwd="+RandomStringUtils.randomAlphanumeric(33);

    }

    public void getCourseDetails() {
        System.out.print("\n" + courseName + " starts at " + startDate + "on Zoom (link -> " + zoomLink +") with " + trainer.getTrainerName() + " and coursants: | ");
        for(Coursant coursant : coursantList)
            System.out.print(coursant.getCoursantName() + " | ");
        System.out.print("\n");
    }
}
