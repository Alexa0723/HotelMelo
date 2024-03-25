package hotel_melo;


public class FoodItem {
    private String name;
    private int id;
    private int price;
    public String type;
    
    public FoodItem() {
    }

    public FoodItem (int price, String name, String type) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodItem{" + "Name=" + name + ", Id=" + id + ", Price=" + price + '}';
    }

   
    
}