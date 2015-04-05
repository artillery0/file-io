public class NewStuff
{
    public static void main(String[] args)
    {

        test1(1, 2, 3);
    }

    public static void test1(int... args)
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }

}
