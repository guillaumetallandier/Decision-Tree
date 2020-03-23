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
    
    public Windows(){
    } 

public StudendsWindows(Students[]){
				
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
        for(int i=0; i<25 ;i++){
            JPanel pPersonnage = new JPanel();
            pPersonnage.setBackground(Color.red);
            pPersonnage.setBorder(blackline);
			
			JLabel Lid = new JLabel("" + id);
			Lid.setVisible("false");
			pPersonnage.add(Lid);
			
			JLabel  img_student= new JLabel( new ImageIcon( "src/img/img_student.png"));
			img_student.setVisible("true");
			pPersonnage.add(img_student);
			
			Students[].get(i).getHat().getPct().setVisible("true");
			pPersonnage.add(Students[].get(i).getHat().getPct());
			
			Students[].get(i).getBeard().getPct().setVisible("true");
			pPersonnage.add(Students[].get(i).getBeard().getPct());
			
			Students[].get(i).getCigaret().getPct().setVisible("true");
			pPersonnage.add(Students[].get(i).getCigaret().getPct());
			
			Students[].get(i).getGlasses().getPct().setVisible("true");
			pPersonnage.add(Students[].get(i).getGlasses().getPct());
			
			Students[].get(i).getArms().getPct().setVisible("true");
			pPersonnage.add(Students[].get(i).getArms().getPct());

            pPersonnage.addMouseListener(new MouseListener() {
             
                public void mouseClicked(MouseEvent arg0) {
                    if(pPersonnage.getBackground() == Color.red){
                        pPersonnage.setBackground(Color.green);
						Students[].get(this.Lid).setIsInClass("true");
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
            
            pPersonnage.setVisible(true);
            pAjoutPeronnage.add(pPersonnage);
			id++;
        }
    }
        
        
}

