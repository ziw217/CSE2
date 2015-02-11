//Zijia Wang

import java.util.Scanner;
public class FourDigits{
  public static void main(String [] args){
     Scanner myScanner;
     myScanner= new Scanner (System.in);
     System.out.println("Enter a number");
     int x =myScanner.nextInt(); 
     
     int number =x/10;
     int position2 = number % 10;
     
     int number1 = x/10000;
     int position5 = number1 % 10;
     
     int sum = position2 + position5;
     
     System.out.println("The sum of all odd position is" +sum);
     
  }
  
}