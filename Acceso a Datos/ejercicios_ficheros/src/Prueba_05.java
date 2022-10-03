import java.io.*;
import java.nio.charset.StandardCharsets;

public class Prueba_05 {

    public static void main(String[] args) throws IOException {

        // variables

        FileInputStream FIS = null;
        InputStreamReader ISR = null;
        OutputStreamWriter OSW = null;
        FileOutputStream FOS = null;

        FIS = new FileInputStream("C:\\Users\\oscar\\IdeaProjects\\CodeOrigen.txt");
        ISR = new InputStreamReader(FIS, StandardCharsets.UTF_8);

        FOS = new FileOutputStream("C:\\Users\\oscar\\IdeaProjects\\CodeDestino.txt");
        OSW = new OutputStreamWriter(FOS, StandardCharsets.ISO_8859_1);

        int contenido = ISR.read();

        while(contenido != -1){
            char caracter = (char) contenido;
            System.out.print(caracter);
            OSW.write(contenido);
            contenido = ISR.read();
        }

        FOS.close();
        FIS.close();
        ISR.close();
        OSW.close();
    }
    }
