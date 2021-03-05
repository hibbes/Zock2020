import java.awt.event.*;
import javax.swing.*;


public class DecrButtonListener implements ActionListener{

	JLabel l;
	int i = 0;

	DecrButtonListener(JLabel l){this.l=l;}
	
	public void actionPerformed(ActionEvent e) {
		
		i--;
		l.setText(""+i);
	}
	
	
}
