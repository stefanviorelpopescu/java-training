package exercises.Challenge1;

public class BoxingMatch {

        private Fighter fighter1;
        private Fighter fighter2;

        public BoxingMatch(Fighter fighter1, Fighter fighter2) {
            this.fighter1 = fighter1;
            this.fighter2 = fighter2;
        }

        public String fight() {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.attack(fighter2);
                fighter2.attack(fighter1);
            }
            if (fighter1.health <= 0) {
                return fighter1.name;
            } else {
                return fighter2.name;
            }
        }

        public static void main(String[] args) {
            Fighter fighter1 = new Fighter("Fighter1", 340, 9);
            Fighter fighter2 = new Fighter("Fighter2", 170, 10);
            BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
            String winner = boxingMatch.fight();
            System.out.println(winner);
        }


}
