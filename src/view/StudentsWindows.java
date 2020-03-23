package view;
import controller.CtrlCharacter;
import model.Student;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class StudentsWindows extends JFrame{
    /**
     * @attribute
     */
    private static final long serialVersionUID = 1L;
    private ArrayList<Student> _students;
    
    private JPanel pAjoutPeronnage = new JPanel();

    public StudentsWindows(ArrayList<Student> students) throws IOException {
        _students = new ArrayList<>(students);

        this.setSize(1000, 1000);
        this.setTitle("Business intelligence");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // panneau
        JPanel pPrincipal = new JPanel(new BorderLayout());


        // menu
        JMenuBar menuBar = new JMenuBar();
        pPrincipal.add(menuBar, BorderLayout.SOUTH);
        JButton bLancer = new JButton("Lancer");
        menuBar.add(bLancer);

        int id = 1;

        pAjoutPeronnage.setLayout(new GridLayout(5, 5));

        Border blackline = BorderFactory.createLineBorder(Color.black);

        //panel pour les personnages
        for (Student s : _students) {
            JPanel pPersonnage = new JPanel();
            pPersonnage.setBackground(Color.red);
            pPersonnage.setBorder(blackline);
            pPersonnage.setSize(200,200);

            JLabel Lid = new JLabel("" + id);
            Lid.setVisible(false);
            pPersonnage.add(Lid);

            BufferedImage img_student = ImageIO.read(new File("Images/None_arms.png"));

            BufferedImage img_hat = ImageIO.read(new File(s.getHat().getImage()));

            BufferedImage img_beard = ImageIO.read(new File(s.getBeard().getImage()));

            BufferedImage img_cigaret = ImageIO.read(new File(s.getCigaret().getImage()));

            BufferedImage img_glasses = ImageIO.read(new File(s.getGlasses().getImage()));

            BufferedImage img_arms = ImageIO.read(new File(s.getArms().getImage()));

            img_student.getGraphics().drawImage(img_hat,0,0,null);
            img_student.getGraphics().drawImage(img_beard,0,0,null);
            img_student.getGraphics().drawImage(img_cigaret,0,0,null);
            img_student.getGraphics().drawImage(img_glasses,0,0,null);
            img_student.getGraphics().drawImage(img_arms,0,0,null);
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
*/
            pPersonnage.add(new JLabel(new ImageIcon(img_student)));
            pPersonnage.setVisible(true);
            pAjoutPeronnage.add(pPersonnage);
            pAjoutPeronnage.setVisible(true);
            id++;

        }
        pPrincipal.add(pAjoutPeronnage, BorderLayout.CENTER);
        this.getContentPane().add(pPrincipal);
        this.setVisible(true);
    }
}
