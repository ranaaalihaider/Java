import java.util.Scanner;
public class task_01 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int mark=0;
        String name="";
        while (true) 
        {
            System.out.print("Enter Reg No : ");
            int regNo=input.nextInt();
            input.nextLine();
            if (regNo==0) 
            {
                System.out.println("Exit Done");
                break;
            }
            System.out.print("Enter Name : ");
            String new_name=input.nextLine();
            System.out.print("Enter Marks : ");
            int new_marks=input.nextInt();
            input.nextLine();
            if (new_marks>mark) 
            {
                mark=new_marks;
                name=new_name;
            }
            
        }
        System.out.printf(" %s has maximum marks %d",name,mark);
    }
}
