package model;

import java.awt.*;

public class Arms extends Item {
    private Arms(String name, String image) {
        super(name, image);
    }

    public static Arms NORMAL_ARMS = new Arms("Bras normaux","Images/Normal_arms.png");
    public static Arms FUCK_ARMS = new Arms("Bras d'honneur","Images/Fuck_arms.png");
    public static Arms NONE = new Arms("Aucun bras","Images/None.png");
}
