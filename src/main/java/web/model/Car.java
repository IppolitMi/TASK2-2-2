package web.model;

public class Car {
    private int price;
    private String model;
    private String owner;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Car() {
    }

    public Car(int price, String model, String owner) {
        this.price = price;
        this.model = model;
        this.owner = owner;
    }
}