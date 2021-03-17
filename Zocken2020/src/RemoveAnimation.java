import util.*;
import java.util.*;

public class RemoveAnimation extends AnimationPanel {

	@Override
	void reactWhenTouching(GameObject g1, GameObject g2) {
		if (g1.isLargerThan(g2))
			gos.remove(g2);
		else
			gos.remove(g1);
	}

	@Override
	public void doChecks() {
		List<GameObject> toRemove = new LinkedList<GameObject>();
		for (GameObject gl : gos)
			for (GameObject g2 : gos)
				if (gl != g2 && gl.touches(g2)) {
					if (gl.isLargerThan(g2))
						toRemove.add(g2);
					else
						toRemove.add(gl);
				}
		gos.removeAll(toRemove);
	}


	public static void main(String[] args) {
		MovablePanel p = new RemoveAnimation();
		p.gos.add(new MovableImage("hexe.png", 0, 0, 1, 1));
		p.gos.add(new MovableImage("biene.png", 200, 200, -1, -1));
		ShowInFrame.show(p);
	}

}
