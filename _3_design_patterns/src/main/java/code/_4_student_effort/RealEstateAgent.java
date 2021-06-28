package code._4_student_effort;

import java.util.Arrays;

public class RealEstateAgent {
    private Apartement[] apartements = new Apartement[0];

    public void represent(Apartement apartement) {
        this.apartements = Arrays.copyOf(this.apartements, this.apartements.length + 1);
        this.apartements[this.apartements.length - 1] = apartement;
    }

    public Apartement rent(Student student) {
        Apartement rentedAppartement = null;
        if (!student.getName().startsWith("P")) {
            for (int i = 0; i < apartements.length; i++) {
                if (this.apartements[i].getMonthlyRentCost() < student.getMoney()) {
                    rentedAppartement = this.apartements[i];
                }
            }
        }
        return rentedAppartement;
    }
}

