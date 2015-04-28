//Zijia Wang



import java.util.Random;
import java.util.Scanner;

public class FourDwin {
	
	public static int compare3D(double[][][] a, double[][][] b){
		
		if(a.length != b.length){
			return a.length - b.length;
		}
		double minA, minB;
		minA = minB = Double.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				for(int k=0;k<a[i][j].length;k++){
					if(minA > a[i][j][k]){
						minA = a[i][j][k];
					}
				}
			}
		}
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				for(int k=0;k<b[i][j].length;k++){
					if(minB > b[i][j][k]){
						minB = b[i][j][k];
					}
				}
			}
		}
		if(minA > minB){
			return 1;
		}else if(minA < minB){
			return -1;
		}else{
			return 0;
		}
	}
	
	public static int compare2D(double[][] a, double[][] b){
		
		if(a.length != b.length){
			return a.length - b.length;
		}
		double minA, minB;
		minA = minB = Double.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(minA > a[i][j]){
					minA = a[i][j];
				}
			}
		}
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				if(minB > b[i][j]){
					minB = b[i][j];
				}
			}
		}
		if(minA > minB){
			return 1;
		}else if(minA < minB){
			return -1;
		}else{
			return 0;
		}
	}
	
	public static double[][][][] sort4DArray(double [][][][] arr){
		
		int i,j;
	    double[][][] insertNote;
	    double[][][][] array = arr;
	    
	    for (i=1;i<array.length;i++){
	    	insertNote = array[i];
	    	j=i-1;
	    	while(j>=0 && compare3D(insertNote, array[j]) < 0){
	    		array[j+1]=array[j];
	    		j--;
	    	}
	    	array[j+1] = insertNote; 
	    }
	    return array;
	}
	
	public static double[][][] sort3DArray(double[][][] arr){
		
		for(int i=0;i<arr.length;i++){
			double[][] min = arr[i];
			int k = i;
			for(int j=i+1;j<arr.length;j++){
				if(compare2D(min, arr[j]) > 0){
					min = arr[j];
					k = j;
				}
			}
			if(k != i){
				arr[k] = arr[i];
				arr[i] = min;
			}
		}
		return arr;
	}
	
	public static void printArray(double[][][][] arr){
		
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print("{");
			for(int j=0;j<arr[i].length;j++){
				System.out.print("{");
				for(int k=0;k<arr[i][j].length;k++){
					System.out.print("{");
					for(int l=0;l<arr[i][j][k].length;l++){
						System.out.printf("%.1f",arr[i][j][k][l]);
						if(l < arr[i][j][k].length - 1){
							System.out.print(",");
						}
					}
					System.out.print("}");
					if(k < arr[i][j].length - 1){
						System.out.print(",");
					}
				}
				System.out.print("}");
				if(j < arr[i].length - 1){
					System.out.print(",");
				}
			}
			System.out.print("}");
			if(i < arr.length - 1){
				System.out.print(",");
			}
		}
		System.out.print("}");
	}
	
	public static void statArray(double[][][][] arr){
		
		double sum,mean;
		int num = 0;
		
		sum = mean = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					for(int l=0;l<arr[i][j][k].length;l++){
						sum += arr[i][j][k][l];
						num++;
					}
				}
				
			}
		}
		mean = sum / num;
		System.out.println("Members: " + num);
		System.out.printf("Sum: %.1f\n", sum);
		System.out.printf("Mean: %.3f\n", mean);
	}
	
	public static void main(String[] args) {
		
		int x,y;
		Scanner keyboard = new Scanner(System.in);
		String buffer;
		
		while(true){
			try{
				System.out.print("Enter an integer X: ");
				buffer = keyboard.nextLine();
				x = Integer.parseInt(buffer);
				break;
			}catch(Exception e){
				System.out.print("Invalid input. ");
			}
		}
		
		while(true){
			try{
				System.out.print("Enter an integer Y where Y > X: ");
				buffer = keyboard.nextLine();
				y = Integer.parseInt(buffer);
				if(x < y){
					break;
				}else{
					System.out.print("Invalid input. ");
				}
			}catch(Exception e){
				System.out.print("Invalid input. ");
			}
		}
		
		double[][][][] arr = new double[3][][][];
		Random r = new Random();
		int length = r.nextInt(y-x+1) + x;
		for(int i=0;i<arr.length;i++){
			length = r.nextInt(y-x+1) + x;
			arr[i] = new double[length][][];
			for(int j=0;j<arr[i].length;j++){
				length = r.nextInt(y-x+1) + x;
				arr[i][j] = new double[length][];
				for(int k=0;k<arr[i][j].length;k++){
					length = r.nextInt(y-x+1) + x;
					arr[i][j][k] = new double[length];
					for(int l=0;l<arr[i][j][k].length;l++){
						arr[i][j][k][l] = r.nextDouble() * 30.0;
					}
				}
			}
		}
		System.out.println("Original Array:");
		printArray(arr);
		arr = sort4DArray(arr);
		for(int i=0;i<arr.length;i++){
			arr[i] = sort3DArray(arr[i]);
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					for(int l=0;l<arr[i][j][k].length;l++){
						for(int n1=0;n1<arr[i][j][k].length;n1++){
							double min = arr[i][j][k][n1];
							int n = n1;
							for(int n2=n1+1;n2<arr[i][j][k].length;n2++){
								if(arr[i][j][k][l] < min){
									min = arr[i][j][k][l];
									n = n2;
								}
							}
							if(n1 != n){
								arr[i][j][k][n] = arr[i][j][k][n1];
								arr[i][j][k][n1] = min;
							}
						}
					}
				}
			}
		}
		System.out.println("\n\nSorted Array:");
		printArray(arr);
		System.out.println("\n");
		statArray(arr);
	}

}
