package ro.fasttrackit.lab9.teme;

public class Cosmetics extends Product{
    public Cosmetics(double price, String name, String description, int quantity, String color, double weight) {
        super(price,name,description,quantity);
        this.color = color;
        this.weight = weight;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
