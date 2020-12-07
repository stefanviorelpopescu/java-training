package code._4_student_effort.challenge3;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    void represent(Apartment apartment) {
        Apartment[] newApartments = new Apartment[this.apartments.length + 1];
        System.arraycopy(this.apartments,  0, newApartments, 0, this.apartments.length);
        this.apartments = newApartments;
        this.apartments[this.apartments.length-1] = apartment;
    }

    Apartment rent(Student student) {
        Apartment toBeRented = null;
        if(!student.getName().startsWith("P")) {
            for (int i = 0; i < apartments.length; i++) {
                if (this.apartments[i].getMonthlyRentCost() < student.getMoney()) {
                    toBeRented = this.apartments[i];
                    System.arraycopy(this.apartments, i+1, this.apartments, i, this.apartments.length- i - 1);
                }
            }
        }
        return toBeRented;
    }
}
