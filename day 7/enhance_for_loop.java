package Day07;
//enhance for loop for integer
/*import java.util.*;
public class enhance_for_loop {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your size:");
        int a=input.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
            int b=input.nextInt();
            arr[i]=b;
        }
        for(int num:arr) {
            System.out.println(num);
        }
    }
}*/

//enhance for loop for char

/*import java.util.*;
public class enhance_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your size:");
        int a = input.nextInt();
        char[] arr = new char[a];
        for (int i = 0; i < a; i++) {
            char b = input.next().charAt(0);
            arr[i] = b;
        }
        for (char num : arr) {
            System.out.println(num);
        }
    }
}*/
//enhance for loop for string
import java.util.*;
public class enhance_for_loop {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your size:");
        int a=input.nextInt();
        String [] arr=new String[a];
        for(int i=0; i<a;i++)
        {
            String n=input.next();
            arr[i]=n;
        }
        for(String str:arr){

            System.out.println(str);
        }

    }
}

