

import java.io.File;

public class filehandling {
    public static void main(String[] args) {
        File file = new File("Example.txt");
        if(file.isDirectory()) {
            System.out.println("it is a directory:");
            File[] files = file.listFiles();
            if(files !=null) {
                System.out.println("files in the directory:");
                for(File f : files) {
                    System.out.println(f.getName());
                }
            }else{
                System.out.println("this is not a dictionery:");
            }
        }
    }

}
