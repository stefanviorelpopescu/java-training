package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {

    private List<Apartment> appartments = new ArrayList<>();

    public void represent(Apartment appartment) {
        appartments.add(appartment);
    }

    public Apartment rent(Student student) {
        Apartment toRent = null;

        int index=0;
        if (!student.getName().startsWith("P")) {
            for (Apartment app: appartments) {
                if (app.getMoney() < student.getMoney()) {
                    toRent = app;
                    appartments.remove(app);
                    break;
                }
            }
        }

        return toRent;
    }
}
