package clean.code.design_patterns.requirements.pattern2;

public class ComputerFactory {
    public static IComputer getComputer(String type, String cpu, String gpu, String ssd, String ram) {
        if("PC".equals(type))
            return new PC(cpu, gpu, ssd, ram);
        if("Server".equals(type))
            return new Server(cpu, gpu, ssd, ram);

        return null;
    }
}
