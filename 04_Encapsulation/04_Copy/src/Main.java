public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(200, 300, 400);
        Cargo cargo = new Cargo(dimensions, 22.1, "Pushkina st 23", false, "434323Y", false);
        cargo.setWeight(23.4);
        cargo.setDeliveryAddress("Kalatushkina st 31");
        cargo.setDimensions(dimensions);
        System.out.println(cargo);

        Cargo copy = new Cargo(cargo.getDimensions(),
                cargo.getWeight(),
                cargo.getDeliveryAddress(),
                cargo.getProperty(),
                cargo.getRegistrationNumber(),
                cargo.getBreakable());
        System.out.println(cargo);
    }
}
