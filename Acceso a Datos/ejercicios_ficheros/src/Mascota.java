public class Mascota {
    private String name;
    private String type;
    private int age;
    private String gender;

    public Mascota() {
    }

    public Mascota(String name, String type, int age, String gender) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String result = name + ", " + type + ", " + age + ", " + gender;
        return result;
    }
}
