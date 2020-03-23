package model;

import java.awt.*;

public class Hat extends Item {
    private Hat(String name, Image image) {
        super(name, image);
    }

    public Hat MELON_HAT = new Hat("Melon Hat",null);
    public Hat CHRISTMAS_HAT = new Hat("Christmas Hat",null);
    public Hat REGULAR_HAT = new Hat("Regular Hat",null);
    public Hat NONE = new Hat("None",null);
}
