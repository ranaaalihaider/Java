import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class tut_001 
{
    public static void main(String[] args) 
    {
        /* 
        File myFile=new File("cwhtut01file.txt");
        try {
            System.out.println("File created");
            myFile.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("unable to creat file");
        }
        */
        //code to write to a file
        /* 
        try {
            FileWriter fileWriter= new FileWriter("cwhtut01file.txt");
            System.out.println("written sucess");
            
            fileWriter.write("This is first written code in file ");
            fileWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("unable to write");
        }
        */
        try 
        {
            
        File myFile=new File("cwhtut01filw.txt");
        Scanner sc= new Scanner(myFile);
        System.out.println("file read sucess");
            while (sc.hasNextLine())
            {
                String line=sc.hasNextLine();
                System.out.println(line);
            }
            sc.close();
            
        
        } catch (Exception e) 
        {
            // TODO: handle exception
            System.out.println("file read error");
        }
        

        
    }
}
