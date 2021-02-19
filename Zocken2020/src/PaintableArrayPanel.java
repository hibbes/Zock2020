import util.ShowInFrame;

public class PaintableArrayPanel extends SizedPanel {

	static Paintable[] ps;

	public PaintableArrayPanel(Paintable[] pa) {ps=pa;}
	
	public void paintComponent(java.awt.Graphics g) {
		for (Paintable p:ps) p.paintTo(g);
	}
	
	public static void main(String[] args) {
		
		ps = new Paintable[2];
		ps[0] = new PaintableOval(100, 50, 30, 50);
		ps[1] = new PaintableOval(100, 50, 130, 150);

		ShowInFrame.show("Ovale", new PaintableArrayPanel(ps));
	}
	
}
