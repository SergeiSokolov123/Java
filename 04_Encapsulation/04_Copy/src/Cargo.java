public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean property;             //is it possible to flip ?
    private final String registrationNumber;
    private final boolean breakable;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress, boolean property, String registrationNumber,
                 boolean breakable) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.breakable = breakable;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, breakable);
    }

    public double getWeight() {
        return weight;
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, breakable);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, breakable);
    }

    public boolean getProperty() {
        return property;
    }

    public Cargo setProperty(boolean property) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, breakable);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, breakable);
    }

    public boolean getBreakable() {
        return breakable;
    }

    public Cargo setBreakable(boolean breakable) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, breakable);
    }
    public String toString(){
        return dimensions + "\n" + weight + "\n" + deliveryAddress + "\n" + property + "\n" + registrationNumber + "\n"
                + breakable + "\n";
    }
}
