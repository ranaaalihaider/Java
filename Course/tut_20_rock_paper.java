import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class tut_20_rock_paper {
    public static void main(String[] args) {
        int count=1;
        int computer_points=0;
        while (count<=5) {
            
            Random rand_number=new Random();
            int    computer_number=rand_number.nextInt(3);
            Scanner input=new Scanner(System.in);
            System.out.print("Enter 0 For Rock 1 For Paper 2 For Scissors : ");
            int user_number=input.nextInt();
            String computer_value="";
            String user_value="";

            if (user_number<3 && user_number>=0) {
                //assigning values 
                switch (computer_number) {
                    case 0 ->computer_value="Rock";
                    case 1 ->computer_value="Paper";
                    default->computer_value="Scissors";
                }
                switch (user_number) {
                    case 0 ->user_value="Rock";
                    case 1 ->user_value="Paper";
                    default->user_value="Scissors";
                }
                
                if (computer_number==user_number) {
                    System.out.println("Match Tie you selected "+user_value+" computer selected "+computer_value );
                }
                else if((computer_number==0 && user_number==2)||(computer_number==1 && user_number==0)||(computer_number==2 && user_number==1)) {
                    System.out.println("You Lost you selected "+user_value+" computer selected "+computer_value);
                    count=count+1;
                    computer_points=computer_points+1;
                }
                else{
                    System.out.println("You Won Congraulations you selected "+user_value+" computer selected "+computer_value);
                    count=count+1;
                }
                
            }
            else{
                System.out.println("Wrong Entry");
            }
        }
        if (computer_points>2) {
            System.out.println("You Lost Computer Points out of 5 are "+computer_points);
            
        }
        else{
            System.out.println("You Won You Points Out of 5 are "+(5-computer_points));
        }
    }
}
