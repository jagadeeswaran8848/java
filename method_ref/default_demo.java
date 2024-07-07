public class default_demo {
   public static void main(String[] args) {
      Innerdefault_demo i = new Innerdefault_demo() {};

    i.display();
    Innerdefault_demo.show();
   } 
}

/**
 * Innerdefault_demo
 */
interface Innerdefault_demo {

    default public void display(){
      System.out.println("hi");
    }
    static void show(){
      System.out.println("show");
    }
}