import java.util.Scanner;
public class Activity03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Line 2: Enter the working hours: ");
        Double hours=input.nextDouble();
        System.out.print("Line 2: Enter the payrate: ");
        Double rate=input.nextDouble();
        if (hours > 40.0) {
           double wages = 40.0 * rate +1.5 * rate * (hours - 40.0);  }
        else 
           double wages = hours * rate;
        System.out.println("HEllo");
    }


}