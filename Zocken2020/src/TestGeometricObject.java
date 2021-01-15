
public class TestGeometricObject {

	public static void main(String[] args) {
		SimpleOval o1 = new SimpleOval(17,4, new Vertex(42,23));
		SimpleOval o2= new SimpleOval(17,4, 0,0);
		SimpleOval o3= new SimpleOval(17,42, 67, 78);
		SimpleOval o4= new SimpleOval(3,3,3,3);
		

		System.out.println(o1.equals(o2));
		o2.moveTo(42,23);
		System.out.println(o1.equals(o2));
		System.out.println(o3.contains(new Vertex(10,3)));
		System.out.println(o4);
		
	
		
	}

}
