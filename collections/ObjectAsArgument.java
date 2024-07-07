public class ObjectAsArgument {
    public static void main(String[] args) {
        customer c = new customer();
        c.id = "123";
        c.name = "abc";
        c.email = "abc@email.com";

        displayCustomerDetails(c);
    }

    public static void displayCustomerDetails(customer cust){
        System.out.println("Displaying Customer Details:");
        cust.showCust();
    }
}
