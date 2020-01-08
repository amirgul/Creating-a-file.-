import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        String fileName = "text1.txt";
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(new FileOutputStream(fileName, true));

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            System.exit(0);
        }
        System.out.println("Enter three line of Code");
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i<3; i++)
        {
            String line = keyboard.nextLine();
            outputStream.println(line);
        }
        outputStream.close();


    }
}
