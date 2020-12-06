package code._4_student_effort;

public class RealEstateAgentProxy implements EstateAgent {

    private RealEstateAgent realEstateAgent = new RealEstateAgent();

    public RealEstateAgentProxy() {
    }

    @Override
    public void represent(Apartment apartment) {

        realEstateAgent.represent(apartment);

    }

    @Override
    public Apartment rent(Student student) {

        Apartment rentedApartment = null;

        if(!student.getName().startsWith("P")){
            rentedApartment = realEstateAgent.rent(student);
        }

    return rentedApartment;
    }
}
