package clean.code.design_patterns.requirements.pattern1;

public class ComputerBuilderMain {
    public static void main(String[] args) {
        ComputerBuilder myComputer = new ComputerBuilder.TheBuilder(
                "AMD Ryzen R7 5800x", "Nvidia Geforce GTX 3080", "1 TB", "32 GB 3200MHz")
                .setWifiCard(true).build();
    }
}
