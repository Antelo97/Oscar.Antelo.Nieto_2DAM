import java.io.File;
import java.io.IOException;

public class Ej_01_File {

    public static void main(String[] args) {

        try {
            // creación del Directorio 1
            File directory_01 = new File("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\Directory_01");

            if (!directory_01.exists()) {
                directory_01.mkdir();
            } else {
                System.err.println(directory_01.getName() + " ya existe");
            }

            // creación del Fichero 1 dentro del Directorio 1
            File file_01 = new File("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\Directory_01\\File_01.txt");

            if (!file_01.exists()) {
                file_01.createNewFile();
            } else {
                System.err.println(file_01.getName() + " ya existe");
            }

            // creación del Fichero 2 dentro del Directorio 1
            File file_02 = new File("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\Directory_01\\File_02.txt");

            if (!file_02.exists()) {
                file_02.createNewFile();
            } else {
                System.err.println(file_02.getName() + " ya existe");
            }

            // creación del Directorio 2
            File directory_02 = new File("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\Directory_02");

            if (!directory_02.exists()) {
                directory_02.mkdir();
            } else {
                System.err.println(directory_02.getName() + " ya existe");
            }

            // creación del Fichero 3 dentro del Directorio 2
            File file_03 = new File("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\Directory_02\\File_03.txt");

            if (!file_03.exists()) {
                file_03.createNewFile();
            } else {
                System.err.println(file_03.getName() + " ya existe");
            }

            // creación del Fichero 4 dentro del Directorio 2
            File file_04 = new File("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\Directory_02\\File_04.txt");

            if (!file_04.exists()) {
                file_04.createNewFile();
            } else {
                System.err.println(file_04.getName() + " ya existe");
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        // listado recursivo de los directorios y ficheros
        System.out.println();
        recorrerFicheros("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root");
    }

    private static void recorrerFicheros(String path) {

        File root = new File(path);
        // este array únicamente contiene los directorios/archivos inmediatos de la ruta
        File[] list = root.listFiles();

        if (list == null) return;

        // se podría usar un bucle 'for', pero el 'for each' es más eficiente
        for (File f : list){
            if (f.isDirectory()){
                System.out.println("Directorio: " + f.getAbsoluteFile());
                recorrerFicheros((f.getAbsolutePath()));
            }
            else {
                System.out.println("Fichero: " + f.getAbsoluteFile());
            }
        }
    }
}