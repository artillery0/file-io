import java.util.LinkedList;
import java.util.Stack;

public class TestStack
{
    public static void main(String[] args)
    {

        Stack<Integer> sk = new Stack<>();
        for (int i = 0; i < 10; i++)
        {
            sk.push(i);
        }

        while (!sk.isEmpty())
        {
            System.out.println(sk.pop());
        }

    }
}
