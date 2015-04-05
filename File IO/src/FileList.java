import java.io.File;


public class FileList
{
    public static void main(String[] args)
    {
        File file = new File("/");
        String[] fileList = file.list();
        for (String name : fileList)
        {
            System.out.println(name + " ");
        }
        System.out.println();
        // dsfdsfdswerewqrweqr
        // i feel a great deal of stress
    }
}
