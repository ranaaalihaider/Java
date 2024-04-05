public class Compound_interest
{
    public static void main(String[] args) 
    {
        interestCalculator();
    }
    public static void interestCalculator ()
    {
        double amount=10000;
        double interest=0.05;
        int  time=10;
        for(int i=1; i<=time;i++)
        {
            amount=amount*(Math.pow((1+interest), i));
            System.out.println(amount);
        }
    }
}