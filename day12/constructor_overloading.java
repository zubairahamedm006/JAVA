package Day12;

class D{
    String name;
    int id;
    String name1;
    int id1;
    D(String name,int id){
        this.name1=name;
        this.id=id;
    }
    D(int id1,String name1){
        this.id1=id1;
        this.name1=name1;

    }
    void display(){
        System.out.println(name+" "+id+" "+name1+" "+id1);
    }
}
public class constructor_overloading {
    public static void main(String[]args){
        D obj=new D("vidhya",116);
        D obj1=new D("vid",23);
        obj.display();
        obj1.display();

    }
}
