package Day13;
class inherit{
    void display(){
        System.out.println("hello world");
    }

}
class inherit1 extends inherit{
    void show(){
        System.out.println("vidhya");
    }


}
public class single_inheritance {
    public static void main(String[]args){
        inherit obj=new inherit();
        inherit1 obj1=new inherit1();
        obj.display();//access inherit class using inherit
        obj1.show();//access inherit1 class using inherit1
        obj1.display();//access inherit1 class(child class) using inherit classs(parent class)
    }
}
