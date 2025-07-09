package file;
import java.io.File;
import java.io.IO;
import java.io.IOException;


public class Filemanipulation {
    public static void main(String[] args) throws IOException{
        File myfile =new File("Example.txt");
        myfile.createNewFile();
        System.out.println("created file "+ myfile.getAbsolutePath());
    }

}
