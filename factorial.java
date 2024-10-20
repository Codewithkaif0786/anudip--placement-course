package anudip;

import java.util.Scanner;

public class assingment2 {
  public static void printFactorialNo(int n) {
    // condition
    if(n < 0) {
      System.out.println("Invalid number");
      return;
    }
    //loop
    int factorial = 1;
    for(int i=n; i>=1; i--) {
      factorial = factorial * i;
    }
    System.out.println("The factorial no is : " + factorial);
    return;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    printFactorialNo(n);
  }
}
