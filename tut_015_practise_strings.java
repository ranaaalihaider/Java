import java.util.Scanner;

public class tut_015_practise_strings {
    public static void main(String[] args) {
        String statement_1="This is a Practice string ";
        System.out.println("Converting Statement to lower case ");
        System.out.println(statement_1);
        System.out.println("Now Lower case is following");
        String statement_2=statement_1.toLowerCase();
        System.out.println(statement_2);
        //problem 2
        //replace space with _
        System.out.println("Replace space with _");
        String statement_3=statement_1.replace(' ', '_');
        System.out.println(statement_3);
        //problem 3
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=input.nextLine();
        System.err.printf("Dear %s Thanks \n",name);
        //2ND Method
        String Hello_Statement="Hello Dear <|name|> How are you";
        Hello_Statement=Hello_Statement.replace("<|name|>",name);
        System.out.println(Hello_Statement);
        //Problem 4 
        //Detect Double and Triple Space
        String space="Testing  Double and   Triple Space";
        System.out.println(space.indexOf("  ")+(" Index of Double Space"));
        System.out.println(space.indexOf("   ")+(" Index of Triple Space"));
        //Problem 5 using escap sequence
        String line="Dear Ali\n\t\" This Java Course is Nice \" \nThanks ";
        System.out.println(line);
    }
}
