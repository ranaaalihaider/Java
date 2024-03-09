/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_1;

import java.util.Scanner;
public class Question6 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int weekday=0,monthDay=0,day=0;
        //Finding Future Dates
        System.out.print("Enter Today's day Number 0 to 6 : ");
        weekday=input.nextInt();
        if (weekday>6) 
        {
        System.out.println("Wrong Input ! Restart the programme.");
        return;// will stop the programme
        }
        System.out.print("Enter Number of Days elapsed till today : ");
        monthDay=input.nextInt();
        monthDay=weekday+monthDay; monthDay=monthDay%7;
        for(int i=1; i<=2;i++)
        {
            if (i==1) 
                {
                    day=weekday; 
                    System.out.print("Today is ");
                }
            else
                {
                    day=monthDay;
                    System.out.print(" and the future day is ");
                }
            switch (day) 
            {
                case 0:System.out.print("Sunday"); break;
                case 1:System.out.print("Monday"); break;
                case 2:System.out.print("Tuesday"); break;
                case 3:System.out.print("Wednesday"); break;
                case 4:System.out.print("Thursday"); break;
                case 5:System.out.print("Friday"); break;
                case 6:System.out.print("Saturday"); break;
            }
        }
    }
}
