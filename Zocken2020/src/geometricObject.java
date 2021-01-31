import java.awt.Color;

public class geometricObject {
	public Vertex pos;
	public double width;
	public double height;
	public Color color;
	static double defaultSize = 10;

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Vertex getPos() {
		return pos;
	}

	public geometricObject(double width, double height, Vertex pos, Color color) {

		if (width < 0) {
			width = -width;
			pos.x = pos.x - width;
		}
		if (height < 0) {
			height = -height;
			pos.y = pos.y - height;
		}
			this.pos = pos;
			this.width = width;
			this.height = height;

		}

	
	public geometricObject(double width, double height, Vertex pos) {
		this(width, height, pos, new Color(0, 0, 0));
	}

	public geometricObject(double width, double height) {
		this(width, height, new Vertex(0, 0));
	}

	public geometricObject(double width, Vertex pos) {
		this(width, width, pos);
	}

	public geometricObject(double width) {
		this(width, width);
	}

	public geometricObject(Vertex pos) {
		this(defaultSize, defaultSize, pos);
	}

	public geometricObject() {
		this(defaultSize);
	}

	public String toString() {
		return ("pos=" + pos + "; width=" + width + "; height=" + height);
	}

	public double circumference() {
		return 2 * width + 2 * height;
	}

	public double area() {
		return height * width;
	}

	public boolean contains(Vertex v) {
		return v.x >= pos.x && v.x <= pos.x + width && v.y >= pos.y && v.y <= pos.y + height;
	}

	public boolean isLarger(geometricObject that) {
		return this.area() > that.area();
	}

	public void moveTo(Vertex newPos) {
		this.pos = newPos;
	}

	public void moveTo(double x, double y) {
		moveTo(new Vertex(x, y));
	}

	public void moveBy(Vertex movement) {
		pos.add(movement);
	}

	public void moveBy(double x, double y) {
		moveBy(new Vertex(x, y));
	}

	public geometricObject movedTo(Vertex movement) {
		moveTo(movement);
		return this;
	}

	public geometricObject movedTo(double x, double y) {
		moveTo(x, y);
		return this;
	}

	public geometricObject movedBy(Vertex movement) {
		moveBy(movement);
		return this;
	}

	public geometricObject movedBy(double x, double y) {
		moveBy(x, y);
		return this;
	}

	public boolean equals(Object thatO) {
		if (thatO instanceof geometricObject) {
			geometricObject that = (geometricObject) thatO;
			return pos.equals(that.pos) && width == that.width && height == that.height;
		}
		return false;
	}

}
