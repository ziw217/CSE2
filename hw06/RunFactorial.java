//Zijia Wang

import java.util.Scanner;

public class RunFactorial {   //Main method

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n = 0;
		boolean valid = false;
		String line;
		System.out.println("Please enter an integer that is between 9 and 16:");   // enter an integer between 9 to 16
		line = keyboard.nextLine();
		while(valid == false){
			try{
				n = Integer.parseInt(line);
				if(n < 9 || n > 16){
					System.out.println("Invalid input,enter again");   // Invalid input, enter the number
					line = keyboard.nextLine();
				}else{
					valid = true;
				}
			}catch(Exception e){
				System.out.println("Invalid input,enter again");   // Invalid input, enter one more time
				line = keyboard.nextLine();
			}
		}
		System.out.println("Input accepted:");  // input accepted
		int sum = 1;
		for(int i=1;i<=n;i++){
			sum *= i;
		}
		System.out.println(n + "!=" + sum);   // will get the result
	}

}
