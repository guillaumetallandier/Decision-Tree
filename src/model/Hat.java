package model;

import java.awt.*;

public class Hat extends Item {
    private Hat(String name, String image) {
        super(name, image);
    }

    public static Hat MELON_HAT = new Hat("Melon Hat",null);
    public static Hat CHRISTMAS_HAT = new Hat("Christmas Hat",null);
    public static Hat REGULAR_HAT = new Hat("Regular Hat",null);
    public static Hat NONE = new Hat("None",null);
}
