import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class ButtonCreator extends JFrame{
        public ButtonCreator(int totalButtons) {
	super("Button Creator");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JPanel pCenter = new JPanel();
	pCenter.setLayout(new GridLayout(0, 3));
	
	add(pCenter, BorderLayout.CENTER);
	
	JButton btnAdd = new JButton("Add new Button here");
	btnAdd.addActionListener(new ButtonCreatorListener(pCenter));
	add(btnAdd, BorderLayout.NORTH);
	
	setSize(450, 250);
	setVisible(true);
    }
    
    public static void main(String[] args) {
	new ButtonCreator(15);
    }
}
