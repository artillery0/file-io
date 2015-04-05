import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileTest3
{
    public static void main(String a[])
    {
        BufferedReader br = null;
        String strLine = "";
        try
        {
            br = new BufferedReader(new FileReader("love"));
            while ((strLine = br.readLine()) != null)
            {
                System.out.println(strLine);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Unable to find the file: fileName!!!!!!!!!");
        }
        catch (IOException e)
        {
            System.out.println("Unable to read the file: fileName!!!!!!!!!");
        }
    }
}
