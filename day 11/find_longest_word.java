package Day11;
import java.util.*;
public class find_longest_word {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter you sentence:");
        String name1 =input.nextLine();
        String[] str=name1.split(" ");
        String longword=str[0];
        for(String n:str){
            if(n.length()>longword.length()){
                longword=n;
            }
        }
        System.out.println(longword);





    }
}
