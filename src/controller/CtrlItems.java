package controller;

import com.sun.xml.bind.v2.runtime.output.FastInfosetStreamWriterOutput;
import model.*;
import weka.core.Attribute;
import weka.core.FastVector;
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

    private FastVector _attributes;

    CtrlItems(){
        _attributes = new FastVector();

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

        FastVector strHats = new FastVector(_hats.size());
        for(Hat h : _hats){
            strHats.add(h.getName());
        }

        FastVector strBeards = new FastVector(_beards.size());
        for(Beard b : _beards){
            strBeards.add(b.getName());
        }

        FastVector strCigarets = new FastVector(_cigarets.size());
        for(Cigaret c : _cigarets){
            strCigarets.add(c.getName());
        }

        FastVector strGlasses = new FastVector(_glasses.size());
        for(Glasses g : _glasses){
            strGlasses.add(g.getName());
        }

        FastVector strArms = new FastVector(_arms.size());
        for(Arms a : _arms){
            strArms.add(a.getName());
        }

        FastVector strInClass = new FastVector(2);
        strInClass.add("true");
        strInClass.add("false");

        _attributes.add(new Attribute("Hats", strHats));
        _attributes.add(new Attribute("Beards", strBeards));
        _attributes.add(new Attribute("Cigarets", strCigarets));
        _attributes.add(new Attribute("Glasses", strGlasses));
        _attributes.add(new Attribute("Arms",strArms));
        _attributes.add(new Attribute("InClass", strInClass));
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
