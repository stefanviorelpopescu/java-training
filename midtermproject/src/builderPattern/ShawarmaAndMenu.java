package builderPattern;

import java.util.HashMap;



    public class ShawarmaAndMenu {

        private static int price=0;
        private String sauces,meat,wrap,vegetables;
        private boolean onPlate,menu;

        public ShawarmaAndMenu(Builder builder)
        {
            this.onPlate=builder.onPlate;
            this.sauces=builder.sauces;
            this.meat=builder.meat;
            this.wrap= builder.wrap;
            this.vegetables=builder.vegetables;
            this.menu=builder.menu;
        }

        public int getPrice() {
            return price;
        }

        static class Builder{
            private HashMap<String,Integer> menuPrice=new HashMap<>();
            private String sauces,meat,wrap,vegetables;
            private boolean onPlate,menu;


            public Builder(boolean onPlate)
            {this.onPlate=onPlate;}

            public Builder sauces(String sauces)
            {
                this.sauces=sauces;
                return  this;
            }
            public Builder meat(String meat)
            {
                this.meat=meat;
                if(meat.equals("Vita"))
                    price+=2;
                if(meat.equals("Amestec"))
                    price+=4;
                return this;
            }
            public Builder wrap(String wrap){
                this.wrap=wrap;
                if(wrap.equals("Mica"))
                    price=9;
                if(wrap.equals("Medie"))
                    price=12;
                if(wrap.equals("Mare"))
                    price=15;
                return this;
            }
            public Builder vegetables(String vegetables){
                this.vegetables=vegetables;
                return this;
            }
            public Builder menu(Boolean menu){
                this.menu=menu;
                if(menu)
                    price+=4;
                return this;
            }
            public ShawarmaAndMenu build(){
                return new ShawarmaAndMenu(this);
            }

        }}

