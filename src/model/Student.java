package model;

import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;

import java.util.Enumeration;


public class Student{

    private int _ID;
    private Hat _hat;
    private Cigaret _cigaret;
    private Beard _beard;
    private Glasses _glasses;
    private Arms _arms;
    private String _isInClass = "Is not in class" ;

    
    public Student(int ID, Hat hat, Cigaret cigaret, Glasses glasses, Beard beard, Arms arms) {
        _ID = ID;
        _hat = hat;
        _cigaret = cigaret;
        _glasses = glasses;
        _beard = beard;
        _arms = arms;
    }

    public int getID() {
        return _ID;
    }

    public String getIsInClass(){
        return _isInClass;
    }

    public void setIsInClass(String isInClass){
        _isInClass=isInClass;
    }

    @Override
    public String toString(){
        return "Student "+_ID+" : "+ _beard.getName()+","+_glasses.getName()+","+_cigaret.getName()+","+_hat.getName()+","+_arms.getName();
    }

    public Hat getHat() {
        return _hat;
    }

    public Beard getBeard(){
        return _beard;
    }

    public Cigaret getCigaret(){
        return _cigaret;
    }

    public Glasses getGlasses(){
        return _glasses;
    }

    public Arms getArms(){
        return _arms;
    }


    /*
    public void setChapeau(boolean chapeau) {
        this.chapeau = chapeau;
    }

    public boolean isChapeau() {
        return chapeau;
    }

    public void setCigare(boolean cigare) {
        this.cigare = cigare;
    }

    public boolean isCigare() {
        return cigare;
    }

    public void setLunettes(boolean lunettes) {
        this.lunettes = lunettes;
    }

    public boolean isLunettes() {
        return lunettes;
    }

    public void setBoucleDoreille(boolean boucle_d_oreille) {
        this.boucleDoreille = boucle_d_oreille;
    }

    public boolean isBoucleDoreille() {
        return boucleDoreille;
    }*/
}
