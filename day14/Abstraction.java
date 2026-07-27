package Day14;
abstract class Animal{

    void makingsound(){
        System.out.println("makingsound");
    }
}
class Dog extends Animal{
     public void makesound(){
        System.out.println("bow bow");
    }
}
class Cat extends Animal{
    public void makesound(){
        System.out.println("meow meow");
    }

        }


public class Abstraction {
    public static void main(String[]args){
        Animal a=new Dog();
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.makesound();
        cat.makesound();
       dog.makingsound();

    }
}
