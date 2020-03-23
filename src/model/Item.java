package model;

import java.awt.*;

public abstract class Item {
    private String _name;
    private Image _image;

    Item(String name, Image image){
        _name=name;
        _image=image;
    }
    public Image getImage(){ return _image; }
    public String getName(){ return _name; }
}
