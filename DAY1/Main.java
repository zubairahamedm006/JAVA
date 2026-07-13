package day_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a int value:");
      int num=input.nextInt();
      System.out.println("Enter a byte value:");
      byte num1=input.nextByte();
      System.out.println("Enter a short value:");
      short num2= input.nextShort();
      System.out.println("Enter a long value:");
      long num3= input.nextLong();
      System.out.println("Enter a single character:");
      char name=input.next().charAt(0);
      System.out.println("Enter a float value:");
      float num4= input.nextFloat();
      System.out.println("Enter a double value:");
      double num5= input.nextDouble();
        System.out.println("Enter a paragraph:");
        String name2= input.nextLine();
      System.out.println("Enter a string value:");
      String name1= input.next();

        System.out.println("int value:"+num);
        System.out.println("byte value:"+num1);
        System.out.println("short value:"+num2);
        System.out.println("long value:"+num3);
        System.out.println("char value:"+name);
        System.out.println("float value:"+num4);
        System.out.println("double value:"+num5);
        System.out.println("string value:"+name1);
        System.out.println("paragraph value:"+name2);
     }

  }


