import java.util.Scanner;

public class tut_31_02_calling_methods {
    void logic(int x,int y){
        if (x > y) {
            System.out.println("First Number is Greater");
        }
        else if(y>x) {
            System.out.println("Number 2 is Greater");
        }
        else{
            System.out.println("Both are Equall");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a=input.nextInt();
        System.out.print("Enter Number 2 : ");
        int b=input.nextInt();
        tut_31_02_calling_methods obj= new tut_31_02_calling_methods();
        obj.logic(a, b);
    }
}
