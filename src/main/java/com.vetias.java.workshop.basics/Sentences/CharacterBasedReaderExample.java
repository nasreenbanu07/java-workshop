import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.crypto.Data;

public class CharacterBasedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader Reader = new BufferedReader(new FileReader("Example.txt")))
        {
              String line;
                while((line=Reader.readLine())!=null) {
                    System.out.println(line);
                }
        } catch (IOException e) {
            System.out.println("An error accured while reading the file:");
        }


    }
    

}
