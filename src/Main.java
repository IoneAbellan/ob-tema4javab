public class Main {
    public static void main(String[] args) {
        SmartDevice smartDevice1 = new SmartDevice("objeto1", "v2.5", 233.4f);
        SmartDevice smartPhone1 = new SmartPhone("objeto2", "v5", 657.4f, "marca");
        SmartWatch smartWatch1 = new SmartWatch("objeto3", "4x", 180.9f,"M");

        System.out.println("smartDevice1 = " + smartDevice1.toString());
        System.out.println("smartPhone1 = " + smartPhone1.toString());
        System.out.println("smartWatch1 = " + smartWatch1.toString());

    }
}

