package com.mycompany.assignment_02;
public class Task_07 
{
    public static void main(String[] args) 
    {       
        System.out.println("Welcome to Perfect Number Finder !\nHere are all perfect Numbers upto 10,000");
        checker();
    }
    public static void checker ()
    {
        for(int i=1;i<=10000;i++)
        {
            int sum=0;
            for (int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}

