class SmartPhone extends SmartDevice {
    public String brand;

    public SmartPhone() {
    }

    public SmartPhone(String brand) {
        this.brand = brand;
    }

    public SmartPhone(String name, String model, float price, String brand) {
        super(name, model, price);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
