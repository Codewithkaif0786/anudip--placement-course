package anudip_exercise;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number is :");
        int a = sc.nextInt();
        System.out.println("Enter a second no is :");
        int b = sc.nextInt();
        
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;

        System.out.println("Sum of two no is : "+sum);
        System.out.println("Sub of two no is :"+sub);
        System.out.println("Mul of two no is :"+mul);
        System.out.println("div of tow no is :"+div);
    }
}
