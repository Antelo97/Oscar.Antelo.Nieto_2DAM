import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Prueba_08 {

    public static void main(String[] args) {

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\1º CFGS DAM\\2º Trimestre\\Lenguaje de Marcas\\Prácticas\\P07_XML_Tablas\\Ejercicio3.xml");
            Element root = doc.getDocumentElement();
            NodeList rl = root.getElementsByTagName("automovil");

            for(int i = 0; i < rl.getLength(); i++) {

                Node automoviles = rl.item(i);

                System.out.println("Automóviles " + 1);
                System.out.println("========== " + 1);

                NodeList datosAutomovil = automoviles.getChildNodes();

                Element elemento = (Element) automoviles;
                Node nodoMarca = (elemento.getElementsByTagName("marca").item(0));
                String valMarca = nodoMarca.getTextContent();
                System.out.println("Nombre = " + valMarca);

                for(int j = 0; j - j < datosAutomovil.getLength(); j++) {

                    Node dato = datosAutomovil.item(j);

                    if(dato.getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println(dato.getNodeName() + ": ");
                        Node datoContenido = dato.getFirstChild();

                        if(datoContenido != null && datoContenido.getNodeType() == Node.TEXT_NODE) {
                            System.out.println(datoContenido.getNodeValue());
                        }
                    }
                }

            System.out.println();
            }


        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}


