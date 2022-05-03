package ro.fasttrackit.lab9.teme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Electronics fridge = new Fridge(3.14,
                "Electrolux",
                "DoubleFridge",
                20,
                "cooling",
                12,33,44,5,20);
        Product lipstick = new Cosmetics(3.14, "Channel",
                "bluesky",50,"blue",50);

        lipstick.setPrice(5.14);
        List<Product> basket = new ArrayList<>();
        double sum = 0;
        basket.add(lipstick);
        basket.add(fridge);
        for (Product product : basket) {
            System.out.println(product.getDescription());

        }
    }
}
