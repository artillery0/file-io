import java.util.LinkedList;
import java.util.Queue;

public class TestQueue
{

    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 10; i++)
        {
            q.add(i);
        }
        System.out.println("Queue is FIFO structure!");
        while (!q.isEmpty())
            System.out.println(q.remove());

    }
}
