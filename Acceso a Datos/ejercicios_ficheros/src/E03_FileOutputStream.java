import java.io.*;

public class E03_FileOutputStream {

    public static void main(String[] args) {

        String sourcePath = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\file_source.txt";
        String copyPath = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\file_copy.txt";

        try {
            // comprobación de la existencia del fichero de origen
            File sourceFile = new File(sourcePath);

            if (!sourceFile.exists()) {
                System.err.println("No existe ningún fichero de origen");
                return;
            }

            // comprobación de la existencia del fichero de destino
            File copyFile = new File(copyPath);

            if (copyFile.exists()) {
                System.err.println("Ya existe un fichero de destino");
                return;
            }

            // leer el contenido del fichero de origen y escribirlo en el fichero de destino
            if(copiarFicheros(sourceFile, copyFile)){
                System.err.println("¡Ficheros copiados con éxito!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static boolean copiarFicheros(File sourceFile, File copyFile) {

        // declaración de los objetos de lectura y escritura
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            // instanciamiento de los objetos de lectura y escritura
            input = new FileInputStream(sourceFile);
            // en este punto es cuando se genera en nuestro PC el fichero de destino
            output = new FileOutputStream(copyFile);

            // leemos byte a byte el archivo de origen (FileInputStream)
            int ASCI = input.read();

            while (ASCI != -1) {
                output.write(ASCI);
                ASCI = input.read();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            // cerrado de recursos
            try {

                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
