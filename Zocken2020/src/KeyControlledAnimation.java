import java.awt.event.*;
import static java.awt.event.KeyEvent.*;
import util.*;

public class KeyControlledAnimation extends MouseControlledAnimation{
	KeyControlledAnimation(final GameObject contr){
		super(contr);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case VK_LEFT:
					controlled.getDeltaPos().addMod(new Vertex(-0.5,0));
					break;
				case VK_RIGHT:
					controlled.getDeltaPos().addMod(new Vertex(0.5,0));
					break;
				case VK_UP:
					controlled.getDeltaPos().addMod(new Vertex(0,-0.5));
					break;
				case VK_DOWN:
					controlled.getDeltaPos().addMod(new Vertex(0,0.5));
					break;
				}
			}
		});
		setFocusable(true);
		requestFocusInWindow();
	}

	public static void main(String[] args) {
		MovablePanel p = new KeyControlledAnimation(new MovableImage("hexe.png", 0, 0, 1, 1));
		p.gos.add(new MovableImage("biene.png", 200, 200, -0.1, -0.1));
		ShowInFrame.show(p);

	}

}
