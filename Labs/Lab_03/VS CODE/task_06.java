import java.util.Scanner;
public class task_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Eenter Number of Hours Worked Daily ");
        double hours=input.nextDouble();
        double totalHours=hours*5;
        System.out.println("Enter Rate of Per-Hour");
        double rate=input.nextDouble();
        //finding total income
        double totalIncome=totalHours*rate;
        //Tax on total income
        double taxOnIncome=totalIncome*0.14;
        //Income after paying tax
        double incomeAfterTax=totalIncome-taxOnIncome;
        //Paying for Clothes
        double amountForClothes=incomeAfterTax*0.10;
        //Paying For School Supplies
        double amountForSchool=incomeAfterTax*0.01;
        double incomeAfterSchool=incomeAfterTax-(amountForClothes+amountForSchool);
        //Money For Saving Bonds
        double amountForSavingBonds=incomeAfterSchool*0.25;
        //Parent Spent on additional Bonds
        double parentsSpentOnBonds=amountForSavingBonds/2;
        //Printing Statements
        System.out.println("Total Income is : "+totalIncome);
        System.out.println("Total Income after Tax is : "+incomeAfterTax);
        System.out.println("Money Spend on New Clothes is : "+amountForClothes);
        System.out.println("Money Spend on School Supplies is : "+amountForSchool);
        System.out.println("Money Spent on Saving Bonds : "+amountForSavingBonds);
        System.out.println("Money Parents Additionaly Spent for Bonds : "+parentsSpentOnBonds);
    }
}
