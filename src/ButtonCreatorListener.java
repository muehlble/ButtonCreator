import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import java.util.Random;

public class ButtonCreatorListener implements ActionListener{
    private final JPanel jPanel;
    private int clicks = 0;
    public ButtonCreatorListener(JPanel jPanel) {
	this.jPanel = jPanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	clicks++;
	LocalTime now = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
	JButton temp = new JButton(now.format(DateTimeFormatter.ISO_LOCAL_TIME));
	Random rng = new Random();
	temp.setForeground(new Color(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256)));
	jPanel.add(temp);
	jPanel.revalidate();
	
    }
}