package org.example;

import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;

import javax.xml.bind.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main_JAXB {

    public static void main(String[] args) throws JAXBException, IOException {

        String filePath = "es.xml";
        ArrayList<CountryRegion_JAXB> students = Functions.realizarLecturaXML(filePath);
        for (CountryRegion_JAXB student : students) {
            System.out.println(student.toString());
        }
    }
}