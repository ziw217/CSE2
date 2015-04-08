// Zijia Wang

import java.util.Random;
import java.util.Scanner;

public class Elimination{
	public static void main(String [] arg){
		Scanner scan=new Scanner(System.in);
		int num[]=new int[10];
		int newArray1[];
		int newArray2[];
		int index,target;
		String answer="";
		do{
			System.out.print("Random input 10 ints [09]");
			num = randomInput();
			String out = "The original array is:";
			out += listArray(num);
			System.out.println(out);
			System.out.print("Enter the index ");
			index = scan.nextInt();
			newArray1 = delete(num,index);
			String out1="The output array is ";
			out1+=listArray(newArray1);
			System.out.println(out1);
			System.out.print("Enter the target value ");
			target = scan.nextInt();
			newArray2 = remove(num,target);
			String out2="The output array is ";
			out2+=listArray(newArray2);
			System.out.println(out2);
			System.out.print("Go again? Enter 'y' or 'Y', anything else to quit");
		    answer=scan.next();
		}while(answer.equals("Y") || answer.equals("y"));
	}
	
	public static int[] delete(int[] num, int index) {

		if(index < 0 || index >= num.length){
			System.out.println("The index is not valid.");
			return num;
		}else{
			for(int i=index;i<num.length-1;i++){
				num[i] = num[i+1];
			}
			int[] res = new int[num.length-1];
			for(int i=0;i<res.length;i++){
				res[i] = num[i];
			}
			return res;
		}
	}

	public static int[] randomInput() {
		
		int[] res = new int[10];
		Random r = new Random();
		for(int i=0;i<10;i++){
			res[i] = r.nextInt(10);
		}
		return res;
	}

	public static int[] remove(int[] num, int target) {
		
		int i = 0;
		while(i<num.length){
			if(num[i] == target){
				num = delete(num, i);
			}else{
				i++;
			}
		}
		return num;
	}

	public static String listArray(int num[]){
		
		String out="{";
		for(int j=0;j<num.length;j++){
			if(j>0){
				out+=", ";
			}
			out+=num[j];
		}
		out+="} ";
		return out;
	}
}
