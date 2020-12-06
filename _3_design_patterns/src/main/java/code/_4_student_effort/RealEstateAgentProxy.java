package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;

public class RealEstateAgentProxy implements RealEstateAgent {
    private Map<Apartament, Student> apartamentStudentMap = new HashMap<Apartament, Student>();

    @Override
    public void represent(Apartament apartament) {
        if (!apartamentStudentMap.containsValue(apartament)) apartamentStudentMap.put(apartament, null);
    }

    @Override
    public Apartament rent(Student student) {
        if (student.getName().trim().startsWith("P")) return null;

        if (apartamentStudentMap.containsValue(student)) {
            return getKey(apartamentStudentMap, student);
        } else {
            int minMonthlyRentCost= Integer.MAX_VALUE;
            Apartament apWithMinMonthlyRentCost = null;

             for (Apartament ap: apartamentStudentMap.keySet()) {
                if ( (ap.getMonthlyRentCost() <= student.getMoney()) &&
                        (ap.getMonthlyRentCost() < minMonthlyRentCost) &&
                        (apartamentStudentMap.get(ap) == null) ) {
                    minMonthlyRentCost = ap.getMonthlyRentCost();
                    apWithMinMonthlyRentCost = ap;
                }
            }
            if (apWithMinMonthlyRentCost != null) apartamentStudentMap.put(apWithMinMonthlyRentCost, student);

            return apWithMinMonthlyRentCost;
        }
    }

    public <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry: map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
