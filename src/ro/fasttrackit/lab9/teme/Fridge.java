package ro.fasttrackit.lab9.teme;

public class Fridge extends Electronics{
    private int temperature;

    public Fridge(double price, String name, String description, int quantity, String type, int length, int width, int height, int weight, int temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature=temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
