/**
 * Single_inheritence
 */
public class Single_inheritence {

    public static void main(String[] args) {
        Department d = new Department();

        d.display_D();
        d.display_C();

        Department.College_name();

        // d.College_name();
    }
}

class collage{
    public void display_C(){
        System.out.println("College");
    }
    static{
        System.out.println("static block");
    }
    public static void College_name(){
        System.out.println("Nandha");
    }

    public collage(){
        System.out.println("Dept : 15");
    }
    {
        System.out.println("Instance");
    }
}

class Department extends collage{ 
    public void display_D(){
        System.out.println("Department");
    }

    public void display_C(){
        System.out.println("College_class");
    }
}