package model;

import java.awt.*;

public abstract class Item {
    private String _name;
    private String _image;

    Item(String name, String image){
        _name=name;
        _image=image;
    }
    public String getImage(){ return _image; }
    public String getName(){ return _name; }
}
