import java.awt.Color;

public class SimpleOval extends geometricObject {

	public SimpleOval(double w, double h, Vertex pos, Color color) {
		this.width=w;
		this.height=h;
		this.pos=pos;
		this.color=color;
	}
	
	public SimpleOval(double w, double h, Vertex pos) {
		super(w,h,pos, new Color(0,0,0));
	}
	
	public SimpleOval(double w, double h, double x, double y) {
		super(w,h,new Vertex(x,y));
	}
	
	@Override public double area() {return Math.PI*width*height/4;}

	public @Override String toString() {
		return "SimpleOval("+super.toString()+")";
	}
	
	public @Override boolean equals(Object that) {
		return (that instanceof SimpleOval) && super.equals(that);
	}
	
}
