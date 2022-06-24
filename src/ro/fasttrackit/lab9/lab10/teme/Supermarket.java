package ro.fasttrackit.lab9.lab10.teme;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {

    public static void main(String[] args) {
        Basket myBasket = new Basket();
        myBasket.adaugaCumaparatura(new Fruit("capsuna", 50));
        System.out.println(myBasket);
        myBasket.adaugaCumaparatura((new Fruit("mere", 150)));
        myBasket.adaugaCumaparatura((new Fruit("pere", 250)));
        System.out.println(myBasket);

        List<Fruit> existingFruits = new ArrayList<>();
        existingFruits.add(new Fruit("kiwi", 25));
        existingFruits.add(new Fruit("grapefruit", 5));

        Basket filledBasket = new Basket(existingFruits);
        System.out.println(filledBasket);

        System.out.println(myBasket.position("capsuna"));
        System.out.println(myBasket.count());
        System.out.println(myBasket.countCustom());

    }
}
