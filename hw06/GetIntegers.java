//Zijia Wang

import java.util.Scanner;

public class GetIntegers {  //Main method

	public static void main(String[] args) {
		
		int[] list = new int[5];
		int sum = 0;
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<5;i++){
			String line = keyboard.nextLine();
			boolean valid = false;
			while(valid == false){
				try{
					list[i] = Integer.parseInt(line);
					if(list[i] < 0){
						System.out.println("Invalid input,enter again");  // Invalid input, enter the number
						line = keyboard.nextLine();
					}else{
						valid = true;
					}
				}catch(Exception e){
					System.out.println("Invalid input,enter again");   // Invalid input, enter one more time
					line = keyboard.nextLine();
				}
			}
		}
		
		for(int i=0;i<5;i++){
			sum += list[i];
		}
		System.out.println("Sum is " + sum);   // will get the final result

	}

}
