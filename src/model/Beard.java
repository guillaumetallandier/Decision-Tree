package model;

import java.awt.*;

public class Beard extends Item {
    private Beard(String name, String image) {
        super(name, image);
    }

    public static Beard BEARD = new Beard("Beard",null);
    public static Beard MUSTACHE = new Beard("Mustache",null);
    public static Beard NONE = new Beard("None", null);
}
