package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "Location")
public class ListaCountryRegion_JAXB {
    private ArrayList<CountryRegion_JAXB> listaCountryRegion;

    public void setListaCountryRegion(ArrayList<CountryRegion_JAXB> listaCountryRegion) {
        this.listaCountryRegion = listaCountryRegion;
    }
    @XmlElement(name = "CountryRegion")
    public ArrayList<CountryRegion_JAXB> getlistaCountryRegion() {
        return listaCountryRegion;
    }
}
