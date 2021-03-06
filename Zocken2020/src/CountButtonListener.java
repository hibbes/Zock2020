import java.awt.event.*;
import javax.swing.*;

public class CountButtonListener extends SimpleButton implements ActionListener{
	  JLabel l;
	  
	  int a = 0;
	  
	  CountButtonListener(JLabel l, int a){this.l=l; this.a=a;}

	   public void actionPerformed(ActionEvent e){
	       if(a==0) {counter++;}
	       if(a==1) {counter--;}
	       if(a==2) {counter = 0;}
	    
	       l.setText(""+counter);    
	  }
	}

