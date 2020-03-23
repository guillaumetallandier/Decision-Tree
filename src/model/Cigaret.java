package model;

import java.awt.*;

public class Cigaret extends Item {
    private Cigaret(String name, Image image) {
        super(name, image);
    }

    public Cigaret CIGARE = new Cigaret("Cigare",null);
    public Cigaret CIGARET = new Cigaret("Cigaret",null);
    public Cigaret NONE = new Cigaret("None",null);
}
