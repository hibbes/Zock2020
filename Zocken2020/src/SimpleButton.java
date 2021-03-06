import javax.swing.*;
import util.ShowInFrame;

public class SimpleButton extends JPanel{
	  JButton b = new JButton("increase");
	  JButton d = new JButton("decrease");
	  JButton r = new JButton("reset");
	  static int counter = 0;
	  JLabel  l = new JLabel("000"+counter);
	  
	  SimpleButton(){
	    add(b);
	    add(d);
	    add(r);
	    add(l);
	  }
	  public static void main(String [] args){
	    ShowInFrame.show(new SimpleButton());}
	}