public class Main {
    public static void main(String[] args) {
    Cpu cpu = new Cpu(3000,12,"AMD",150);
    RamMemory ramMemory = new RamMemory("DDR3", 4,200);
    HardDrive hardDrive = new HardDrive(HardDriveType.SSD,120, 250);
    Screen screen = new Screen(23, ScreenType.TN,1000);
    Keyboard keyboard = new Keyboard("Sensory", true, 500);
    Computer computer = new Computer("LG", "PowerFX", cpu, ramMemory, hardDrive, screen ,keyboard);
    System.out.println(computer);



    }
}
