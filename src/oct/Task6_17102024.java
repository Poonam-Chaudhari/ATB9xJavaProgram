package oct;

import java.util.Scanner;

public class Task6_17102024 {
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks=");
        int Marks=sc.nextInt();

        if(Marks>=90 && Marks<=100){
            System.out.println("You have got the 'A' Grade");
        } else if (Marks>=80 && Marks<=89) {
            System.out.println("You have got the 'B' Grade");
        } else if (Marks>=70  && Marks<=79) {
            System.out.println("You have got the 'C' Grade");

        }else if (Marks>=60  && Marks<=69) {
            System.out.println("You have got the 'D' Grade");


    }else if(Marks>=0 && Marks<=59) {
            System.out.println("You have got the 'F' Grade");
        }
        sc.close();
    }

}
