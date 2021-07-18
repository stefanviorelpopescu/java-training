package clean.code.design_patterns.requirements;


public class PetAdoption {

    private final int IdMicrochip;
    private final String AnimalType;
    private final int Age;
    private final AdditionalInfo AdditionalInfo;

    public int getIdMicrochip()
    {
        return IdMicrochip;
    }

    public String getAnimalType()
    {
        return AnimalType;
    }

    public int Age()
    {
        return Age;
    }

    public void show()
    {
        System.out.println(IdMicrochip);
        System.out.println(AnimalType);
        System.out.println(Age);
        System.out.println(AdditionalInfo);
    }

    public AdditionalInfo getAdditionalInfo()
    {
        return AdditionalInfo;
    }
    private PetAdoption(Builder builder)
    {
        this.IdMicrochip= builder.IdMicrochip;
        this.AnimalType=builder.AnimalType;
        this.Age= builder.Age;
        this.AdditionalInfo= builder.AdditionalInfo;
    }

    public static class Builder
    {
        private int IdMicrochip;
        private String AnimalType;
        private int Age;
        private AdditionalInfo AdditionalInfo;

        public Builder IdMicrochip(final int IdMicrochip)
        {
            this.IdMicrochip=IdMicrochip;
            return this;
        }

        public Builder AnimalType(final String AnimalType)
        {
            this.AnimalType=AnimalType;
            return this;
        }

        public Builder Age(final int Age)
        {
            this.Age=Age;
            return this;
        }

        public Builder AdditionalInfo(final AdditionalInfo AdditionalInfo)
        {
            this.AdditionalInfo=AdditionalInfo;
            return this;
        }

        public PetAdoption build()
        {
            return new PetAdoption(this);
        }

    }
}
