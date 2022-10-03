import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class E07_ObjectInputStream_ObjectOutputStream {

    public static void main(String[] args) throws ParseException {

        ArrayList<Persona> people = new ArrayList<Persona>();
        String pathFile = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\people.txt";

        people.add(new Persona("Eugenio", "Barea", (new SimpleDateFormat("dd/MM/yyyy").parse("21/09/1995"))));
        people.add(new Persona("Carme", "Hermoso", (new SimpleDateFormat("dd/MM/yyyy").parse("25/03/1999"))));
        people.add(new Persona("Iria", "Ávila", (new SimpleDateFormat("dd/MM/yyyy").parse("27/04/1997"))));
        people.add(new Persona("Carles", "Llopis", (new SimpleDateFormat("dd/MM/yyyy").parse("07/12/1991"))));
        people.add(new Persona("María", "Pilar", (new SimpleDateFormat("dd/MM/yyyy").parse("10/07/1996"))));

        PersonaMapping.escribirPersonas(pathFile, people);
        people = PersonaMapping.leerPersonas(pathFile);

        for (Persona person : people) {
            System.out.println(person.toString());
        }
    }
}

