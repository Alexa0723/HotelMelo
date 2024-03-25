package hotel_melo;

public class Chef{
    
    private String name;
    private int id;
    private String location;

    public Chef() {
    }
    
    public Chef(String  location) {
        this.location = location;
    }

    public Chef(String name, int id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Chef{" + "Name=" + name + ", Id=" + id+ ", Location=" + location + '}';
    }
}
