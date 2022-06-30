public class HardDrive {
    public final HardDriveType type;
    public final double memory; // обьем памяти жесткого
    public final double weight;

    public HardDrive(HardDriveType type, double memory, double weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }

    public HardDriveType getType() {
        return type;
    }

    public double getMemory() {
        return memory;
    }

    public double getWeight() {
        return weight;
    }

    public HardDrive setType(HardDriveType type) {
        return new HardDrive(type, memory, weight);
    }

    public HardDrive setMemory(double memory) {
        return new HardDrive(type, memory, weight);
    }

    public HardDrive setWeight(double weight) {
        return new HardDrive(type, memory, weight);
    }

    public String toString() {
        return "\nТип жесткого диска" + " " + type +
                "\nобьем памяти жесткого диска" + " " + memory +
                "\nвес жесткого диска" + " " + weight + " " + "гр";
    }
}
