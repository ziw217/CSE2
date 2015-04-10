import java.util.Scanner;
import java.lang.Math;

public class ArrayInputs{
	public static void main(String [] arg){
		Scanner scan=new Scanner(System.in);
		System.out.println("size of array");
		int sizeArray=scan.nextInt();
		int [] input=new int[sizeArray];
		System.out.println("please enter"+sizeArray+"positive integers:");
		System.out.println("array is:");
		for(int i=0;i<sizeArray;i++){
		    input[i]=positiveInt(scan.nextInt());
		}
		for (int i=0;i<input.length;i++){
		    System.out.print(input[i]);
		}
	}
	
	
public static int positiveInt(int x){
    if (x<=0){
        System.out.println("not integer");
    }
    return x;
}
}