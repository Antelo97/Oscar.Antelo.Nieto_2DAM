import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.File;
import java.util.ArrayList;

public class P01_Main {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\oscar\\OneDrive\\Desktop\\CFGS DAM\\CFGS DAM II\\Acceso a Datos\\ejercicios_ficheros\\aventura1.xml";
        File xmlFile = new File(filePath);
        ArrayList<P01a_Escena> scenes = new ArrayList<P01a_Escena>();

        // variables aventura
        String valAdventure = null;

        // variables escena
        int valCode = 0;
        String valTextSc = null;
        ArrayList<P01b_Opcion> valOptions = new ArrayList<P01b_Opcion>();

        // variables opción
        int valID;
        String valTextOp;
        int valResult;

        try {
            // parseamos el documento XML con DOM
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            // obtenemos el elemento raíz del XML
            Element eRoot = doc.getDocumentElement();

            valAdventure = eRoot.getAttribute("titulo");
            System.out.println(valAdventure + "\n");

            NodeList nlScenes = eRoot.getElementsByTagName("escena");

            // recorremos la lista de nodos
            for (int i = 0; i < nlScenes.getLength(); i++) {

                Node nScene = nlScenes.item(i);
                Element eScene = (Element) nScene;
                NodeList nlSceneData = nScene.getChildNodes();

                if (eScene.hasAttribute("codigo")) {
                    valCode = Integer.parseInt(eScene.getAttribute("codigo"));
                }

                for (int x = 0; x < nlSceneData.getLength(); x++) {

                    Node n = nlSceneData.item(x);

                    if (n.getNodeType() == Node.ELEMENT_NODE) {

                        Element e = (Element) n;

                        if (e.hasAttribute("id") && e.hasAttribute("texto") && e.hasAttribute("resultado")) {
                            valID = Integer.parseInt(e.getAttribute("id"));
                            valTextOp = e.getAttribute("texto");
                            valResult = Integer.parseInt(e.getAttribute("resultado"));

                            P01b_Opcion option = new P01b_Opcion(valID, valTextOp, valResult);
                            valOptions.add(option);
                        }

                        if (n.getNodeName().equals("texto")) {
                            valTextSc = (n != null) ? n.getTextContent() : null;
                        }
                    }
                }

                // creamos el objeto escena y lo añadimos a la lista
                P01a_Escena scene = new P01a_Escena(valCode, valTextSc, valOptions);

                scenes.add(scene);
                valOptions.clear();
                /* este .clear() me esta vaciando los arrays de opciones que estoy metiendo como parámetros para construir las escenas,
                cuando yo entiendo que lo que debería ocurrir es que la escena 1 almacenase las 3 primeras opciones, la escena 2 las
                3 siguientes y así sucesivamente. El problema es que si elimino el .clear() todas las escenas tendrían todas las
                opciones, en lugar de solo las que les corresponden */

            }

            for(P01a_Escena sc : scenes){
                System.out.println(sc.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}