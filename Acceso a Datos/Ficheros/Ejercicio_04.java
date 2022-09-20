import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class main3 {

    public static void main(String[] args) throws IOException {

        // variables
        String string = "";

        FileReader fr = new FileReader("C:\\Users\\oscar\\IdeaProjects\\Notes.txt");
        BufferedReader br = new BufferedReader(fr);

        StringBuilder sb = new StringBuilder();
        String lnotas = br.readLine();

        while(lnotas != null){
            sb.append(lnotas);
            lnotas = br.readLine();
        }

        String []notas = sb.toString().split("[|]");
        double media = 0;

        for (String nota:notas) {
            media += Double.parseDouble(nota);
        }

        media = media/notas.length;

        System.out.println(media);

    }
    }
