package Day08;
import java.util.*;
public class linear_search {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size:");
        int a=sc.nextInt();
        System.out.println("enter your target value:");
        int[]arr=new int[a];

        int target=sc.nextInt();

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(search(arr,target));

    }
    static int search(int[]arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
