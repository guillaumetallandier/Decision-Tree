package model;

import java.awt.*;

public class Beard extends Item {
    private Beard(String name, Image image) {
        super(name, image);
    }

    public static Beard BEARD = new Beard("Beard","../../Images/Beard.png");
    public static Beard MUSTACHE = new Beard("Mustache","../../Images/Mustache.png");
    public static Beard NONE = new Beard("None","../../Images/None.png");
}
