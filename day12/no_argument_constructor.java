package Day12;
class C{
    String name;
    int age;

    C(){
        this.name="vidhya";
        this.age=18;

    }
    void display(){
        System.out.println(name+" "+age);

    }


        }
public class no_argument_constructor {
    public static void main(String[]args){
        C obj1=new C();
        obj1.display();
    }
}
