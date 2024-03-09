import java.util.Scanner;

public class tut_05_input {
    public static void main(String[] args) {
        System.out.println("Input Taking Code : ");
        //making scanner to take inputs
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a= sc.nextInt(); //using scanner taht will take input to set input on a specific variavle 
        System.out.println("Enter Number 2");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("The Sum of Number 1 and 2 is : ");
        System.out.println(sum);
        System.out.println("Enter Float Values 1 : ");
        float fl1= sc.nextFloat();
        System.out.println("Enter Float Values 2 : ");
        float fl2= sc.nextFloat();
        float total=fl1+fl2;
        System.out.println("Your Float Sum is : ");
        System.out.println(total);
        System.out.println("Enter values to check it is integer or not ");
        boolean b1=sc.hasNextInt();
        System.out.println(b1); 
        System.out.println("Now we will taken input of string");
        //making scanner again 
        Scanner st=new Scanner(System.in);
        String str=st.nextLine();
        System.out.println(str);
    }
    
}
