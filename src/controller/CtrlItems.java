package controller;

import model.*;
import weka.core.Attribute;
import weka.core.Instances;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CtrlItems {
    private ArrayList<Item> _hats;

    private ArrayList<Item> _beards;

    private ArrayList<Item> _cigarets;

    private ArrayList<Item> _glasses;

    private ArrayList<Item> _arms;

    private ArrayList<Attribute> _attributes;

    private Instances _dataBase;

    public CtrlItems(){
        _attributes = new ArrayList<>();

        _hats= new ArrayList<>();
        _hats.add(Hat.MELON_HAT);
        _hats.add(Hat.CHRISTMAS_HAT);
        _hats.add(Hat.REGULAR_HAT);
        _hats.add(Hat.NONE)

        _beards = new ArrayList<>();
        _beards.add(Beard.BEARD);
        _beards.add(Beard.MUSTACHE);
        _beards.add(Beard.NONE);

        _cigarets = new ArrayList<>();
        _cigarets.add(Cigaret.CIGARE);
        _cigarets.add(Cigaret.CIGARET);
        _cigarets.add(Cigaret.NONE);

        _glasses = new ArrayList<>();
        _glasses.add(Glasses.NERD_GLASSES);
        _glasses.add(Glasses.SOLAR_GLASSES);
        _glasses.add(Glasses.NONE);

        _arms = new ArrayList<>();
        _arms.add(Arms.NORMAL_ARMS);
        _arms.add(Arms.FUCK_ARMS);
        _arms.add(Arms.NONE);

        _attributes.add(new Attribute("Hats", String.valueOf(_hats)));
        _attributes.add(new Attribute("Beards", String.valueOf(_beards)));
        _attributes.add(new Attribute("Cigarets", String.valueOf(_cigarets)));
        _attributes.add(new Attribute("Glasses", String.valueOf(_glasses)));
    }

    public Glasses getRandomGlasses(){

    }

    public Beard getRandomBeard(){

    }

    public Cigaret getRandomCigaret(){

    }

    public Arms getRandomArms(){

    }

    public Hat getRandomHat(){

    }

    public ArrayList<Attribute> getAttributes(){
        return _attributes;
    }
}
