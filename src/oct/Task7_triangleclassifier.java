package oct;

import java.util.Scanner;

public class Task7_triangleclassifier {
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of side A=");
        int a= sc.nextInt();
        System.out.println("Enter the size of side B=");
        int b= sc.nextInt();
        System.out.println("Enter the size of side C=");
        int c= sc.nextInt();
        if(a==b && b==c )
        {
            System.out.println("This is Equilateral Triangle");
        } else if (a==b||b==c||a==c) {
            System.out.println("This is Isosceles Triangle");

        }
        else {
            System.out.println("This is Scalene Triangle");
        }
        sc.close();

    }

}
