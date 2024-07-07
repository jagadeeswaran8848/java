public class encapsul {
    public static void main(String[] args) {
        loosecouple lc = new loosecouple();

        lc.display2();
        lc.display1();

        System.out.println(lc.name);

        tightcouple tc = new tightcouple();
        tc.setname();
        tc.display();
    }
}
