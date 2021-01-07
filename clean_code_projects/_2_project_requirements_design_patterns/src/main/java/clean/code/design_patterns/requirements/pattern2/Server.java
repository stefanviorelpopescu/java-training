package clean.code.design_patterns.requirements.pattern2;

public class Server implements IComputer {
    private final String CPU;
    private final String GPU;
    private final String SSD;
    private final String RAM;

    Server(String cpu, String gpu, String ssd, String ram) {
        this.CPU = cpu;
        this.GPU = gpu;
        this.SSD = ssd;
        this.RAM = ram;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public String getGPU() {
        return this.GPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getSSD() {
        return this.SSD;
    }
}
