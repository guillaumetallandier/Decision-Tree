package model;

import java.awt.*;

public class Cigaret extends Item {
    private Cigaret(String name, String image) {
        super(name, image);
    }

    public static Cigaret CIGARE = new Cigaret("Cigare", null);
    public static Cigaret CIGARET = new Cigaret("Cigaret",null);
    public static Cigaret NONE = new Cigaret("None",null);
}
