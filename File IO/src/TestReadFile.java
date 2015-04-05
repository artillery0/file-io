import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile
{
    public static void main(String[] args)
    {
        BufferedReader br;
        String strLine;

        try
        {
            br = new BufferedReader(new FileReader("my lovely file"));

            while ((strLine = br.readLine()) != null)
            {
                System.out.println(strLine);
            }


        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }
        catch (IOException e)
        {
            System.out.println("io exception");
        }

    }
}
