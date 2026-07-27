package Day13;
class a{
    void display(){
        System.out.println("vidhya");
    }
}
class b extends a{
    void display1(){
        System.out.println("yuva");
    }
}
class c extends a{
    void display2(){
        System.out.println("ramya");
    }
}

public class multiple_inheritance {
    public static void main(String[]args){
        a A=new a();
        b B=new b();
        c C=new c();
        A.display();
        B.display1();
        C.display2();
        B.display();
        C.display();
    }
}
