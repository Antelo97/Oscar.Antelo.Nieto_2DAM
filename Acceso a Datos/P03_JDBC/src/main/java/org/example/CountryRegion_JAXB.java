package org.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

public class CountryRegion_JAXB {
    private String name;
    private String code;
    private ArrayList<State_JAXB> listaState;

    public CountryRegion_JAXB() {

    }

    public CountryRegion_JAXB(String name, String code, ArrayList<State_JAXB> listaState) {
        this.name = name;
        this.code = code;
        this.listaState = listaState;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    @XmlAttribute(name = "Code")
    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<State_JAXB> getListaState() {
        return listaState;
    }

    @XmlElement(name = "State")
    public void setListaState(ArrayList<State_JAXB> listaState) {
        this.listaState = listaState;
    }

    @Override
    public String toString() {
        return "CountryRegion_JAXB{" + "name='" + name + '\'' + ", code='" + code + '\'' + ", listaState=" + listaState + '}';
    }
}
