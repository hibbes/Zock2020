import java.awt.event.*;
import javax.swing.*;


public class ResetButtonListener implements ActionListener{

	JLabel l;
	int i = 0;

	ResetButtonListener(JLabel l){this.l=l;}
	
	public void actionPerformed(ActionEvent e) {
		
		l.setText(""+i);
	}
	
	
}
