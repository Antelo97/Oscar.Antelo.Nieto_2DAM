import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main2 {

    public static void main(String[] args) throws IOException {

        // variables
        String string = "";
        int ASCIcode = 0;

        File parentFile = new File("C:\\Users\\oscar\\IdeaProjects\\Parent_File.txt");

        if (!parentFile.exists()) {
            try {
                parentFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.err.println("El Fichero Padre ya existe");
        }

        FileInputStream parentPath = new FileInputStream("C:\\Users\\oscar\\IdeaProjects\\Parent_File.txt");

        File copyFile = new File("C:\\Users\\oscar\\IdeaProjects\\Copy_File.txt");

        if (!copyFile.exists()) {
            try {
                copyFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.err.println("El Fichero Copia ya existe");
        }

        FileOutputStream copyPath = new FileOutputStream("C:\\Users\\oscar\\IdeaProjects\\Copy_File.txt");

        while(ASCIcode != -1){

            ASCIcode = parentPath.read();

            if(ASCIcode != -1){
                copyPath.write(ASCIcode);
            }
        }
    }

    }
