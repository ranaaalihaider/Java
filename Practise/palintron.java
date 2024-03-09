public class palintron {
    public static void main(String[] args) {
        int number =414;
        int tester= number;
        int final_result=0;
        int multiplier=100;
        while (number>0) {
            int result=(number%10);
            number=number/10;
            final_result=(result*multiplier)+final_result;
            multiplier=multiplier/10;

            
        }

        if (tester==final_result) {
        System.out.println("Number is Palintrome ");
        }
            
        
        else{
            System.out.println("It is not palintrome");
        }
            
        }
    }
