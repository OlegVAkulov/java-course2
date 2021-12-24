package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("test2.txt");
            FileWriter writer = new FileWriter("test2.txt", true);
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
