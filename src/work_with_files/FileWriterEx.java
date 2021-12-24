package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";
        String s = "Hello";

        try(FileWriter writer = new FileWriter("test2.txt", true)) {

//            writer.write(rubai);
            writer.write(s);

//            writer = new FileWriter("C:\\Users\\akulo\\Desktop\\Programs\\test1.txt");
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
