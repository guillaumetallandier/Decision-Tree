package controller;


import java.lang.reflect.Array;
import java.util.ArrayList;
import model.Character;

import weka.core.Attribute;
import weka.core.Instances;


public class CtrlCharacter {

   // private Array<String> source;
    
    private int id;
    
    private static int nextID = 0;

    private static ArrayList<String> hats;

    private static ArrayList<String> beards;

    private static ArrayList<String> cigarets;

    private static ArrayList<String> glasses;

    private static ArrayList<Attribute> attributes;

    private static Instances dataBase;

    private static ArrayList<Character> listCharacter = new ArrayList<Character>();
    
    public CtrlCharacter(){
        attributes = new ArrayList<>();

        hats= new ArrayList<String>();
        hats.add("Melon Hat");
        hats.add("Cap");
        hats.add("None");

        beards = new ArrayList<String>();
        beards.add("Mustache");
        beards.add("Beard");
        beards.add("Beard and Mustache");
        beards.add("None");

        cigarets = new ArrayList<>();
        cigarets.add("Cigaret");
        cigarets.add("Cigar");
        cigarets.add("None");

        glasses=new ArrayList<>();
        glasses.add("Solar Glasses");
        glasses.add("Nerd Glasses");
        glasses.add("None");

        attributes.add(new Attribute("Hats",hats));
        attributes.add(new Attribute("Beards",beards));
        attributes.add(new Attribute("Cigarets",cigarets));
        attributes.add(new Attribute("Glasses",glasses));

        dataBase = new Instances("Students",attributes,50);
        dataBase.setClassIndex(dataBase.numAttributes()-1);
    }
    
    public static Character creationCharacter() {
        Character c = new Character();
        c.setID(nextID);
        nextID++;
        listCharacter.add(c);
        return c;
    }
    
    public static Character getCellule(Integer id) {
        for(int i=0;i<listCharacter.size();i++){
            if(listCharacter.get(i).getID() == id){
                return listCharacter.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Character> getListCharacter() {
        return listCharacter;
    }
}
