public class deprecate {
    public static void main(String[] args) {
        Annot1 a=new Annot1();

        a.clac2();
        a.clac1();
    }
}

/**
 * Innerdeprecate
 */
class Annot1 {
    int x=100,y=200;
    @Deprecated
    void clac1(){
        System.out.println(x+y);
    }

    void clac2(){
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }
}
