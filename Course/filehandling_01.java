import java.io.File;
public class filehandling_01 
{
    public static void main (String [] args)
    {
        System.out.println("Hello");
        File myFile = new File("tutfilehandling.txt");
        myFile.createNewFile();
        
    }
}
