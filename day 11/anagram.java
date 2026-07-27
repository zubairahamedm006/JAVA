package Day11;
import java.util.*;
public class anagram {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string1:");
        String name1=input.nextLine();
        System.out.println("enter a string2:");
        String name2=input.nextLine();
        if(name1.length()!=name2.length()){
            System.out.println("not an anagram");

        }
        char[]str1=name1.toCharArray();
        char[]str2=name2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not an anagram");
        }
    }
}
