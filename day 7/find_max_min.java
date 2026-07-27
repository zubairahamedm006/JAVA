package Day07;
import java.util.*;
public class find_max_min {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size:");
        int a=sc.nextInt();

        int []id=new int[a];
        int max=id[0];
        int min=id[0];

        for(int i=0;i<a;i++) {
            int b = sc.nextInt();
            id[i] = b;

        }

        for(int num: id){
            if(num>max){
                max=num;
            }
            else if( num<min){
                min=num;

            }


        }
        System.out.println(max);
        System.out.println(min);
    }
}
