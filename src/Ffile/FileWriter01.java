package Ffile;

import java.io.File;
import java.io.FileWriter;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);){
            fw.write("Hello World\n Ola mundo");
            fw.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
