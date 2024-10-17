package oct;

import java.util.Scanner;

public class Task4 {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name =");
        String n=sc.next();
        System.out.println("Enter the Age =");
        int age=sc.nextInt();
        System.out.println("Enter the salary=");
        int sal=sc.nextInt();
        System.out.println("\n Name= "+n+"\n Age="+age+"\n Salary="+sal);
        sc.close();

    }
}
