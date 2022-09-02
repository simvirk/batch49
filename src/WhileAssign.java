import java.util.Scanner;

public class WhileAssign {

      public static void main(String[] args) {

            int n, i = 1, sum = 0;
          Scanner sc = new Scanner(System.in);

          System.out.println("Please enter any no.");
          n = sc.nextInt();


          while(i <= n) {
              sum = sum + i;
              i++;

            }
          System.out.println("sum of n natural nos. is" + sum);
        }
    }

