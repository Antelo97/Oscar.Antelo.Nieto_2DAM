import java.io.File;
import java.io.IOException;

public class Directorios {

    public static void main(String[] args) {

        // creación del Directorio 1
        File directory_01 = new File("C:\\Users\\oscar\\IdeaProjects\\Directory_01");

        if (!directory_01.exists()) {
            directory_01.mkdir();
        } else {
            System.err.println("El Directorio 1 ya existe");
        }

        // creación del Fichero 1 dentro del Directorio 1
        File file_01 = new File("C:\\Users\\oscar\\IdeaProjects\\Directory_01\\File_01.txt");

        if (!file_01.exists()) {
            try {
                file_01.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.err.println("El Fichero 1 ya existe");
        }

        // creación del Fichero 2 dentro del Directorio 1
        File file_02 = new File("C:\\Users\\oscar\\IdeaProjects\\Directory_01\\File_02.txt");

        if (!file_02.exists()) {
            try {
                file_02.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.err.println("El Fichero 2 ya existe");
        }

        // creación del Directorio 2
        File directory_02 = new File("C:\\Users\\oscar\\IdeaProjects\\Directory_02");

        if (!directory_02.exists()) {
            directory_02.mkdir();
        } else {
            System.err.println("El Directorio 2 ya existe");
        }

        // creación del Fichero 3 dentro del Directorio 2
        File file_03 = new File("C:\\Users\\oscar\\IdeaProjects\\Directory_02\\File_03.txt");

        if (!file_03.exists()) {
            try {
                file_03.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.err.println("El Fichero 3 ya existe");
        }

        // creación del Fichero 4 dentro del Directorio 2
        File file_04 = new File("C:\\Users\\oscar\\IdeaProjects\\Directory_02\\File_04.txt");

        if (!file_04.exists()) {
            try {
                file_04.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.err.println("El Fichero 4 ya existe");
        }
    }
}