package view;
import controller.CtrlCharacter;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Windows extends JFrame{
    /**
     * @attribute
     */
    private static final long serialVersionUID = 1L;
    
    private JPanel pAjoutPeronnage = new JPanel();
    
    
/*
    public Windows(){
        
        this.setSize(1200, 800);
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

        pAjoutPeronnage.setLayout(new GridLayout(4, 4));
        pPrincipal.add(pAjoutPeronnage, BorderLayout.CENTER);
        int id = 1;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        //panel pour les personnages
        for(int i=0; i<16 ;i++){
            JPanel pPersonnage = new JPanel();
            pPersonnage.setBackground(Color.red);
            pPersonnage.setBorder(blackline);
            
            CtrlCharacter.creationCharacter();
            JLabel lID = new JLabel(""+CtrlCharacter.getListCharacter().get(i).getID());
            
            JLabel lAttribute = new JLabel(RandCharacter(CtrlCharacter.getListCharacter().get(i).getID()));
            
            pPersonnage.add(lID);
            pPersonnage.add(lAttribute);
            pPersonnage.addMouseListener(new MouseListener() {
             
                public void mouseClicked(MouseEvent arg0) {
                    if(pPersonnage.getBackground() == Color.red){
                        pPersonnage.setBackground(Color.green);
                    }
                    else{
                        pPersonnage.setBackground(Color.red);
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
            
            pPersonnage.setVisible(true);
            pAjoutPeronnage.add(pPersonnage);
            id++;
        }
    }
    
    private String RandCharacter(int id){
        
        ArrayList<String> attribute = new ArrayList<String>();
        attribute.add("chapeau");
        attribute.add("cigare");
        attribute.add("lunettes");
        attribute.add("boucle d'oreille");
        
        Random rand = new Random();
        String randAttribute ="";
        int alreadyPicked = 0;

        int NbAttrbibute = rand.nextInt(4); //rand.nextInt(max - min + 1) + min;
        for(int k=0; k<NbAttrbibute;k++){
            int RandomAttribute = rand.nextInt((4-alreadyPicked));
            randAttribute = randAttribute + " " + attribute.get(RandomAttribute);

            switch(attribute.get(RandomAttribute)) {
              case "chapeau":
                CtrlCharacter.getListCharacter().get(id).setChapeau(true);
                break;
              case "cigare":
                CtrlCharacter.getListCharacter().get(id).setCigare(true);
                break;
              case "lunettes":
                CtrlCharacter.getListCharacter().get(id).setLunettes(true);
                break;
              case "boucle d'oreille":
                CtrlCharacter.getListCharacter().get(id).setBoucleDoreille(true);
                break;
              default:
            }
            
            attribute.remove(RandomAttribute);
            alreadyPicked++;
        }
        
        return randAttribute;
    }
    
    private void SetAttribute(String attribute){
        
    }*/
}

