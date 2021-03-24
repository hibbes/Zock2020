import java.awt.event.*;
import javax.swing.*;

public class ControlledWindow extends JFrame {
	SimpleAnimation p;

	ControlledWindow(final SimpleAnimation p) {
		this.p = p;
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent _) {
				System.exit(0);
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				p.t.stop();
			}
			@Override
			public void windowActivated(WindowEvent e) {
				p.t.start();
			};

		});
		add(p);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		SimpleAnimation p = new KeyControlledAnimation(new MovableImage("hexe.png", 0, 0, 1, 1));
		p.gos.add(new MovableImage("biene.png", 200, 200, -1, -1));
		new ControlledWindow(p);
	}
}
