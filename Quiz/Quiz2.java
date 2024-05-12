import java.util.Scanner;
public class Quiz2
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=0;
        boolean status=true;
        int count=0;
        do{
            System.out.print("Enter Number : ");
            number=input.nextInt();
            count++;
            status=true;
            for(int i=2;i<number;i++)
            {
                if (number%i==0) 
                {
                    status=false;    
                }
            }
        }while(status==false);
        System.out.println(count);
        System.out.println(number);
    }

}