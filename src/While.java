import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int random = (int)(Math.random()*10);
        System.out.println(random);


        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("Guess the no.");
            int anInt = sc.nextInt();
            if(random == anInt) {
                System.out.println("Your answer is true");
                flag = false;
            }
                else
                {
                    System.out.println("try again");
                }
            }
        }
    }

