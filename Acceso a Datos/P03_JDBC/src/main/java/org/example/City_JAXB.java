package org.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class City_JAXB {
    private String name;
    private String code;

    public City_JAXB() {

    }

    public City_JAXB(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute (name = "Name")
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

    @Override
    public String toString() {
        return "City_JAXB{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
