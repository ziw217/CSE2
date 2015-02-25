//Zijia Wang
//hw5-Decimal to Hexadecimal Converter

import java.util.Scanner;
public class ToHex {//Main method
    public static void main(String[] args){
        
   {


		System.out.println("Please enter three numbers representing RGB values:"); // The numbers of representing
		Scanner in = new Scanner(System.in);
		int [] dec = new int[3];
		String [] hex2 = new String[3];

		for(int i = 0; i < 3; i++)
		{

			if(in.hasNextInt() && dec[i] >= 0 && dec[i] <= 255) // Decimal to Hexadecimal
			{
				dec[i] = in.nextInt();
				int b = dec[i] % 16;
				int c = dec[i] / 16;
				String hex;
				switch (b)
				{
					case 10: hex = "A";
					break;
					case 11: hex = "B";
					break;
					case 12: hex = "C";
					break;
					case 13: hex = "D";
					break;
					case 14: hex = "E";
					break;
					case 15: hex = "F";
					break;
					default: hex = "" + b;
					break;
				}
				String hex1;
				switch (c)
				{
					case 10: hex1 = "A";
					break;
					case 11: hex1 = "B";
					break;
					case 12: hex1 = "C";
					break;
					case 13: hex1 = "D";
					break;
					case 14: hex1 = "E";
					break;
					case 15: hex1 = "F";
					break;
					default: hex1 = "" + c;
					break;
				}
				hex2[i] = hex + hex1;
			}

			else if(in.hasNextInt() &&( dec[i] < 0 || dec[i] > 255))
			{
				System.out.println("Sorry, you must enter values between 0-255."); // range from 0 -255
			}

			else
			{
				System.out.println("Sorry, your input must consist of integers."); // range should include integers
			}
		}

		System.out.print("The decimal numbers R:" + dec[0] + " G:" + dec[1] + " B:" + dec[2] + " is represented in hexadecimal as:" + hex2[0] + hex2[1] + hex2[2]);
	}
}
}

