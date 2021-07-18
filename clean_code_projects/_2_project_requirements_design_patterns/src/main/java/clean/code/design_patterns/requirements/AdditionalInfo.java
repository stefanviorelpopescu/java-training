package clean.code.design_patterns.requirements;


public class AdditionalInfo {

    private final String AnimalBreed;
    private final String MedicalHistory;
    private final String PlaceFound;
    private final int TimeInShelter;

    public String AnimalBreed() {
        return AnimalBreed;
    }

    public String MedicalHistory() {
        return MedicalHistory;
    }

    public String PlaceFound() {
        return PlaceFound;
    }

    public int TimeInShelter() {
        return TimeInShelter;
    }

    private AdditionalInfo(Builder builder) {
        this.AnimalBreed = builder.AnimalBreed;
        this.MedicalHistory = builder.MedicalHistory;
        this.PlaceFound = builder.PlaceFound;
        this.TimeInShelter = builder.TimeInShelter;
    }


    public static class Builder {
        private String AnimalBreed;
        private String MedicalHistory;
        private String PlaceFound;
        private int TimeInShelter;

        public AdditionalInfo.Builder AnimalBreed(final String AnimalBreed) {
            this.AnimalBreed = AnimalBreed;
            return this;
        }

        public AdditionalInfo.Builder MedicalHistory(final String MedicalHistory) {
            this.MedicalHistory = MedicalHistory;
            return this;
        }

        public AdditionalInfo.Builder PlaceFound(final String PlaceFound) {
            this.PlaceFound = PlaceFound;
            return this;
        }

        public AdditionalInfo.Builder TimeInShelter(final int TimeInShelter) {
            this.TimeInShelter = TimeInShelter;
            return this;
        }

        public AdditionalInfo build() {
            return new AdditionalInfo(this);
        }
    }
}
