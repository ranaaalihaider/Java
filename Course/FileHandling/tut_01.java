import java.io.File;
public class tut_01 
{
    public static void main (String [] args)
    {
        System.out.println("Hello");
        File myFile = new File("tutfilehandling.txt");
        try {
            myFile.createNewFile();
        
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Unable to creat file");
        }
    }
}
