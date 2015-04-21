//ZIJIA WANG

import java.util.Random;



public class Multiply {  
	
	public static void display(int[][] matrix){   // the main method will start
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.printf("%5d",matrix[i][j]);   // the 1st print out will get
			}
			System.out.println();  
		}
	}
	
	public static int[][] mul(int[][] a, int[][] b){   // another method for the program
		
		int[][] c = new int[a.length][b[0].length];
		for(int i = 0;i<a.length ;i++){  
            for(int j = 0;j<b[0].length;j++){  
                int temp = 0;  
                for(int x = 0;x<b.length;x++){  
                    temp += a[i][x]*b[x][j];  
                      
                }  
                c[i][j] = temp;  
            }  
        }
		return c;
	}
	
	public static void main(String[] args) {   // similar way as the one before
		
		Random r = new Random();
		final int size = 5;
		int[][] a = new int[size][size];
		int[][] b = new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				a[i][j] = r.nextInt(10);
				b[i][j] = r.nextInt(10);
			}
		}
		int[][] c = mul(a,b);
		
		display(a);
		System.out.println("\n              *\n");
		display(b);
		System.out.println("\n              =\n");
		display(c);
		
	}

}
