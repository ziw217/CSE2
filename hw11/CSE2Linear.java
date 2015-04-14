//ZIJIA WANG

import java.util.Random;
import java.util.Scanner;

public class CSE2Linear {
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void printArray(int[] grade){
		
		System.out.print(grade[0]);
		for(int i=1;i<grade.length;i++){
			System.out.print(" " + grade[i]);
		}
		System.out.println();
	}
	
	public static int[] randomly(int[] grade){
		
		for(int i=0;i<grade.length*2;i++){
			
			int i1,i2;
			Random random = new Random();
			
			do{
				i1 = random.nextInt(grade.length);
				i2 = random.nextInt(grade.length);
			}while(i1 == i2);
			
			int t = grade[i1];
			grade[i1] = grade[i2];
			grade[i2] = t;
		}
		return grade;
	}
	
	public static int[] sort(int[] grade){
		
		for(int i=0;i<grade.length;i++){
			int k = i;
			int min = grade[i];
			for(int j=i+1;j<grade.length;j++){
				if(grade[j] < min){
					k = j;
					min = grade[j];
				}
			}
			if(k != i){
				grade[k] = grade[i];
				grade[i] = min;
			}
		}
		return grade;
	}
	
	public static void lineSearch(int[] grade){
		
		int g;
		System.out.print("Enter a grade to search for: ");
		g = keyboard.nextInt();
		int i;
		for(i=1;i<=grade.length;i++){
			if(grade[i-1] == g){
				break;
			}
		}
		if(i<=grade.length){
			System.out.println(g + " was found in the list with " + i + " iterations");
		}else{
			System.out.println(g + " was not found in the list with " + i + " iterations");
		}
	}
	
	public static void binarySearch(int[] grade){
		
		int low = 0;   
		int g;
		System.out.print("Enter a grade to search for: ");
		g = keyboard.nextInt();
		int i = 0;
		
        int high = grade.length-1;   
        while(low <= high) {   
            int middle = (low + high)/2;   
            i++;
            if(g == grade[middle]) {   
            	System.out.println(g + " was found in the list with " + i + " iterations");
            }else if(g < grade[middle]) {   
                high = middle - 1;   
            }else {   
                low = middle + 1;   
            }  
        }  
        System.out.println(g + " was not found in the list with " + i + " iterations"); 
	}
	
	public static void main(String[] args) {

		int[] grade = new int[15];
		System.out.println("Enter 15 ints for final grades in CSE2:");
		for(int i=0;i<15;i++){
			String value;
			do{
				value = keyboard.next();
				try{
					grade[i] = Integer.parseInt(value);
					if(grade[i] < 0 || grade[i] > 100){
						System.out.println("The value was out of 0-100");
					}else if(i > 0){
						if(grade[i] < grade[i-1]){
							System.out.println("The value must greater or equal to last int");
						}else{
							break;
						}
					}else{
						break;
					}
				}catch(NumberFormatException e){
					System.out.println("The value be an integer");
				}
			}while(true);
		}
		
		System.out.print("The grades, sorted, are: ");
		grade = sort(grade);
		printArray(grade);
		binarySearch(grade);
		System.out.println("Scrambled:");
		grade = randomly(grade);
		printArray(grade);
		lineSearch(grade);
	}
	
	
	

}
