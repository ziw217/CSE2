// Zijia Wang
// homework 07

import java.util.Scanner;
public class waves {
    public static void main (String []args) {
        Scanner keyboard = new Scanner (System.in);
        int n;
        int flag;
        do{
            System.out.print("Enter a number between 1 and 30 :");
            n = keyboard.nextInt();
        }
        while(n < 1 || n > 30);
        keyboard.close();
        System.out.println("\nFOR LOOP:");
        flag = 0;
        for(int i=1 ;i<=n;i++){
            if(flag == 0){
                for(int k=i;k>0;k--){
                    for(int j=0;j<k;j++){
                        System.out.print(i);
                    }
                    System.out.println();
                }
                flag =1;
            }
            else{
                for(int k=1;k<=i;k++){
                    for(int j=0;j<k;j++){
                        System.out.print(i);
                    }
                    System.out.println();
                }
                flag = 0;
            }
        }
        System.out.println("\nWHILE LOOP:");
        flag = 0 ;
        int i= 1 ;
        while(i<=n){
            if(flag == 0){
                int k=i;
                while(k>0){
                    int j=0;
                    while (j<k){
                        System.out.print(i);
                        j++;
                    }
                    k--;
                    System.out.println();
                }
                flag =1;
            }
            else{
                int k=1;
                while(k<=i){
                    int j=0;
                    while(j<k){
                        System.out.print(i);
                        j++;
                    }
                    System.out.println();
                    k++;
                }       
                flag = 0;
        }
        i++;
    }
       System.out.println("\nDO-WHILE LOOP:"); // system will print the 3rd chart values
		flag = 0;
		i =1;
		do{
			if(flag == 0){
				int k=i;
				do{
					int j=0;
					while(j<k){
						System.out.print(i);
						j++;
					}
					k--;
					System.out.println();
				}while(k>0);
				flag = 1;
				
			}else{
				int k=1;
				do{
					int j=0;
					while(j<k){
						System.out.print(i);
						j++;
					}
					System.out.println();
					k++;
				}while(k<=i);
				flag = 0;
				
			}
			i++;
		}while(i<=n);

	}

}
