import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ej_02_FileInputStream {

    public static void main(String[] args) {

        FileInputStream fis = null;
        String path = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\file_fis.txt";

        try {
            fis = new FileInputStream(path);

            // '.read()' devuelve un -1 cuando se llega al final del documento
            int ASCI = fis.read();

            String decOutput = "";
            String hexOutput = "";
            String charOutput = "";

            while(ASCI != -1) {
                decOutput += ASCI + "-";
                hexOutput += Integer.toHexString(ASCI) + "-";
                charOutput += (char) ASCI + "-";
                ASCI = fis.read();
            }

            System.out.println("a) Salida decimal: " + decOutput);
            System.out.println("b) Salida hexadecimal: " + hexOutput);
            System.out.println("c) Salida de caracteres: " + charOutput);

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            //cerrado de recursos
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
