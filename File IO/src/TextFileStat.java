import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileStat
{
    private static int[] counter;

    public static void main(String[] args)
    {
        // System.out.println("first change");
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<		WELCOME TO WORD COUNTER		     >>>>>>>>>>>>>>         ");
        System.out.println();
        String inputFilePath = "/home/alex/Desktop/";
        inputFilePath += args[0];
        System.out.println("file location: " + inputFilePath);
        BufferedReader bfread;
        StringBuffer result = new StringBuffer();
        int c;
        try
        {
            bfread = new BufferedReader(new FileReader(inputFilePath));
            while (((c = bfread.read()) != -1))
            {
                result.append((char) c);
            }
        }
        catch (FileNotFoundException e)
        {
            System.err.println("File NOT found!!! ");
        }
        catch (IOException e)
        {
            System.err.println("io issue!!! ");
        }
        counter = new int[26];
        for (int i = 0; i < result.length(); i++)
        {
            switch (result.charAt(i))
            {
                case 'a':
                    counter[0]++;
                    break;
                case 'b':
                    counter[1]++;
                    break;
                case 'c':
                    counter[2]++;
                    break;
                case 'd':
                    counter[3]++;
                    break;
                case 'e':
                    counter[4]++;
                    break;
                case 'f':
                    counter[5]++;
                    break;
                case 'g':
                    counter[6]++;
                    break;
                case 'h':
                    counter[7]++;
                    break;
                case 'i':
                    counter[8]++;
                    break;
                case 'j':
                    counter[9]++;
                    break;
                case 'k':
                    counter[10]++;
                    break;
                case 'l':
                    counter[11]++;
                    break;
                case 'm':
                    counter[12]++;
                    break;
                case 'n':
                    counter[13]++;
                    break;
                case 'o':
                    counter[14]++;
                    break;
                case 'p':
                    counter[15]++;
                    break;
                case 'q':
                    counter[16]++;
                    break;
                case 'r':
                    counter[17]++;
                    break;
                case 's':
                    counter[18]++;
                    break;
                case 't':
                    counter[19]++;
                    break;
                case 'u':
                    counter[20]++;
                    break;
                case 'v':
                    counter[21]++;
                    break;
                case 'w':
                    counter[22]++;
                    break;
                case 'x':
                    counter[23]++;
                    break;
                case 'y':
                    counter[24]++;
                    break;
                case 'z':
                    counter[25]++;
                    break;
                case 'A':
                    counter[0]++;
                    break;
                case 'B':
                    counter[1]++;
                    break;
                case 'C':
                    counter[2]++;
                    break;
                case 'D':
                    counter[3]++;
                    break;
                case 'E':
                    counter[4]++;
                    break;
                case 'F':
                    counter[5]++;
                    break;
                case 'G':
                    counter[6]++;
                    break;
                case 'H':
                    counter[7]++;
                    break;
                case 'I':
                    counter[8]++;
                    break;
                case 'J':
                    counter[9]++;
                    break;
                case 'K':
                    counter[10]++;
                    break;
                case 'L':
                    counter[11]++;
                    break;
                case 'M':
                    counter[12]++;
                    break;
                case 'N':
                    counter[13]++;
                    break;
                case 'O':
                    counter[14]++;
                    break;
                case 'P':
                    counter[15]++;
                    break;
                case 'Q':
                    counter[16]++;
                    break;
                case 'R':
                    counter[17]++;
                    break;
                case 'S':
                    counter[18]++;
                    break;
                case 'T':
                    counter[19]++;
                    break;
                case 'U':
                    counter[20]++;
                    break;
                case 'V':
                    counter[21]++;
                    break;
                case 'W':
                    counter[22]++;
                    break;
                case 'X':
                    counter[23]++;
                    break;
                case 'Y':
                    counter[24]++;
                    break;
                case 'Z':
                    counter[25]++;
                    break;
            }
        }
        // printNumberInfo(counter);
        printInfo();
        System.out.println(" ...........................  END   .....................................");
    }

    private static void printInfo()
    {
        printBar(counter);
        printSum(1);
        printMax(1);
        printMin(1);
    }

    private static int printMin(int print)
    {
        int recordMin = 0;
        int min = counter[0];
        for (int i = 0; i < counter.length; i++)
        {
            if (counter[i] < min)
            {
                min = counter[i];
                recordMin = i;
            }
        }
        if (print == 1)
        {
            System.out.print("æœ€å°‘è§�å­�æ¯�: " + Character.toUpperCase((char) (recordMin + 97)));
            System.out.println(" .......................................... ä½¿ç”¨æ¬¡æ•°: " + min);
        }
        return min;
    }

    private static int printMax(int print)
    {
        int max = counter[0];
        int markMax = 0;
        for (int i = 0; i < counter.length; i++)
        {
            if (counter[i] > max)
            {
                max = counter[i];
                markMax = i;
            }
        }
        if (print == 1)
        {
            System.out.print("æœ€å¸¸è§�å­�æ¯�: " + Character.toUpperCase((char) (markMax + 97)));
            System.out.println(" ..................................... ä½¿ç”¨æ¬¡æ•°: " + max);
        }
        return max;
    }

    private static int printSum(int print)
    {
        int sum = 0;
        for (int i = 0; i < counter.length; i++)
        {
            sum += counter[i];
        }
        if (print == 1)
        {
            System.out.println("Letter count: " + sum);
        }
        return sum;
    }

    private static void printNumberInfo(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print((char) (i + 97) + " ---> ");
            System.out.println((arr[i]));
        }
    }

    private static void printBar(int[] arr)
    {
        int sum = printSum(0);
        for (int i = 0; i < arr.length; i++)
        {
            int starNum = (int) Math.round((double) arr[i] / sum * 600);
            System.out.print((char) (i + 97) + " ... ");
            printStar(starNum);
        }
    }

    private static void printStar(int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.print("\u2691");
            // System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

}
