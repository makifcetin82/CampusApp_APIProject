package Campus.RES_12.Model;


public class Nationality {

    private String name;
    private String id;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return "Nationality{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

