package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Functions {
    public static ArrayList<CountryRegion_JAXB> realizarLecturaXML(String ruta) throws JAXBException {

        File file = new File(ruta);
        ArrayList<CountryRegion_JAXB> alumnos = new ArrayList<CountryRegion_JAXB>();

        if (file.exists()) {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListaCountryRegion_JAXB.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            ListaCountryRegion_JAXB listaAlumnos = (ListaCountryRegion_JAXB) jaxbUnmarshaller.unmarshal(file);
            // Si da nulo, devulve una lista vacía
            alumnos = (listaAlumnos != null ? listaAlumnos.getlistaCountryRegion() : new ArrayList<CountryRegion_JAXB>());
        } else {

            System.out.println("No se ha podido encontrar el fichero indicado");
        }
        return alumnos;
    }

    public static void realizarGuardadoXML(ArrayList<CountryRegion_JAXB> alumnos, String ruta)
            throws JAXBException, IOException {

        File file = new File(ruta);

        if (!file.exists()) {
            file.createNewFile();
        }

        JAXBContext jaxbContext = JAXBContext.newInstance(ListaCountryRegion_JAXB.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        ListaCountryRegion_JAXB students = new ListaCountryRegion_JAXB();
        students.setListaCountryRegion(alumnos);
        jaxbMarshaller.marshal(students, file);
    }
}
