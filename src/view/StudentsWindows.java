package view;
import controller.CtrlCharacter;
import model.Student;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;

public class StudentsWindows extends JFrame{
    /**
     * @attribute
     */
    private static final long serialVersionUID = 1L;
    private ArrayList<Student> _students;
    
    private JPanel pAjoutPeronnage = new JPanel();

    public StudentsWindows(ArrayList<Student> students) {
        _students = new ArrayList<>(students);

        this.setSize(1000, 1000);
        this.setTitle("Business intelligence");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // panneau
        JPanel pPrincipal = new JPanel(new BorderLayout());
        this.setContentPane(pPrincipal);

        // menu
        JMenuBar menuBar = new JMenuBar();
        pPrincipal.add(menuBar, BorderLayout.SOUTH);
        JButton bLancer = new JButton("Lancer");
        menuBar.add(bLancer);

        int id = 1;

        pAjoutPeronnage.setLayout(new GridLayout(5, 5));
        pPrincipal.add(pAjoutPeronnage, BorderLayout.CENTER);
        Border blackline = BorderFactory.createLineBorder(Color.black);

        //panel pour les personnages
        for (int i = 0; i < 25; i++) {
            JPanel pPersonnage = new JPanel();
            pPersonnage.setBackground(Color.red);
            pPersonnage.setBorder(blackline);

            JLabel Lid = new JLabel("" + id);
            Lid.setVisible(false);
            pPersonnage.add(Lid);

            JLabel img_student = new JLabel(new ImageIcon("src/img/img_student.png"));
            img_student.setVisible(true);
            pPersonnage.add(img_student);

            JLabel labelHat = new JLabel(new ImageIcon(students.get(i).getHat().getImage()));
            pPersonnage.add(labelHat);

            JLabel labelBeard = new JLabel(new ImageIcon(students.get(i).getBeard().getImage()));
            pPersonnage.add(labelBeard);

            JLabel labelCigaret = new JLabel(new ImageIcon(students.get(i).getBeard().getImage()));
            pPersonnage.add(labelCigaret);

            JLabel labelGlasses = new JLabel(new ImageIcon(students.get(i).getGlasses().getImage()));
            pPersonnage.add(labelGlasses);

            JLabel labelArms = new JLabel(new ImageIcon(students.get(i).getArms().getImage()));
            pPersonnage.add(labelArms);
/*
            pPersonnage.addMouseListener(new MouseListener() {

                public void mouseClicked(MouseEvent arg0) {
                    if(pPersonnage.getBackground() == Color.red){
                        pPersonnage.setBackground(Color.green);
                        students.get(this.Lid).setIsInClass("true");
                    }
                    else{
                        pPersonnage.setBackground(Color.red);
                        Students[].get(this.Lid).setIsInClass("false");
                    }


                }

                public void mousePressed(MouseEvent arg0) {
                    // TODO

                }

                public void mouseReleased(MouseEvent arg0) {
                    // TODO

                }

                public void mouseEntered(MouseEvent arg0) {
                    // TODO

                }

                public void mouseExited(MouseEvent arg0) {
                    // TODO

                }

            });
*//*
            pPersonnage.setVisible(true);
            pAjoutPeronnage.add(pPersonnage);
            id++;*/

        }
        this.setVisible(true);
    }
}

