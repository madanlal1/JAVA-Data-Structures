import java.util.Scanner;
import java.io.*;

public class NLArray {

    public static void main(String[] args) {

        try {

            File file = new File("read.txt");
            Scanner read = new Scanner(file);

            while (read.hasNextLine()) {

                String data = read.nextLine();
                System.out.println(data);
            }

            read.close();
        }
        catch(FileNotFoundException e) {

            System.out.println(e);
        }
}
}