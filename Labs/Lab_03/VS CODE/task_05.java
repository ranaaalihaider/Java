import java.util.Scanner;;
public class task_05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Taking input
        System.out.println("Enter Amount of Milk Produced in Morning ");
        double milkAmount=input.nextDouble();
        //Finding Number of Cartons
        int number0fCartons=(int) (milkAmount/3.78);
        //Checking if there is reminder mean milk is remaning adding extra one carton
        if ((milkAmount%3.78)>0) {
            number0fCartons=number0fCartons+1;
            
        }
        //Printing Results
        System.out.println("Number of Cartons are : "+number0fCartons);
        double milkCost=milkAmount*0.38;
        double milkProfit=number0fCartons*0.27;
        System.out.printf("The Cost of milk is %.2f \n",milkCost);
        System.out.println("Total Profit of Milk is : $"+milkProfit);

    }
}
