import java.util.Scanner;
public class arrayQuestion 
{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int [] marks= new int[10];
        double average=0;
        System.out.println("Enter Marks of 10 Students.");
        for (int i=0;i<marks.length;i++)
        {
            System.out.print("Enter Marks of Student "+(i+1) +": ");
            marks[i]=input.nextInt();
            average=average+marks[i];
        }
        average/=10;
        int count=0;
        System.out.printf("Your class ha average marks %.2f\n",average);
        for(int i=0;i<10;i++)
        {
            if (marks[i]>average) 
            {
                count++;
            }
        }
        System.out.printf("Total %d have marks greaters than average ",count);
        
    }    
}
