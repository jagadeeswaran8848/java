public class ojectasreturntype {
    public static void main(String[] args) {
        customer c = display();
        c.showCust();

    }
    public static customer display(){
        customer c = new customer();

       c.id = "123";
       c.name = "abc";
       c.email="abc@email.com";

       return c;
    }
   
}
