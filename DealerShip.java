/**--Car dealership program ---
    This class creates new employees,customers,vehicles
    Calculating if the customer can buy the car with cash in hand or if customer needs a finance to buy the car
    Also customer gets offer for purchasing with dealer -customerbonus */

public class DealerShip {

    public static void main(String[] args){

        /* Creating a list of customers*/
        Customer customerTom= new Customer("Tom","Saratoga Ave",10000);
        Customer customerRobin= new Customer("Robin","Reed Ave", 12000);
        Customer customerLaura= new Customer("Laura","BlackWood lane",8000);

        //vehicle available with the dealer
        Vehicle Honda= new Vehicle("Honda","civic",6000,"Automatic");
        Vehicle Volkswagen=new Vehicle("Volkswagen","Jetta",12000,"Automatic");
        Vehicle Tata=new Vehicle("Tata","Indigo",7000,"Manual");

        Employees employee1=new Employees("Micheal",10001);
        Employees employee2=new Employees("Mark",10002);

        //purchasing car by customer

        employee1.handleCustomer(customerTom,false,Honda);
        employee1.handleCustomer(customerLaura,true,Volkswagen);
        employee2.handleCustomer(customerRobin,false,Volkswagen);
        employee2.handleCustomer(customerTom,true,Tata);

    }
}
