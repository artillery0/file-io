import java.io.File;


public class App
{
    public static void main(String[] args)
    {
        File file = new File("/");
        String[] fileList = file.list();
        for (String name : fileList)
        {
            System.out.print(name + " ");
        }
        System.out.println();
        // dsfdsfdswerewqrweqr
        // i feel a great deal of stress
    }
}
