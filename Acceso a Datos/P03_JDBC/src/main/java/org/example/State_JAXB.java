package org.example;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class State_JAXB {
    private ArrayList<City_JAXB> listaCity;

    public State_JAXB() {

    }

    public State_JAXB(ArrayList<City_JAXB> listaCity) {
        this.listaCity = listaCity;
    }

    public ArrayList<City_JAXB> getListaCity() {
        return listaCity;
    }

    @XmlElement(name = "City")
    public void setListaCity(ArrayList<City_JAXB> listaCity) {
        this.listaCity = listaCity;
    }

    @Override
    public String toString() {
        return "State_JAXB{" +
                "listaCity=" + listaCity +
                '}';
    }
}
