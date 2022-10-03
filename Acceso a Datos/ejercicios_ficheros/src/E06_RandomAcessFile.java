import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class E06_RandomAcessFile {

    public static void main(String[] args) {

        ArrayList<Alumno> students = new ArrayList<Alumno>();

        students.add(new Alumno("Unai", 27, 8.8));
        students.add(new Alumno("Ayman", 25, 10));
        students.add(new Alumno("Ona", 28, 5.8));
        students.add(new Alumno("Celso", 21, 7.9));
        students.add(new Alumno("Esperanza", 29, 7.5));

        RandomAccessFile raf = null;
        // FileOutputStream fos = null;

        try {

            raf = new RandomAccessFile("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\students.txt", "rw");
            // fos = new FileOutputStream("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\students.txt");

            // escribimos alumnos en el fichero
            for(Alumno student : students){

                StringBuilder sb = new StringBuilder(student.getName());
                sb.setLength(20);

                raf.writeChars(sb.toString()); // ocupa 20*2 = 40
                raf.writeInt(student.getAge()); // ocupa 4
                raf.writeDouble(student.getAverageGrade()); // ocupa 8
            }

            // nos posicionamos en el segundo alumno
            raf.seek(52*(2-1));

            // recuperamos los atributos del segundo alumno
            String name = "";
            //al ser .readChar() lee de 2 en 2, por eso hacemos 20 iteraciones y no 40
            for(int i = 0; i < 20; i++){
                name += raf.readChar();
            }

            int age = raf.readInt();
            double averageGrade = raf.read();

            // imprimimos los atributos
            System.out.println(name + " - " + age + " - " + averageGrade);

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            // cerrado de recursos
            try {

            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
