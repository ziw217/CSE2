// Zijia Wang

import java.util.Scanner;

public class Cookies{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			myScanner = new Scanner( System.in );
   			if(myScanner.hasNextInt())
      …………
else{
  System.out.println("You did not enter an int");
  return;    //leaves the program, i.e.
                //the program terminates
}

   			    
   			    
   			    

}  //end of main method   
  	} //end of class

	System.out.println("Enter the number of Cookies (an integer > 0): ");
		int nCookies = myScanner.nextInt();
    
    System.out.print("Enter the cost per People"+" a double (in the form xx.xx): ");
double $ = myScanner.nextDouble();
	System.out.print("Enter the percent tax as a whole number (xx): ");
double taxRate = myScanner.nextDouble();