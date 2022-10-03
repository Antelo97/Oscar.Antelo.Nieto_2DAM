import java.io.*;
import java.nio.charset.StandardCharsets;

public class E05_InputStreamReader_OutputStreamWriter {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;

        try {
            // transcribir de UTF-8 a iso8859-1
            String pathUTF8 = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\UTF-8.txt";
            String pathASCII = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\ASCII.txt";

            fis = new FileInputStream(pathUTF8);
            fos = new FileOutputStream(pathASCII);

            isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            osw = new OutputStreamWriter(fos, "ISO-8859-1");

            int data = fis.read();

            while(data != -1) {
                char character = (char) data;
                System.out.println(character);
                osw.write(character);
                data = isr.read();
            }

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // cerrado de recursos
            try {
                // importante respetar el orden de cerrado
                if(isr != null) isr.close();
                if(osw != null) osw.close();
                if(fis != null) isr.close();
                if(fos != null) fos.close();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}