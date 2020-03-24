package controller;


import java.io.IOException;
import java.rmi.registry.LocateRegistry;
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
        }
    }

    private void creationOfInstances(){
        for(Student s : _students){
            Instance instance = new DenseInstance(5);
            instance.setDataset(_instances);
            instance.setValue(0, s.getHat().getName());
            instance.setValue(1, s.getBeard().getName());
            instance.setValue(2, s.getCigaret().getName());
            instance.setValue(3, s.getGlasses().getName());
            instance.setValue(4, s.getArms().getName());
            instance.setValue(5, s.getIsInClass());
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
