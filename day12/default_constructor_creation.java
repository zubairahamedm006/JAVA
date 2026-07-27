package Day12;
class A{
    int age;
    String name;
    int id;
    A(){ //default constructor
        System.out.println("vidhya");
    }
    A(int age,String name,int id){
        this.age=age;
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println(age+" "+name+" "+id);
    }


    }

public class default_constructor_creation {
    public static void main(String[]args){
        A p1=new A(21,"vidhya",116);
        A p2=new A(18,"yuva",111);
        p1.display();
        p2.display();

    }
}
