package clean.code.design_patterns.requirements;


import clean.code.design_patterns.requirements.PetAdoption.Builder;
import clean.code.design_patterns.requirements.AdditionalInfo;
import clean.code.design_patterns.requirements.Delivery.DeliveryService;


public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package

        //Builder
        AdditionalInfo information = new AdditionalInfo.Builder().AnimalBreed("Husky")
                .MedicalHistory("No")
                .PlaceFound("New Jersey")
                .TimeInShelter(2)
                .build();


        PetAdoption firstPet = new PetAdoption.Builder().IdMicrochip(122)
                .AnimalType("DOG")
                .Age(4)
                .AdditionalInfo(information)
                .build();


        //Factory

        DeliveryService delivery= new DeliveryService();
        Delivery deliveryType=delivery.getDelivery("Express");



    }
}
