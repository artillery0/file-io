import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileCreate2
{
    public static void main(String[] args)
    {

        PrintWriter pw = null;

        try
        {
            pw = new PrintWriter("my lovely file");
        }
        catch (FileNotFoundException e)
        {
        }
        pw.println("hey man");
        pw.println("this is a lovely system");
        pw.close();

    }
}
