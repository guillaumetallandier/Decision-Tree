package model;

import java.awt.*;

public class Mustache extends Item {
    private Mustache(String name, Image image) {
        super(name, image);
    }

    public Mustache BEARD = new Mustache("Beard",null);
    public Mustache MUSTACHE = new Mustache("Mustache",null);
    public Mustache NONE = new Mustache("None", null);
}
