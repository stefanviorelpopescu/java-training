package builder_design_pattern;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Zahan", "Andrei")
                .age(26)
                .phone("0264654545")
                .address("Cluj Napoca")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Cristi", "Voicu")
                .age(42)
                .phone("0120120120")
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Ribeiro", "Sergio").build();

        System.out.println(user3);
    }
}
