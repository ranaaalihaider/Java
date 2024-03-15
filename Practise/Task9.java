import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int count =0;
        while (count<1) 
        {   
            System.out.println("Which Pattern Would you like to Print  enter any of 1 , 2 , 3 , 4 , 5");
            int command=input.nextInt();
            System.out.println("Which Pattern Would you like to Prinnt ");
            //1
            if (command==1)
            {
                for (int i=1; i<=4;i++)
                {
                    for (int j=1; j<=10; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            //2
            else if (command==2)
            {    
                for(int i=1; i<=5; i++)
                {
                    for(int j=1; j<=i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            //3
            else if (command==3) 
            {
                for (int i=1; i<=5; i++)
                {   //printing spaces in line
                    for(int j=5; j>i; j--)
                    {
                        System.out.print(" ");
                    }
                    //printing stars
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print("*");
                    }
                    //changing line
                    System.out.println("");
                }
            }
            //4
            else if (command==4) 
            {
                for (int i=1; i<=5; i++)
                {   //printing spaces
                    for(int j=5; j>i; j--)
                    {
                        System.out.print(" ");
                    }
                    //printing left triangle
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print("*");
                    }
                    //Printing right triangle
                    for(int l=2; l<=i;l++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            //5
            else if (command==5) 
            {
                for (int i=1; i<=5; i++)
                {   //printing spaces
                    for(int j=5; j>i; j--)
                    {
                        System.out.print(" ");
                    }
                    //printing left triangle
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print(i);
                    }
                    //Printing right triangle
                    for(int l=2; l<=i;l++)
                    {
                        System.out.print(i);
                    }
                    System.out.println("");
                }
            }
            else
            {
                System.out.println("Wrong Command");
            }
            System.out.println("Would You Like to Print again ? \n1-Yes  \n0-Exit");
            int print=input.nextInt();
            if (print==0) 
            {
                count++;
                System.out.println("Thanks");
            }
            else if (print !=1)
            {   
                System.out.println("Wrong Command");
            }
            
        }
    }
}
