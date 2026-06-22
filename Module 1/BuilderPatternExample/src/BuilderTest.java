public class BuilderTest {
    public static void main(String[] args) {
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        Computer gamingComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("32GB")
                .setStorage("2TB NVMe SSD")
                .setGraphicsCard("RTX 4080")
                .setOS("Windows 11")
                .build();

        System.out.println("Office Computer - CPU: " + officeComputer.getCPU()
                + ", RAM: " + officeComputer.getRAM()
                + ", Storage: " + officeComputer.getStorage()
                + ", Graphics Card: " + officeComputer.getGraphicsCard()
                + ", OS: " + officeComputer.getOS());

        System.out.println("Gaming Computer - CPU: " + gamingComputer.getCPU()
                + ", RAM: " + gamingComputer.getRAM()
                + ", Storage: " + gamingComputer.getStorage()
                + ", Graphics Card: " + gamingComputer.getGraphicsCard()
                + ", OS: " + gamingComputer.getOS());
    }
}
