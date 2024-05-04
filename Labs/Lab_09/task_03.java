import java.util.Scanner;
public class task_03 
{   
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) 
    {
        topThreeWeight();
    }
    public static void topThreeWeight()
    {
        int firstWeight=0;
        int secondWeight=0;
        int thirdWeight=0;
        while (true) 
        {
            System.out.print("Enter weight or 0 to exit : ");
            int weight=input.nextInt();
            input.nextLine();
            if (weight==0) 
            {
                break;
            }
            else
            {
                if (weight>firstWeight) 
                {
                    thirdWeight=secondWeight;
                    secondWeight=firstWeight;
                    firstWeight=weight;
                }
                else if (weight>secondWeight) 
                {
                    thirdWeight=secondWeight;
                    secondWeight=weight;
                }
                else if (weight>thirdWeight) 
                {
                    thirdWeight=weight;
                }
            }
        }
        System.out.printf("Highest weight is %d Second Highest weight is %d Third Highest weight is %d",firstWeight,secondWeight,thirdWeight);
    }
}
