package lesson6;

public class HomeWork {

	public static void main(String [] args) {
		Point a = new Point(0,0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);

		Triangle triangle = new Triangle(a,b,c);
		double perim = triangle.calculatePerim();
		triangle.getA();
		triangle.setA(new Point(1,2));



		System.out.println("Perim = " + perim);





	}
}
