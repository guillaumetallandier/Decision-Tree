package model;

import java.awt.*;

public class Arms extends Item {
    private Arms(String name, Image image) {
        super(name, image);
    }

    public static Arms NORMAL_ARMS = new Arms("Normal Arms",null);
    public static Arms FUCK_ARMS = new Arms("Fuck Arms",null);
    public static Arms NONE = new Arms("None",null);
}
