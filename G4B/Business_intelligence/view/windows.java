import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
	
public class windows {
    /**
     * @attribute
     */
    private static final long serialVersionUID = 1L;

    public ViewGrille(){
        
        this.setSize(1200, 800);
        this.setTitle("Business intelligence");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // panneau
        JPanel pPrincipal = new JPanel(new BorderLayout());
        this.setContentPane(pPrincipal);
        
        // menu
        JMenuBar menuBar = new JMenuBar();
        pPrincipal.add(menuBar, BorderLayout.SOUTH);
        JButton bPartie = new JButton("Lancer");
        menuBar.add(bPartie);
	              
}
