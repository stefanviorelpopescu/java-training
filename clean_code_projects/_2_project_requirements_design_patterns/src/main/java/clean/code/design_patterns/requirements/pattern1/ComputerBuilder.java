package clean.code.design_patterns.requirements.pattern1;

public class ComputerBuilder {

    //required parameters
    private String CPU;
    private String GPU;
    private String SSD;
    private String RAM;

    //optional parameters
    private boolean extraHDD;
    private boolean wifiCard;


    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public String getSSD() {
        return SSD;
    }

    public boolean isExtraHDD() {
        return extraHDD;
    }

    public boolean isWifiCard() {
        return wifiCard;
    }

    private ComputerBuilder(TheBuilder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.SSD = builder.SSD;
        this.RAM = builder.RAM;

        this.extraHDD = builder.extraHDD;
        this.wifiCard = builder.wifiCard;
    }

    //Builder Class
    public static class TheBuilder {

        //required parameters
        private String CPU;
        private String GPU;
        private String SSD;
        private String RAM;

        //optional parameters
        private boolean extraHDD;
        private boolean wifiCard;

        public TheBuilder(String cpu, String gpu, String ssd, String ram) {
            this.CPU = cpu;
            this.GPU = gpu;
            this.SSD = ssd;
            this.RAM = ram;
        }

        public TheBuilder setExtraHDD(boolean extraHDD) {
            this.extraHDD = extraHDD;
            return this;
        }

        public TheBuilder setWifiCard(boolean wifiCard) {
            this.wifiCard = wifiCard;
            return this;
        }

        public ComputerBuilder build() {
            return new ComputerBuilder(this);
        }

    }
}
