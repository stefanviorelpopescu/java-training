package _4_student_effort.third_challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RealEstateAgentProxy {
    private ArrayList<Apartament> apartamente;

    public RealEstateAgentProxy() {
        apartamente = new ArrayList<>();
    }

    void represent(Apartament apartment) {
        apartamente.add(apartment);
    }

    Apartament rent (Student student) {
        Apartament desiredApp = null;
        if (!(student.getName().charAt(0) == 'P')) {
            for (Apartament tempApp : apartamente) {
                if (tempApp.getMonthlyRentCost() < student.getMoney()) {
                    desiredApp = tempApp;
                }
            }
        }
        apartamente.remove(desiredApp);
        return desiredApp;
    }
}
