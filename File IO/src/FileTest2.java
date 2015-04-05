import java.io.File;
import java.io.FilenameFilter;


public class FileTest2
{
    public static void main(String[] args)
    {
        File file = new File("/");
        String[] files = file.list(new FilenameFilter()
        {

            @Override
            public boolean accept(File dir, String name)
            {
                if (name.toLowerCase().endsWith(".csv"))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        });
        for (String f : files)
        {
            System.out.println(f);
        }
    }
}
