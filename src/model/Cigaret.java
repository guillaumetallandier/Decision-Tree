package model;

import java.awt.*;

public class Cigaret extends Item {
    private Cigaret(String name, Image image) {
        super(name, image);
    }

    public static Cigaret CIGARE = new Cigaret("Cigare","Images/Cigare.png");
    public static Cigaret CIGARET = new Cigaret("Cigaret","Images/Cigaret.png");
    public static Cigaret NONE = new Cigaret("None","Images/None.png");
}
