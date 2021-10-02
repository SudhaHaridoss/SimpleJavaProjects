public class Vehicle {

    private String brandName;
    private String Model;
    private double price;
    private String gear;

    public Vehicle(String brandName, String model, double price, String gear) {
        this.brandName = brandName;
        Model = model;
        this.price = price;
        this.gear = gear;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return Model;
    }

    public double getPrice() {
        return price;
    }

    public String getGear() {
        return gear;
    }
}
