package model;

import java.awt.*;

public class Beard extends Item {
    private Beard(String name, String image) {
        super(name, image);
    }

    public static Beard BEARD = new Beard("Barbe","Images/Beard.png");
    public static Beard MUSTACHE = new Beard("Moustache","Images/Mustache.png");
    public static Beard NONE = new Beard("Aucun poil","Images/None.png");
}
