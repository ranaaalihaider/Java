package com.mycompany.lab_08;
public class Task_06 
{
    public static void main(String [] args)
    {
        System.out.println("Welcome To perfect number printer !\nPerfect Numbers between 100 and 500 are  ");
        for (int i=100; i<=500;i++)
        {
            boolean methodResult=idPerfect(i);
            if(methodResult==true)
            {
                System.out.printf("%-4d ",i);
            }
        }
        
    }
    public static boolean idPerfect (int n)
    {
        int result=0;
        
        for (int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                result+=i;
            }
        }
        if (result==n)
        {
            
            return true;
        }
        else 
        {
            return false ;
        }
    }
}
