import java.util.Scanner;

public class tut_016_conditionals {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("Yes You can Drive !");
        }
        else{
            System.out.println("You can not Drive!");
        }
    }
}
