import java.util.Random;
import java.util.Scanner;
public class Question10 
{
    public static void main(String[] args) 
    {
        Random rand= new Random();
        Scanner input=new Scanner(System.in);
        int number=rand.nextInt(2);
        System.out.println("Welcome to Heads or Tail Game \nEnter Your Guess 0 for head and 1 for tail");
        int guess=input.nextInt();
        if ((guess==0)||(guess==1))
        {
            if (number==guess) {
                System.out.println("Congratulations You Won the Game");
            }
            else
            {
                System.out.println("Sorry better luck next time. You lost !");
            }            
        }
        else
        {
            System.out.println("Wrong Input. Please Enter 0 or 1");
        }

    }
}
