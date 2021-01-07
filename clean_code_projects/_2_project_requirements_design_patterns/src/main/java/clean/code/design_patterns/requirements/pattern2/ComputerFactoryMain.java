package clean.code.design_patterns.requirements.pattern2;

public class ComputerFactoryMain {
    public static void main(String[] args) {
        IComputer myPC = ComputerFactory.getComputer("PC", "AMD Ryzen R7 5800x", "Nvidia Geforce GTX 3080", "1 TB", "32 GB 3200MHz");
        IComputer myServer = ComputerFactory.getComputer("Server", "2 x AMD EPYC 7451", "4 x NVIDIA Tesla V100 32GB", "1 TB", "512 GB 3200Mhz ECC");
    }
}
