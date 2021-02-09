import util.ShowInFrame;
import javax.swing.*;

public class GeometricImage extends geometricObject implements Paintable {

	ImageIcon icon;

	public GeometricImage(String fileName, double x, double y) {
		super(new Vertex(x, y));
		icon = new ImageIcon(getClass().getClassLoader().getResource(fileName));
		init();
	}

	public GeometricImage(ImageIcon icon, double x, double y) {
		super(new Vertex(x, y));
		this.icon = icon;
		init();
	}

	public void init() {
		width = icon.getImage().getWidth(icon.getImageObserver());
		height = icon.getImage().getHeight(icon.getImageObserver());

	}

	public void paintTo(java.awt.Graphics g) {
		icon.paintIcon(null, g, (int) pos.x, (int) pos.y);
	}
}
