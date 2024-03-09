import java.util.Scanner;
public class quiz_0 {
    public static void main(String[] args) {
        System.out.println("Convert Temperature F to C");
        System.out.println("1: For C to F");
        System.out.println("2: For F to C");
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();

        if (choice==1) {
            System.out.println("Enter Temperature in C ");
            int temperature=input.nextInt();
            int finalTemperature=((temperature*(9/5))+32);
            System.out.println("Your Temperaure in F is : "+finalTemperature);
            
        }
        else if (choice==2) {
            System.out.println("Enter Temperature in F");
            int temperature=input.nextInt();
            int finalTemperature=(temperature-32)*(5/9);
            System.out.println("Your Temperature in C is : "+finalTemperature);
            
        }
    }
}
