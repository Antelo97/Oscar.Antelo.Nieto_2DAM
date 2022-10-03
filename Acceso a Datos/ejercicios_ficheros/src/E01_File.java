import java.io.File;
import java.io.IOException;

public class E01_File {

    public static void main(String[] args) {

        try {
            // creamos el directorio 1
            String folder_01Path = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\folder_01";
            File folder_01 = new File(folder_01Path);

            if (!folder_01.exists()) {
                folder_01.mkdir();
            } else {
                System.err.println(folder_01.getName() + " ya existe");
            }

            // creación del Fichero 1 dentro del Directorio 1
            String file_01Path = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\folder_01\\file_01.txt";
            File file_01 = new File(file_01Path);

            if (!file_01.exists()) {
                file_01.createNewFile();
            } else {
                System.err.println(file_01.getName() + " ya existe");
            }

            // creación del Fichero 2 dentro del Directorio 1
            String file_02Path = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\folder_01\\file_02.txt";
            File file_02 = new File(file_02Path);

            if (!file_02.exists()) {
                file_02.createNewFile();
            } else {
                System.err.println(file_02.getName() + " ya existe");
            }

            // creación del Directorio 2
            String folder_02Path = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\folder_02";
            File folder_02 = new File(folder_02Path);

            if (!folder_02.exists()) {
                folder_02.mkdir();
            } else {
                System.err.println(folder_02.getName() + " ya existe");
            }

            // creación del Fichero 3 dentro del Directorio 2
            String file_03Path = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\folder_02\\file_03.txt";
            File file_03 = new File(file_03Path);

            if (!file_03.exists()) {
                file_03.createNewFile();
            } else {
                System.err.println(file_03.getName() + " ya existe");
            }

            // creación del Fichero 4 dentro del Directorio 2
            String file_04Path = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\root\\folder_02\\file_04.txt";
            File file_04 = new File(file_04Path);

            if (!file_04.exists()) {
                file_04.createNewFile();
            } else {
                System.err.println(file_04.getName() + " ya existe");
            }
        } catch (Exception e) {
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
        for (File f : list) {
            if (f.isDirectory()) {
                System.out.println("Directorio: " + f.getAbsoluteFile());
                recorrerFicheros((f.getAbsolutePath()));
            } else {
                System.out.println("Fichero: " + f.getAbsoluteFile());
            }
        }
    }
}