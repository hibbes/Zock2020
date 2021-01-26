
public class TestGeometricObject {

	public static void main(String[] args) {
			Vertex v1 = new Vertex(-17, 4);
			Vertex v2 = new Vertex(42, 0);
			Vertex vv = new Vertex(0, 0);
		
			geometricObject o1 = new geometricObject(42,23);/*
			geometricObject o2 = new geometricObject(3, 25, v2);
			geometricObject o5 = new geometricObject(3, 25, v2);
			geometricObject o3 = new geometricObject();
			geometricObject o4 = new geometricObject(-2, -3);
			geometricObject o6 = new geometricObject(-4, -5, new Vertex(-1, -2));
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v1.length());
			System.out.println(v1.scalarMultiply(2));
			*/
			System.out.println(o1);
			System.out.println("test "+ new geometricObject(3, 2, new Vertex(3,4)));
			/*
			System.out.println(o1);
			System.out.println(new simpleOval());
			System.out.println(o2.equals(o5));
			System.out.println(o2.equals(o3));
			System.out.println(o2.equals(v2));
			o3.moveTo(2,2);
			System.out.println(o3);
			o3.moveBy(1,1);
			System.out.println(o3);
			System.out.println(o4);
			System.out.println(o2.movedBy(4,3));
			System.out.println(o2.movedTo(1,1));
			
			System.out.println("");
			System.out.println(o6);
			*/
	}

	}
