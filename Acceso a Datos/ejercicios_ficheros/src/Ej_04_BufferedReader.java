import java.io.*;

public class Ej_04_BufferedReader {

    public static void main(String[] args) {

        FileReader frNotes = null;
        BufferedReader brNotes = null;

        try {

            frNotes = new FileReader("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\notas.txt");
            brNotes = new BufferedReader(frNotes);

            // extracción del contenido de notas.txt e introdcción del mismo es una String
            StringBuilder allNotes = new StringBuilder();
            String lineNote = brNotes.readLine();

            while(lineNote != null){
                allNotes.append(lineNote);
                lineNote = brNotes.readLine();
            }

            // cálculo de la nota media
            String[] notes = allNotes.toString().split("[|]");
            double average = 0.0;

            for(String note : notes){
                average += Double.parseDouble(note);
            }

            average = average / notes.length;

            System.out.println("Nota media: " + average);

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // cerrado de recursos
            try {

                if(frNotes != null) frNotes.close();
                if(brNotes != null) brNotes.close();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}