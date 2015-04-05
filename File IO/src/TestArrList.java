import java.util.ArrayList;

public class TestArrList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        ArrayList<String> sList = new ArrayList<>();
        sList.add("hello");
        sList.add("how are you");
        sList.add("this is insane");

        for (Integer integer : myList)
        {
            System.out.println(integer);
        }

        for (int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }

        for (String string : sList)
        {
            System.out.println(string);
        }
    }
}
