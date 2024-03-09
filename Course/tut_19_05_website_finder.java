import java.util.Scanner;

public class tut_19_05_website_finder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Website : ");
        String website=input.nextLine();
        if (website.endsWith(".com")) {
            System.out.println("Commercial Website");
        }
        else if (website.endsWith(".org")) {
            System.out.println("Organization Website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("Indian Website");
        }
        else{
            System.out.println("No Record in Data");
        }
    }
}
