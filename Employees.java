public class Employees {

    private String employeeName;
    private int employeeNo;

    public Employees(String employeeName, int employeeNo) {
        this.employeeName = employeeName;
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle){

        double moneyInHand=customer.getCashOnHand();
        double vehiclePrice=vehicle.getPrice();

        if(finance==true){
            if(vehicle.getPrice()<=moneyInHand){
                System.out.println("Purchased Successfully");
            }
            else if(vehicle.getPrice()>moneyInHand){
                runCreditHistory(customer,vehiclePrice-moneyInHand);
            }
            else
                System.out.println("Insufficent Funds");
        }
        else if(moneyInHand<=vehicle.getPrice()){
            System.out.println("Purchased by cash only!");
            System.out.println("Thank you!!" + customer.getName());
        }
        else
            System.out.println("Car Purchase not successful due to insufficent funds ");
    }

    // Private method! Hidden method
    private void runCreditHistory(Customer customer,double vehiclePrice){

        System.out.println("Credit Check for the loan Amount" +vehiclePrice);
        System.out.println("Loan Approved for " +customer.getName());

    }
}
