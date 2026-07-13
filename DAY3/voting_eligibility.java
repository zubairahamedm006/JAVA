package day_2;
import java.util.*;
public class voting_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        int a = sc.nextInt();
        if (a >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Ineligible");
        }
    }
}