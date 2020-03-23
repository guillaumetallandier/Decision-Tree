package controller;

import model.*;
import weka.core.Attribute;
import weka.core.Instances;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class CtrlItems {
    private ArrayList<Hat> _hats;

    private ArrayList<Beard> _beards;

    private ArrayList<Cigaret> _cigarets;

    private ArrayList<Glasses> _glasses;

    private ArrayList<Arms> _arms;

    private ArrayList<Attribute> _attributes;

    CtrlItems(){
        _attributes = new ArrayList<>();

        _hats= new ArrayList<>();
        _hats.add(Hat.MELON_HAT);
        _hats.add(Hat.CHRISTMAS_HAT);
        _hats.add(Hat.REGULAR_HAT);
        _hats.add(Hat.NONE);

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

        ArrayList<String> strHats = new ArrayList<>();
        for(Hat h : _hats){
            strHats.add(h.getName());
        }

        ArrayList<String> strBeards = new ArrayList<>();
        for(Beard b : _beards){
            strBeards.add(b.getName());
        }

        ArrayList<String> strCigarets = new ArrayList<>();
        for(Cigaret c : _cigarets){
            strCigarets.add(c.getName());
        }

        ArrayList<String> strGlasses = new ArrayList<>();
        for(Glasses g : _glasses){
            strGlasses.add(g.getName());
        }

        ArrayList<String> strArms = new ArrayList<>();
        for(Arms a : _arms){
            strArms.add(a.getName());
        }

        _attributes.add(new Attribute("Hats", strHats));
        _attributes.add(new Attribute("Beards", strBeards));
        _attributes.add(new Attribute("Cigarets", strCigarets));
        _attributes.add(new Attribute("Glasses", strGlasses));
        _attributes.add(new Attribute("Arms",strArms));
    }

    Glasses getRandomGlasses(){
        return _glasses.get((int) (Math.random() * (_glasses.size())));
    }

    Beard getRandomBeard(){
        return _beards.get((int) (Math.random() * (_beards.size())));
    }

    Cigaret getRandomCigaret(){
        return _cigarets.get((int) (Math.random() * (_beards.size())));
    }

    Arms getRandomArms(){
        return _arms.get((int) (Math.random() * (_arms.size())));
    }

    Hat getRandomHat(){
        return _hats.get((int) (Math.random() * (_hats.size())));
    }

    ArrayList<Attribute> getAttributes(){
        return _attributes;
    }
}
