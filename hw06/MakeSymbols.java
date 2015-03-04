//Zijia Wang

import java.util.Random;

public class MakeSymbols {  //Main method

	public static void main(String[] args) {
		
		Random random = new Random();
		int n = random.nextInt(100);
		
		System.out.println("Random number generated:" + n);  // will get random number
		System.out.print("The output pattern:");  //  will get pattern
		if(n % 2 == 0){
			for(int i=0;i<n;i++){
				System.out.print("*");  // 1st symbol
			}
			System.out.println();
		}else{
			for(int i=0;i<n;i++){
				System.out.print("&"); // 2ed symbol 
			}
			System.out.println();
		}

	}

}
