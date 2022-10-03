import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class E08_XML_DOM_Lectura {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\mascotas.xml";
        File xmlFile = new File(filePath);
        ArrayList<Mascota> pets = new ArrayList<Mascota>();

        try {
            // parseamos documento
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            // ¿?
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("mascota");

            // recorremos la lista de nodos
            for (int i = 0; i < nList.getLength(); i++) {

                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    // leemos los elementos
                    Element elem = (Element) nNode;

                    String valName = elem.getAttribute("Nombre");

                    Node node1 = elem.getElementsByTagName("tipo").item(0);
                    // la expresión a la derecha del igual es un operador ternario
                    String valType = (node1 != null) ? node1.getTextContent() : null;

                    Node node2 = elem.getElementsByTagName("edad").item(0);
                    String valAge = (node2 != null) ? node2.getTextContent() : null;

                    Node node3 = elem.getElementsByTagName("genero").item(0);
                    String valGender = (node3 != null) ? node3.getTextContent() : null;

                    // creamos la mascota y asignamos valores leídos
                    Mascota pet = new Mascota();
                    pet.setName(valName);
                    pet.setType(valType);

                    if (valAge != null) {
                        pet.setAge(Integer.parseInt(valAge));
                    }

                    pet.setGender(valGender);

                    // añadimos la mascota a la lista
                    pets.add(pet);
                }
            }

            // creamos a Leo y lo agregamos
            Mascota pet = new Mascota();
            pet.setName("Leo");
            pet.setType("Gato");

            pets.add(pet);

            // recorremos las mascotas
            for (Mascota objPet : pets) {

                // si encontramos a Churchill le ponemos de género 'Macho'
                if (objPet.getName().equals("Churchill")) {
                    objPet.setGender("Macho");
                }

                System.out.println(objPet.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}