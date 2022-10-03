import java.io.*;
import java.lang.reflect.Executable;
import java.util.ArrayList;

public class PersonaMapping {

    public static boolean escribirPersonas(String filePath, ArrayList<Persona> people) {

        // declaramos variables
        FileOutputStream FOS = null;
        ObjectOutputStream OOS = null;

        try {

            FOS = new FileOutputStream(filePath);
            OOS = new ObjectOutputStream(FOS);

            // recorremos la lista de personas y escribimos en el fichero
            for (Persona person : people) {
                OOS.writeObject(person);
            }

        } catch (Exception e) {

            e.printStackTrace();
            return false;

        } finally {

            // cerramos recuros
            try {

                if (FOS != null) FOS.close();
                if (OOS != null) OOS.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return true;
    }

    public static ArrayList<Persona> leerPersonas(String pathFile) {

        ArrayList<Persona> people = new ArrayList<Persona>();

        // declaramos variables
        FileInputStream FIS = null;
        ObjectInputStream OIS = null;

        try {

            FIS = new FileInputStream(pathFile);
            OIS = new ObjectInputStream(FIS);

            while (true) {

                try {

                    System.out.println(OIS.readObject());
                    people.add((Persona) OIS.readObject());

                } catch (EOFException e) {
                    return people;
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
            return null;

        } finally {

            // cerramos recursos
            try {

                if (FIS != null) FIS.close();
                if (OIS != null) OIS.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}