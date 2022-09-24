class SmartDevice {
    public String name;
    public String model;
    public float price;

    public SmartDevice() {

    }

    public SmartDevice(String name, String model, float price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
