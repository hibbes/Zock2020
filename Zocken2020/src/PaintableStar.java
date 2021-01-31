import java.awt.Color;

public class PaintableStar extends SimpleStar implements Paintable{

		public PaintableStar(Vertex pos, Color color){
			super(pos, color);
		}
		
		public void paintTo(java.awt.Graphics g){
			g.setColor(color);
			g.drawPolygon(xPoints, yPoints, nPoints);
		}
	}