import java.util.Scanner;
public class task_01 {
    public static void main(String[] args) {
        double amount;
        double dollars;
        double cents;
        double quarter;
        double dimes;
        double nickle;
        double pennis;
        double remaningCents;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Amount in Decimals ");
        amount=input.nextDouble();
        cents=amount*100;
        dollars=cents/100;
        remaningCents=cents%100;
        double centsToShow=remaningCents;
        quarter=remaningCents/25;
        remaningCents=remaningCents%25;
        dimes=remaningCents/10;
        remaningCents=remaningCents%10;
        nickle=remaningCents/5;
        remaningCents=remaningCents%5;
        pennis=remaningCents;
        System.out.println("The Dollars are "+dollars);
        System.out.println("The Cents are "+centsToShow);
        System.out.println("The Quarter are "+quarter);
        System.out.println("The Dimes are "+dimes);
        System.out.println("The Nickle are "+nickle);
        System.out.println("The Pennis are "+pennis);

    }
}
