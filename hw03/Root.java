//Zijia Wang

import java.util.Scanner;
public class Root{
  public static void main(String [] args){
     Scanner myScanner;
     myScanner= new Scanner (System.in);
     System.out.print("Enter a double (any number)");
     double x = myScanner.nextDouble();
     double g = x/3;
     double g1,g2,g3,g4,g5,cube; //
     g1=(2*g*g*g+x)/(3*g*g);
     g2=(2*g1*g1*g1+x)/(3*g1*g1);
     g3=(2*g2*g2*g2+x)/(3*g2*g2);
     g4=(2*g3*g3*g3+x)/(3*g3*g3);
     g5=(2*g4*g4*g4+x)/(3*g4*g4); // there four times 
     
     System.out.print("Cube root is" +g4+"and the value of this crude guess when cubed is " +g4+"*"+g4+"*"+g4);
     
           }
}