import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona implements Serializable {
    private String name;
    private String surnames;
    private Date birthDate;

    public Persona(String name, String surnames, Date birthDate) {
        this.name = name;
        this.surnames = surnames;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
    //        return "Persona{" +
    //                "name='" + name + '\'' +
    //                ", surnames='" + surnames + '\'' +
    //                ", birthDate=" + birthDate +
    //                '}';
        String result = this.name + ", " + this.surnames + ", " + this.birthDate;
        return result;
    }
}