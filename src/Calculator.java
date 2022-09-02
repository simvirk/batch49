public class Calculator {
    public static void main(String[] args) {

        int m  = multiply(2,3);
        int s = sum(2,3);
        float d = divide(43,2);
        int sub = subtract(5,3);

        System.out.println(m);
        System.out.println(s);
        System.out.println(d);
        System.out.println(sub);

        System.out.println();
    }

    public static int multiply(int x, int y) {
        return x*y;

    }
    public static int sum(int x, int y){
        return x+y;
    }
    public static int divide(int x, int y){
        return x/y;
    }
    public static int subtract(int x, int y){
       return x-y;
    }
}
