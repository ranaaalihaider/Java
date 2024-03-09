import java.util.Scanner;
public class tut_013_strings {
    public static void main(String[] args) {
        String name="Ali Haider";
        System.out.println(name);
        //Now we will see different methods of printing 
        int a =6;
        float b= 5.35765f;
        //following both have same output
        System.out.printf("The value of a is %d and the value of b is %f ",a,b);
        System.out.format("The value of a is %d and the value of b is %f ",a,b);
        System.out.println("Now we will take and print string");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(str);


    }
}
