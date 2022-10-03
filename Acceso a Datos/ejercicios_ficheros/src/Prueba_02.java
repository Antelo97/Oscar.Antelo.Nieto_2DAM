import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Prueba_02 {

    public static void main(String[] args) throws IOException {

        // variables
        String string = "";
        int ASCIcode = 0;

        FileInputStream targetPath = new FileInputStream("C:\\Users\\oscar\\IdeaProjects\\Target_File.txt");

        while(ASCIcode != -1){

            ASCIcode = targetPath.read();

            if(ASCIcode != -1){
                string += (char) ASCIcode;
            }
        }

        targetPath.close();

        System.out.print(string);
    }
}