package view;

import controller.CtrlCharacter;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class WindowsTree extends JFrame{
    /**
     * @attribute
     */
    private static final long serialVersionUID = 1L;

    private JPanel pPincipal = new JPanel(new BorderLayout());

    public WindowsTree(){
		this.setSize(800, 12000);
        this.setTitle("Tree");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(pPrincipal);
    }
}
