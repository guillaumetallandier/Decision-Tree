package model;

import java.awt.*;

public class Glasses extends Item {
    private Glasses(String name, Image image) {
        super(name, image);
    }

    public static Glasses NERD_GLASSES = new Glasses("Nerd Glasses", "Images/Nerd_glasses.png");
    public static Glasses SOLAR_GLASSES = new Glasses("Solar Glasses", "Images/Solar_glasses");
    public static Glasses NONE = new Glasses("None","Images/None.png");
}
