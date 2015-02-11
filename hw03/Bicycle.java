//Zijia Wang

import java.util.Scanner;

public class Bicycle {
// My Main Method
public static void main(String[] args) {
    Scanner myScanner;
    myScanner= new Scanner( System.in);
    System.out.print("Enter the number of counts");// the number of counts on a cyclometer
    double counts = myScanner.nextDouble();
    System.out.println("Enter the number of seconds");// the number of seconds when it occurred
    double seconds = myScanner.nextDouble();
    double wheelDiameter=27.0,//
  	       PI=3.14159, //
  	       feetPerMile=5280,  //
  	       inchesPerFoot=12,   //
  	       secondsPerMinute=60;  //
  	       
  	double distance;
  	distance=counts*wheelDiameter*PI; // equation for calculate distance
  	distance/=inchesPerFoot*feetPerMile; // change unit from foot to mile 
  
  	double speed;
  	speed=distance/seconds ; // equation for calculate speed
  	System.out.print("The distance is"+distance+"miles");
  	
}
}