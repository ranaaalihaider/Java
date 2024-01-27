import java.util.Scanner;

public class tut_31_methods_practise {
    static int average(int x,int y){
        int c;
        c=(x+y)/2;
        return c;

    }
    public static void main(String[] args) {
        System.out.println("Hello ");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a=input.nextInt();
        System.out.print("Enter Number 2 : ");
        int b=input.nextInt();
        System.out.print("Your Average is : ");
        int z=average(a, b);
        System.out.print(z);
    }
}
