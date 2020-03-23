package model;

import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;

import java.util.Enumeration;


public class Character implements Instance {
    
    private int _ID;
    private String _hat;
    private String _cigaret;
    private String _beard;
    private String _glasses;

    
    public Character(int ID, String hat, String cigaret, String glasses, String beard) {
        _ID = ID;
        _hat = hat;
        _cigaret = cigaret;
        _glasses = glasses;
        _beard = beard;
    }

    public int getID() {
        return _ID;
    }

    @Override
    public Attribute attribute(int i) {
        return null;
    }

    @Override
    public Attribute attributeSparse(int i) {
        return null;
    }

    @Override
    public Attribute classAttribute() {
        return null;
    }

    @Override
    public int classIndex() {
        return 0;
    }

    @Override
    public boolean classIsMissing() {
        return false;
    }

    @Override
    public double classValue() {
        return 0;
    }

    @Override
    public Instance copy(double[] doubles) {
        return null;
    }

    @Override
    public Instances dataset() {
        return null;
    }

    @Override
    public void deleteAttributeAt(int i) {

    }

    @Override
    public Enumeration<Attribute> enumerateAttributes() {
        return null;
    }

    @Override
    public boolean equalHeaders(Instance instance) {
        return false;
    }

    @Override
    public String equalHeadersMsg(Instance instance) {
        return null;
    }

    @Override
    public boolean hasMissingValue() {
        return false;
    }

    @Override
    public int index(int i) {
        return 0;
    }

    @Override
    public void insertAttributeAt(int i) {

    }

    @Override
    public boolean isMissing(int i) {
        return false;
    }

    @Override
    public boolean isMissingSparse(int i) {
        return false;
    }

    @Override
    public boolean isMissing(Attribute attribute) {
        return false;
    }

    @Override
    public Instance mergeInstance(Instance instance) {
        return null;
    }

    @Override
    public int numAttributes() {
        return 0;
    }

    @Override
    public int numClasses() {
        return 0;
    }

    @Override
    public int numValues() {
        return 0;
    }

    @Override
    public void replaceMissingValues(double[] doubles) {

    }

    @Override
    public void setClassMissing() {

    }

    @Override
    public void setClassValue(double v) {

    }

    @Override
    public void setClassValue(String s) {

    }

    @Override
    public void setDataset(Instances instances) {

    }

    @Override
    public void setMissing(int i) {

    }

    @Override
    public void setMissing(Attribute attribute) {

    }

    @Override
    public void setValue(int i, double v) {

    }

    @Override
    public void setValueSparse(int i, double v) {

    }

    @Override
    public void setValue(int i, String s) {

    }

    @Override
    public void setValue(Attribute attribute, double v) {

    }

    @Override
    public void setValue(Attribute attribute, String s) {

    }

    @Override
    public void setWeight(double v) {

    }

    @Override
    public Instances relationalValue(int i) {
        return null;
    }

    @Override
    public Instances relationalValue(Attribute attribute) {
        return null;
    }

    @Override
    public String stringValue(int i) {
        return null;
    }

    @Override
    public String stringValue(Attribute attribute) {
        return null;
    }

    @Override
    public double[] toDoubleArray() {
        return new double[0];
    }

    @Override
    public String toStringNoWeight(int i) {
        return null;
    }

    @Override
    public String toStringNoWeight() {
        return null;
    }

    @Override
    public String toStringMaxDecimalDigits(int i) {
        return null;
    }

    @Override
    public String toString(int i, int i1) {
        return null;
    }

    @Override
    public String toString(int i) {
        return null;
    }

    @Override
    public String toString(Attribute attribute, int i) {
        return null;
    }

    @Override
    public String toString(Attribute attribute) {
        return null;
    }

    @Override
    public double value(int i) {
        return 0;
    }

    @Override
    public double valueSparse(int i) {
        return 0;
    }

    @Override
    public double value(Attribute attribute) {
        return 0;
    }

    @Override
    public double weight() {
        return 0;
    }

    @Override
    public Object copy() {
        return null;
    }

    @Override
    public String toString(){
        return "Student "+_ID+" : "+ _beard+","+_glasses+","+_cigaret+","+_hat;
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
