public class Computer {
    public final String vendor; //производитель
    public final String name;
    public Cpu cpu;   //процессор
    public RamMemory ramMemory;   //оперативная память
    public HardDrive hardDrive; //накопитель
    public Screen screen;    //экран
    public Keyboard keyboard;  //клавиатура
    public double totalWeight = 0;

    public Computer(String vendor, String name, Cpu cpu, RamMemory ramMemory, HardDrive hardDrive, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ramMemory = ramMemory;
        this.hardDrive = hardDrive;
        this.screen = screen;
        this.keyboard = keyboard;
        calculateWeight();
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public RamMemory getRamMemory() {
        return ramMemory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, name, cpu, ramMemory, hardDrive, screen, keyboard);
    }

    public Computer setName(String name) {
        return new Computer(vendor, name, cpu, ramMemory, hardDrive, screen, keyboard);
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRamMemory(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void calculateWeight() {
        totalWeight = totalWeight + cpu.getWeight() + ramMemory.getWeight() + hardDrive.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public String  toString() {
        return "\nПроизводитель" + " " + vendor +
                "\nНазвание" + " " + name +
                "\nПроцесор" + cpu.toString() +
                "\nОперативная память" + ramMemory.toString() +
                "\nЖесткий диск" + hardDrive.toString() +
                "\nМонитор" + screen.toString() +
                "\nКлавиатура" + keyboard.toString() +
                "\nОбщий вес Компьютера" + " " + totalWeight + " " + "гр";
    }
}
