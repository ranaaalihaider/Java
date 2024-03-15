package com.mycompany.lab_05;
import java.util.Scanner;
public class Task10 
{
        public static void main(String[] args) 
    {   
        Scanner input= new Scanner(System.in);
        //Aasking from user about month and date
        System.out.println("Welcome to Calender Printer");
        System.out.print("Enter Year : ");
        int year=input.nextInt();
        System.out.println("Enter First Day number of year like 1- Sun 2-Mon");
        int day=input.nextInt();
        int dayCount=0;
        int monthlimit;
        String monthName="Month Name";
        //Checking for leap year 
        int feb;
        if ((year%4==0 && year%100 !=0)||(year %400==0)) 
        {
            feb=29;
        }
        else
        {
            feb=28;
        }

        for(int h=1;h<=12;h++)
        {
            //Assigning Month Names and Month Last Dates
            int demo=0;
            switch (h) 
            {
                case 1: monthlimit= 31; monthName = "JANUARY";break;
                case 2: monthlimit= feb; monthName = "FEBRUARY";break;
                case 3: monthlimit= 31; monthName = "MARCH";break;
                case 4: monthlimit= 30; monthName = "APRIL";break;
                case 5: monthlimit= 31; monthName = "MAY";break;
                case 6: monthlimit= 30; monthName = "JUNE";break;
                case 7: monthlimit= 31; monthName = "JULY";break;
                case 8: monthlimit= 31; monthName = "AUGUST";break;
                case 9: monthlimit= 30; monthName = "SEPTEMBER";break;
                case 10:monthlimit= 31; monthName = "OCTOBER";break;
                case 11:monthlimit= 30; monthName = "NOVEMBER";break;
                default:monthlimit= 31; monthName = "DECEMBER";break;

            }
            //month calendar
            System.out.printf("\n            %d\n            %s\n ",year,monthName);
            for (int i=1; demo<=1; i++)
            {
                //printing days name 
                for(int j=1; j==i;j--)
                {
                    System.out.println(" Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                    System.out.println("________________________________________");
                }
                //days loop
                if (i==1 && day !=0) 
                {
                    //spacing loop
                    for(int k=1; k<day; k++)
                    {
                        System.out.print("      ");
                    }
                    
                    //for days
                    for(int l=day; l<=7; l++)
                    {
                        
                        ++dayCount;
                        System.out.printf("  %d   ",dayCount);
                        if (l==7) 
                        {
                            dayCount+=1;
                        }
                        
                    }
                    System.out.println("");
                }
                //days loop onward 2nd row
                if (dayCount==0) 
                {
                    dayCount=1;
                }
                for(int m=1;m<=7;m++)
                {
                    
                    System.out.printf("  %d  ",dayCount);
                    if (dayCount<10) 
                        {
                            System.out.print(" ");
                        }
                        ++dayCount;
                        if (dayCount>monthlimit) 
                        {   
                            dayCount=0;
                            demo=2;
                            day=m+1;
                            break;
                        }
                }
                System.out.println("");


            }

        }

    }
    
}
