import java.util.Scanner;
 
public class activity1 {
 
 public static void main(String[] args) {
  Scanner num = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = num.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = num.nextInt();
   
 
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " + 
  (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + 
  (num1 % num2));
 }
}


 

