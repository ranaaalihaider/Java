public class switch_02 {
    public static void main(String[] args) {
        int number=99;
        number=number/10;
        switch (number) {
            case 9:
            System.out.println("Your Grade is A");
                break;
            case 8:
            System.out.println("Your Grade is B");
                break;
            case 7:
            System.out.println("Your Grade is C");
                break;
            case 6:
            System.out.println("Your Grade is D");
                break;
            case 5:
            System.out.println("Your Grade is E");
                break;
        
            default:
            System.out.println("You are Fail");
                break;
        }
    }
}
