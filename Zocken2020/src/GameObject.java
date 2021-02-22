interface GameObject extends Movable, Paintable {
	
	double getWidth();

	double getHeight();

	Vertex getPos();

	Vertex getDeltaPos();

	boolean isLargerThan(GameObject that);

	boolean isLeftOf(GameObject that);

	boolean isAbove(GameObject that);

	boolean touches(GameObject that);

}
