package model;

import java.awt.*;

public class Glasses extends Item {
    private Glasses(String name, String image) {
        super(name, image);
    }

    public static Glasses NERD_GLASSES = new Glasses("Lunettes d'intello", "Images/Nerd_glasses.png");
    public static Glasses SOLAR_GLASSES = new Glasses("Lunettes de soleil", "Images/Solar_glasses.png");
    public static Glasses NONE = new Glasses("Pas de lunettes","Images/None.png");
}
