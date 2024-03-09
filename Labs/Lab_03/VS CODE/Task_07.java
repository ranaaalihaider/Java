import java.util.Scanner;
public class Task_07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number of A Class Tickets Sold out : ");
        int aClass=input.nextInt();
        int aClassAmount=aClass*20;
        System.out.print("Enter Number of B Class Tickets Sold out : ");
        int bClass=input.nextInt();
        int bClassAmount=bClass*15;
        System.out.print("Enter Number of C Class Tickets Sold out : ");
        int cClass=input.nextInt();
        int cClassAmount=cClass*10;
        System.out.print("Enter Number of D Class Tickets Sold out : ");
        int dClass=input.nextInt();
        int dClassAmount=dClass*5;
        int totalIncome=aClassAmount+bClassAmount+cClassAmount+dClassAmount;
        System.out.println("Your Total income of tickets sold is : "+totalIncome);
    }
}
