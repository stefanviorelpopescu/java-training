package first_challenge;

public class BoxingMatch {

    private Fighter player1;
    private Fighter player2;

    public BoxingMatch() { }

    public BoxingMatch(Fighter player1, Fighter player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String fight() {
        while (player1.getHealth() != 0  && player2.getHealth() != 0) {
            player1.fight(player2);
            player2.fight(player1);
        }

        if (player1.getHealth() == 0)
            return player2.getName();
        else // player2.getHealth() == 0
            return player1.getName();
    }
}
