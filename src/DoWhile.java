public class DoWhile {
    public static void main(String[] args) {
        int month = 1;
        switch (month){
            case 1:
            case 3:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("30 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            default:
                System.out.println("invalid input");
                break;

        }
    }
}
