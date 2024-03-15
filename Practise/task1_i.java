import java.util.Scanner;
public class task1_i {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1=input.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2=input.nextInt();
        if (num1<=num2)
        {
            for(int i=num1;i<=num2;i++ )
            {
                System.out.print(i+" ");
            }
        }
        else
        {
            System.out.println("Wrong Input You hav to Enter Like A<=B");
        }
    }
}
