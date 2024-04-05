package com.mycompany.lab_08;
public class Task_05 
{
    public static void main (String [] args)
    {
        System.out.println("Your Armstrong Numbers are !");
        for (int i=100; i<=10000; i++)
        {
            int methodResult= armStrong(i);
            if( methodResult==i)
            {
                System.out.printf(" %-4d",i);
            }
 
        }
    }
    public static int armStrong(int n)
    {
        String num=Integer.toString(n);
        int length=num.length();
        int result=0;
        while (n >0)
        {
            int reminder=n%10;
            reminder=(int )Math.pow(reminder, length);
            result+=reminder;
            n/=10;
        }
        return result;
        
    }
            
}
