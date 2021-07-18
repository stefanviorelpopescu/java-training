public class Main {
    public static void main(String[] args) {


        Computer pc = ComputerFactory.getComputer("PC","8 GB","500 GB","2.1 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.7 GHz");
        Computer laptop=ComputerFactory.getComputer("Laptop","4 GB","512 GB", "2.0 GHz");
        System.out.println("Factory PC Config:"+pc);
        System.out.println("Factory Laptop config: "+laptop);
        System.out.println("Factory Server Config:"+server);
    }
}

