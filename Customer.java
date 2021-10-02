public class Customer {
    private String name;
    private String address;
    private double cashOnHand;

    Customer (String name,String address,double cashOnHand){
        this.name=name;
        // Add Dealership location to the customer address
        this.address=address + " San Jose, CA, USA";
        //New customer bonus to every Customer
        this.cashOnHand=cashOnHand + 500;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void purchaseCar(Vehicle vehicle, Employees employees, boolean finance){

    }
}
