import javax.swing.*;
import util.ShowInFrame;

public class Counter extends SimpleButton {

	  public Counter(){
		    b.addActionListener(new CountButtonListener(l,0));
		    d.addActionListener(new CountButtonListener(l,1));
		    r.addActionListener(new CountButtonListener(l,2));
		  }

		  public static void main(String [] args){
		    ShowInFrame.show(new Counter());}
		}