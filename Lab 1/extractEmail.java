import java.util.Scanner;
import java.io.*;

public class extractEmail {

    public static void main(String[] args) {

        try {

            File file = new File("email.txt");
            Scanner read = new Scanner(file);

            while (read.hasNextLine()) {

                String data = read.nextLine();
                if(data.contains("@"))
                    System.out.println(data);
            }

            read.close();
        }
        catch(FileNotFoundException e) {

            System.out.println(e);
        }
}
}