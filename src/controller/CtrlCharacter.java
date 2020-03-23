package controller;


import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

import model.*;

import model.Hat;
import model.Item;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;


public class CtrlCharacter {

    private static int nextID = 0;

    private CtrlItems _ctrlItems;

    private Instances _students;
    
    public CtrlCharacter(){
        _ctrlItems = new CtrlItems();
        _students = new Instances("Students",_ctrlItems.getAttributes(),25);
        _students.setClassIndex(_students.numAttributes()-1);
        creationOfStudents(25);
    }
    
    private void creationOfStudents(int numberOfStudents) {
        Student student;
        for(int i = 0; i<numberOfStudents; i++){
            Random r = new Random();
            Hat hat = _ctrlItems.getRandomHat();
            Beard beard = _ctrlItems.getRandomBeard();
            Cigaret cigaret = _ctrlItems.getRandomCigaret();
            Glasses glasses = _ctrlItems.getRandomGlasses();
            Arms arms = _ctrlItems.getRandomArms();
            student = new Student(nextID,hat,cigaret,glasses,beard,arms);
            nextID++;
            Instance instance = new DenseInstance(5);
            instance.setDataset(_students);
            instance.setValue(0,hat.getName());
            instance.setValue(1, beard.getName());
            instance.setValue(2, cigaret.getName());
            instance.setValue(3, glasses.getName());
            instance.setValue(4, arms.getName());

            _students.add(instance);
        }
    }

    public void showAllStudents(){
        for (Instance student : _students) {
            System.out.println(student.toString());
        }
    }
    /*
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
    }*/
}
