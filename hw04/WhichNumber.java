//Zijia WANG

import java.util.Scanner;
import java.lang.String;

public class WhichNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Is the number even? ");
    String s = sc.nextLine();
    char[] arr = s.toCharArray();
    if (arr[0] == 'Y' || arr[0] == 'y') {
      System.out.printf("IS it divisible by 3? ");
      s = sc.nextLine();
      arr = s.toCharArray();
      if (arr[0] == 'Y' || arr[0] == 'y') {
        System.out.printf("Is your number 6? ");
      }else if (arr[0] == 'N' || arr[0] == 'n'){
        System.out.printf("IS it divisible by 4? ");
        s = sc.nextLine();
        arr = s.toCharArray();
        if (arr[0] == 'Y' || arr[0] == 'y') {
          System.out.printf("IS it divisible by 4? ");
          s = sc.nextLine();
          arr = s.toCharArray();
          if (arr[0] == 'Y' || arr[0] == 'y') {
            System.out.printf("Is the number divided by 4 greater than 1? ");
            s = sc.nextLine();
            arr = s.toCharArray();
            if (arr[0] == 'Y' || arr[0] == 'y') {
              System.out.printf("Is your number 8? ");
            }else if (arr[0] == 'N' || arr[0] == 'n') {
              System.out.printf("Is your number 4? ");
            }else {
              System.out.printf("Illegal input\n");
            }
          }
        }else if (arr[0] == 'N' || arr[0] == 'n') {
          System.out.printf("IS it divisible by 5? ");
          s = sc.nextLine();
          arr = s.toCharArray();
          if (arr[0] == 'Y' || arr[0] == 'y') {
            System.out.printf("Is your number 10? ");
          }else if (arr[0] == 'N' || arr[0] == 'n') {
            System.out.printf("Is your number 2? ");
          }else {
            System.out.printf("Illegal input\n");
          }
        }else {
          System.out.printf("Illegal input\n");
        }
      }
    }else if (arr[0] == 'N' || arr[0] == 'n') {
      System.out.printf("IS it divisible by 3? ");
      s = sc.nextLine();
      arr = s.toCharArray();
      if (arr[0] == 'Y' || arr[0] == 'y') {
        System.out.printf("When divided by 3 is the result greater than 1? ");
        s = sc.nextLine();
        arr = s.toCharArray();
        if (arr[0] == 'Y' || arr[0] == 'y') {
          System.out.printf("Is your number 9? ");
        }else if (arr[0] == 'N' || arr[0] == 'n') {
          System.out.printf("Is your number 3? ");
        }else {
          System.out.printf("Illegal input\n");
        }
      }else if (arr[0] == 'N' || arr[0] == 'n') {
        System.out.printf("IS it greater than 6? ");
        s = sc.nextLine();
        arr = s.toCharArray();
        if (arr[0] == 'Y' || arr[0] == 'y') {
          System.out.printf("Is your number 7? ");
        }else if (arr[0] == 'N' || arr[0] == 'n') {
          System.out.printf("Is it less than 3? ");
          s = sc.nextLine();
          arr = s.toCharArray();
          if (arr[0] == 'Y' || arr[0] == 'y') {
            System.out.printf("Is your number 1? ");
          }else if (arr[0] == 'N' || arr[0] == 'n') {
            System.out.printf("Is your number 5? ");
          }else {
            System.out.printf("Illegal input\n");
          }
        }else {
          System.out.printf("Illegal input\n");
        }
      }else {
        System.out.printf("Illegal input\n");
      }
    }else {
      System.out.printf("Illegal input\n");
    }
    
  }
}
