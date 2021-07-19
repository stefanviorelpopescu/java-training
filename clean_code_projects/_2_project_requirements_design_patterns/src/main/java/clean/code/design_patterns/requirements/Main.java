package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        Coach coach = new Coach();

        Player p01 = new Player("Robert");
        Player p02 = new Player("Gabriel");

        p01.listenTo(coach);
        p02.listenTo(coach);

        String[] instructions = new String[]{
                "Running, Sit-ups, Push-ups"
        };

        for(int i = 0; i < instructions.length; i++){
            coach.coaches(instructions[i]);
        }
    }
}
