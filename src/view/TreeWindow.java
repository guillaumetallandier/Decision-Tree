package view;

import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TreeWindow extends JFrame{
    /**
     * @attribute
     */
    private static final long serialVersionUID = 1L;

    private JPanel pPrincipal = new JPanel(new BorderLayout());

    public TreeWindow(Instances students){
		this.setSize(800, 12000);
        this.setTitle("Tree");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(pPrincipal);

		J48 tree = new J48();

		try{
		    tree.buildClassifier(students);
            TreeVisualizer tv = new TreeVisualizer(null, tree.graph(), new PlaceNode2());
            this.getContentPane().add(tv,BorderLayout.CENTER);

            this.setVisible(true);
            tv.fitToScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
