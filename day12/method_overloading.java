package Day12;
class cs{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    void dispaly(){
        System.out.println("hello world");
    }

}

public class method_overloading {
    public static void main(String[]args){
        cs obj=new cs();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}
