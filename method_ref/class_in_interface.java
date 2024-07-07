public class class_in_interface {
    public static void main(String[] args) {
        sample.sample_class s = new sample.sample_class();
        s.display();
    }
}

interface sample{
    /**
     * Innerclass_in_interface
     */
    class sample_class {
    
        void display(){
            System.out.println("Class_in_interface");
        }
    }
}
