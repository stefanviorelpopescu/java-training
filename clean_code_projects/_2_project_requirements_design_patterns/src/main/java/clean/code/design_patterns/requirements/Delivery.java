package clean.code.design_patterns.requirements;

public interface Delivery {

    String deliveryTime();
    String chooseDelivery();

    public class ExpressDelivery implements Delivery
    {
        @Override public String deliveryTime()
        {
            return "1-2 days";
        }

        @Override public String chooseDelivery()
        {
            return "Express";
        }
    }

    public class StandardDelivery implements Delivery
    {
        @Override public String deliveryTime()
        {
            return "4-8 days";
        }

        @Override public String chooseDelivery()
        {
            return "Standard";
        }
    }

    public class InStoreDelivery implements Delivery
    {
        @Override public String deliveryTime()
        {
            return "4-6 days";
        }

        @Override public String chooseDelivery()
        {
            return "In store";
        }
    }

    public class PickUpDelivery implements Delivery
    {
        @Override public String deliveryTime()
        {
            return "2-3 days";
        }

        @Override public String chooseDelivery()
        {
            return "Pick up point";
        }
    }

    public class DeliveryService {
        public static Delivery getDelivery(String type)
        {
            if ("Express".equals(type))
                return null;
            if ("Standard".equals(type)) {
                return new StandardDelivery();
            }
            else if ("In store".equals(type)) {
                return new InStoreDelivery();
            }
            else if ("Pick up point".equals(type)) {
                return new PickUpDelivery();
            }
            return null;

        }
    }

}
