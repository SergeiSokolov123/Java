public class Cpu {
    public final int frequency; //частота процессора
    public final int cores;     //количество ядр процессора
    public final String manufacturer; //производитель
    public final double weight;      //вес

    public Cpu(int frequency, int cores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public Cpu setFrequency(int frequency) {
        return new Cpu(frequency, cores, manufacturer, weight);
    }

    public Cpu setCores(int cores) {
        return new Cpu(frequency, cores, manufacturer, weight);
    }

    public Cpu setManufacturer(String manufacturer) {
        return new Cpu(frequency, cores, manufacturer, weight);
    }

    public Cpu setWeight(double weight) {
        return new Cpu(frequency, cores, manufacturer, weight);
    }

    public String toString() {
        return "\nЧастота процессора" + " " + frequency +
                "\nколличество ядр процессора" + " " + cores +
                "\nпроизводитель" + " " + manufacturer + " " +
                "\nВес процессора" + " " + weight + " " + "гр";
    }

}
