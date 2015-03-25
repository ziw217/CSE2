//Zijia Wang

package hw08;

import java.util.Random;
import java.util.Scanner;

public class HW8 {
	
	public static void giant() {
		
		
		System.out.println("                   --------- ");
		System.out.println("                  |   /   \\| ");
		System.out.println("        ZZZZZH    |     O    |   HZZZZZ ");
		System.out.println("             H     -----------   H ");
		System.out.println("        ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ ");
		System.out.println("             H    HHHHHHHHHHH    H ");
		System.out.println("        ZZZZZH    HHHHHHHHHHH    HZZZZZ ");
		System.out.println("                  HHHHHHHHHHH ");
		System.out.println("                  HHH     HHH ");
		System.out.println("                 HHH       HHH ");
	}
	
	public static void cave() {
		System.out.println("                    *****  * * * * * * * * ");
		System.out.println("               ***        *** ");
		System.out.println("            ***              *** ");
		System.out.println("       |    ***              *** ");
		System.out.println("       |    ***              *** ");
		System.out.println("   O __|__  ***              *** ");
		System.out.println(" ******l    ***              *** ");
		System.out.println("  * *       ***              *** ");
		System.out.println(" *   *      ******************** * * * * * * ");
	}
	
	public static String getInput(Scanner scan, String string){
		
		char ch = scan.nextLine().charAt(0);
		boolean succeed = false;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == ch){
				succeed = true;
				break;
			}
		}
		if(succeed == false){
			System.out.println("Yea right LOSER!");
			System.exit(0);
		}
		return "";
	}
	
	public static String getInput(Scanner scan, String string, int trial){
		
		char ch;
		Random r = new Random();
		
		do{
			ch = scan.nextLine().charAt(0);
			boolean succeed = false;
			for(int i=0;i<string.length();i++){
				if(ch == string.charAt(i)){
					succeed = true;
					break;
				}
			}
			if(succeed == false){
				System.out.println("Executed by the GIANT! Game Over!");
				System.exit(0);
			}
			if(ch == 'a' || ch == 'A'){
				if(r.nextBoolean()){
					System.out.println("Critical Hit!");
					trial--;
				}else{
					System.out.println("Gosh! How can you miss it!");
				}
			}else{
				int v = r.nextInt(10) + 1; 
				if(v == 10){
					System.out.println("escaped successfully");
					break;
				}
			}
			
			if(trial > 0){
				System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
			}
			
		}while(trial > 0);
		
		return "";
	}
	
	public static String getInput(Scanner scan){
		
		int number = scan.nextInt();
		switch(number){
			case 1:
			case 2:
			case 3:
				break;
			default:
				System.out.print("A Wrong Number! You get nothing! Better restart the game LOL");
				break;
		}
		if(number >=1 && number <=3){
			System.out.print("It is GPA" + (number*2.00));
		}
		return "";
	}
	
	public static void box(){
		System.out.println(" ********************* ********************* ********************* ");
		System.out.println(" ***               *** ***               *** ***               *** ");
		System.out.println(" ***       1       *** ***       2       *** ***       3       *** ");
		System.out.println(" ***               *** ***               *** ***               *** ");
		System.out.println(" ********************* ********************* ********************* ");
		
	}
		
	public static void main(String[] args) {
		char option;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
		String input = getInput(scan, "Cc");
		System.out.println("You are in a dead valley.");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
		input = getInput(scan, "Cc");
		System.out.println("You walked and walked and walked and you saw a cave!");
		cave();
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
		input = getInput(scan, "Cc");
		System.out.println("You entered a cave!");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
		input = getInput(scan, "Cc");
		System.out.println("Unfortunately, you ran into a GIANT!");
		giant();
		System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
		input = getInput(scan, "AaEe", 10);
		System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
		System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
		box();
		input = getInput(scan);
		System.out.println("Hero! Have a good day!");
	}
}

