import java.io.IOException;

public class shutdown {
    public static void main(String[] args) {
        Runtime run=Runtime.getRuntime();
        try
        {
            run.exec("shutdown /s");

        }
        catch(IOException e)
        {
            System.out.println("Error");
        }

    }
}
