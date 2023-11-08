package at.fhtw.slm.consoleapp;


import lombok.Getter;

public class Order {
    @Getter
    private int id;
    private String description;
    private int amount;
    private float price;

    public Order(int id, String description, int amount, float price) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
