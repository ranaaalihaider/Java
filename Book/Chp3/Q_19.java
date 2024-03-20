import java.util.Scanner;
public class Q_19 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int normalHours,extraHours,payRate,salary1=0,salary2=0,salary3=0;
        System.out.println("Welcome to Salary Calculator");
        for(int i=1; i<=3; i++)
        {
            System.out.printf("Enter hours worked by Employe %d : ",i );
            int hours=input.nextInt();
            System.out.printf("\nEnter Pay Rate for employe %d : ",i);
            payRate=input.nextInt();
            if (i==1) 
            {
                if (hours>40) 
                {
                    normalHours=40;
                    extraHours=hours-40;
                    salary1=extraHours*(payRate/2);
                }
                else
                {
                    normalHours=hours;
                }
                salary1=salary1+(normalHours*payRate);

            }
            if (i==2) 
            {
                if (hours>40) 
                {
                    normalHours=40;
                    extraHours=hours-40;
                    salary2=extraHours*(payRate/2);
                }
                else
                {
                    normalHours=hours;
                }
                salary2=salary2+(normalHours*payRate);

            }
            if (i==3) 
            {
                if (hours>40) 
                {
                    normalHours=40;
                    extraHours=hours-40;
                    salary3=extraHours*(payRate/2);
                }
                else
                {
                    normalHours=hours;
                }
                salary3=salary3+(normalHours*payRate);

            }
            
        }
        System.out.printf("Your salary of \nEmploye 1 is %d \nEmploye 2 is %d \nEmploye 3 is %d",salary1,salary2,salary3);
    }
    
}
