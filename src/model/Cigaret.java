package model;

import java.awt.*;

public class Cigaret extends Item {
    private Cigaret(String name, String image) {
        super(name, image);
    }

    public static Cigaret CIGARE = new Cigaret("Cigare","Images/Cigare.png");
    public static Cigaret CIGARET = new Cigaret("Cigarette","Images/Cigaret.png");
    public static Cigaret NONE = new Cigaret("Aucune drogue douce","Images/None.png");
}
