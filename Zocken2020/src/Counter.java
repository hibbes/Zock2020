import javax.swing.*;
import util.ShowInFrame;

public class Counter extends SimpleButton {

	public Counter() {
		b1.addActionListener(new CountButtonListener(l));
	 //	b2.addActionListener(new DecrButtonListener(l));
	//	b3.addActionListener(new ResetButtonListener(l));
		
	}

	public static void main(String[] args) {
		ShowInFrame.show(new Counter());
	}

}
