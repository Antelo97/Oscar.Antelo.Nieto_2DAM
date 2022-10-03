import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class Prueba_09 {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\2º CFGS DAM\\Acceso a Datos\\ejercicios_ficheros\\mascotasMod.xml";
        File xmlFile = new File(filePath);
        ArrayList<Mascota> pets = new ArrayList<Mascota>();

        try {
            // parseamos documento
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            // ¿?
            doc.getDocumentElement().normalize();

            // obtener el elemento raíz del documento
            Element root = doc.getDocumentElement();

            // creamos un nuevo elemento
            Element ePet = doc.createElement("mascota");
            ePet.setAttribute("Nombre", "Leo");
            root.appendChild(ePet);

            Element eType = doc.createElement("tipo");
            eType.appendChild(doc.createTextNode("Gato"));
            ePet.appendChild(eType);

            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
            DOMSource domSource = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(domSource, result);

//            NodeList nList = doc.getElementsByTagName("mascota");
//
//            // recorremos la lista de nodos
//            for (int i = 0; i < nList.getLength(); i++) {
//
//                Node nNode = nList.item(i);
//
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//
//                    // leemos los elementos
//                    Element elem = (Element) nNode;
//
//                    String valName = elem.getAttribute("Nombre");
//
//                    Node node1 = elem.getElementsByTagName("tipo").item(0);
//                    // la expresión a la derecha del igual es un operador ternario
//                    String valType = (node1 != null) ? node1.getTextContent() : null;
//
//                    Node node2 = elem.getElementsByTagName("edad").item(0);
//                    String valAge = (node2 != null) ? node2.getTextContent() : null;
//
//                    Node node3 = elem.getElementsByTagName("genero").item(0);
//                    String valGender = (node3 != null) ? node3.getTextContent() : null;
//
//                    // creamos la mascota y asignamos valores leídos
//                    Mascota pet = new Mascota();
//                    pet.setName(valName);
//                    pet.setType(valType);
//
//                    if (valAge != null) {
//                        pet.setAge(Integer.parseInt(valAge));
//                    }
//
//                    pet.setGender(valGender);
//
//                    // añadimos la mascota a la lista
//                    pets.add(pet);
//                }
//            }

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