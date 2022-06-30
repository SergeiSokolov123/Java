public class RamMemory {
    public final String type;
    public final double size; //обьем
    public final double weight;

    public RamMemory(String type, double size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public RamMemory setType(String type) {
        return new RamMemory(type, size, weight);
    }

    public RamMemory setSize(double size) {
        return new RamMemory(type, size, weight);
    }

    public RamMemory setWeight(double weight) {
        return new RamMemory(type, size, weight);
    }

    public String toString() {
        return "\nТип оперативной памяти" + " " + type +
                "\nобьем оперативной памяти" + " " + size +
                "\nвес оперативной памяти" + " " + weight + " " + "гр";
    }
}
