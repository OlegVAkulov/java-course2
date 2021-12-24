package work_with_files;

import java.io.*;

public class CopyEz2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream(
                "C:\\Users\\akulo\\Desktop\\Programs\\java.png");
             FileOutputStream outputStream = new FileOutputStream(
                     "java.png")
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
//            String line;
//            while ((line = reader.readLine()) != null){
//                writer.write(line);
//                writer.write('\n');
//            }
            System.out.println("Done");

        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
