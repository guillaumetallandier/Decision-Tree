package model;

import java.awt.*;

public class Hat extends Item {
    private Hat(String name, Image image) {
        super(name, image);
    }

    public static Hat MELON_HAT = new Hat("Melon Hat","Images/Melon_hat.png");
    public static Hat CHRISTMAS_HAT = new Hat("Christmas Hat","Images/Christmas_hat.png");
    public static Hat REGULAR_HAT = new Hat("Regular Hat","Images/Regular_hat.png");
    public static Hat NONE = new Hat("None","Images/None.png");
}
