class SmartWatch extends SmartDevice {
    public String size;

    public SmartWatch() {

    }

    public SmartWatch(String size) {
        this.size = size;
    }

    public SmartWatch(String name, String model, float price, String size) {
        super(name, model, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
