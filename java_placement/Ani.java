// Write a java code to create a class called Animal with a method called makeSound(). create a subclass called Cat that overides the makeSound()
class Animal{
    void makeSound(){
        System.out.print("Sound\n");
    }
}

class Cat extends Animal{
    // @Override
    void makeSound(){
        System.out.println("Bark\n");
    }
}
public class Ani {
    public static void main(String[] args) {
        
    Animal a = new Animal();
    a.makeSound();
    Cat cat = new Cat();
    cat.makeSound();
    }
}
