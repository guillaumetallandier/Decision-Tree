package controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import model.*;

import model.Hat;
import view.StudentsWindow;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;


public class CtrlCharacter {

    private static int nextID = 0;

    private CtrlItems _ctrlItems;

    private Instances _instances;

    private ArrayList<Student> _students;

    private StudentsWindow _window;
    
    public CtrlCharacter() throws IOException {
        _ctrlItems = new CtrlItems();
        _students = new ArrayList<>();
        _instances = new Instances("Students",_ctrlItems.getAttributes(),25);
        _instances.setClassIndex(_instances.numAttributes()-1);
        creationOfStudents(25);
        _window=new StudentsWindow(this);
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
            _students.add(student);
            Instance instance = new DenseInstance(5);
            instance.setDataset(_instances);
            instance.setValue(0,hat.getName());
            instance.setValue(1, beard.getName());
            instance.setValue(2, cigaret.getName());
            instance.setValue(3, glasses.getName());
            instance.setValue(4, arms.getName());

            _instances.add(instance);
        }
    }

    public void showAllStudents(){
        for (Student student : _students) {
            System.out.println(student.toString());
        }
    }

    public ArrayList<Student> getStudents(){
        return _students;
    }
}
