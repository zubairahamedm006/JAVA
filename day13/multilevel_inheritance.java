package Day13;
class m1{
    void display1(){
        System.out.println("vidhya");
    }
}
class m2 extends m1{
    void display2(){
        System.out.println("pooja");
    }
}
class m3 extends m2{
    void display3(){
        System.out.println("savi");
    }

        }
        class m4 extends m3{
    void display4(){
        System.out.println("vaishu");
            }
        }

public class multilevel_inheritance {

    public static void main(String[]args){
        m1 obj1=new m1();
        m2 obj2=new m2();
        m3 obj3=new m3();
        m4 obj4=new m4();
        obj1.display1();
        obj2.display2();
        obj3.display3();
        obj4.display4();
        obj4.display1();
        obj4.display2();
        obj3.display2();

    }
}
