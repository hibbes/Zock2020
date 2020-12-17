
public class TestGeometricObject {

	public static void main(String[] args) {
		GeometricObject o1 = new GeometricObject(17,4, new Vertex(42,23));
		GeometricObject o2= new GeometricObject(17,4);
		GeometricObject o3= new GeometricObject(17);
		GeometricObject o4= new GeometricObject();

		System.out.println(o1.equals(o2));
		o2.moveTo(42,23);
		System.out.println(o1.equals(o2));
		System.out.println(o3.contains(new Vertex(10,3)));
		System.out.println(o4);
		
		
	}

}
