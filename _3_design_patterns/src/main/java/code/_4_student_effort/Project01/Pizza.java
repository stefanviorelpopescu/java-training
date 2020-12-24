package code._4_student_effort.Project01;

public class Pizza {

        private final String dough; //required
        private final String ingredient1; //required
        private final String ingredient2; //optional
        private final String ingredient3; //optional
        private final String ingredient4; //optional
        private final String ingredient5; //optional

        public Pizza(Builder builder) {
            this.dough = builder.dough;
            this.ingredient1 = builder.ingredient1;
            this.ingredient2 = builder.ingredient2;
            this.ingredient3 = builder.ingredient3;
            this.ingredient4 = builder.ingredient4;
            this.ingredient5 = builder.ingredient5;
        }

        //All getter, and NO setter to provde immutability
        public String getDough() {
            return dough;
        }

        public String getIngredient1() {
            return ingredient1;
        }

        public String getIngredient2() {
            return ingredient2;
        }

        public String getIngredient3() {
            return ingredient3;
        }

        public String getIngredient4() {
            return ingredient4;
        }

        public String getIngredient5() {
            return ingredient5;
        }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", ingredient1='" + ingredient1 + '\'' +
                ", ingredient2='" + ingredient2 + '\'' +
                ", ingredient3='" + ingredient3 + '\'' +
                ", ingredient4='" + ingredient4 + '\'' +
                ", ingredient5='" + ingredient5 + '\'' +
                '}';
    }

        public static class Builder {
            final String dough; //required
            final String ingredient1; //required
            String ingredient2; //optional
            String ingredient3; //optional
            String ingredient4; //optional
            String ingredient5; //optional

            public Builder(String dough, String ingredient1){
                this.dough=dough;
                this.ingredient1=ingredient1;
            }

            public Builder ingredient2(String ingredient2){
                this.ingredient2=ingredient2;
                return this;
            }

            public Builder ingredient3(String ingredient3){
                this.ingredient3=ingredient3;
                return this;
            }

            public Builder ingredient4(String ingredient4){
                this.ingredient4=ingredient4;
                return this;
            }
            public Builder ingredient5(String ingredient5){
                this.ingredient5=ingredient5;
                return this;
            }

            public Pizza build(){
                Pizza pizza = new Pizza (this);
                return pizza;
            }
        }
    }


