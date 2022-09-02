public class Demo {
    public static void main(String[] args) {

        // check if a number is even or odd
        int x = 6;
        if(x%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        main1(55);
        System.out.println();

        main3(5,9,4);
        System.out.println();

        main4(-5);
        System.out.println();

    }
    // check if a number lies between 50 and 100
    public static void main1(int x) {


        if((x>=50) && (x<=100)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    //find the largest of three numbers using if..else..if
    public static void main3(int y, int z, int w){
        if (y >= z && y >= w)
            System.out.println(y + "is the largest no." );
        else if (z >= y && z>=w)
            System.out.println(z + "is the largest no.");
        else
            System.out.println(w + "is the largest no.");

    }
    //check if number is positive or negative
    public static void main4(int a) {
        if (a > 0)
            System.out.println(a + "is a positive no.");
        else if (a < 0)
            System.out.println(a + "is a negative no.");
        else
            System.out.println(a + "is 0");

    }


}