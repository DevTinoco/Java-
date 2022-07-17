package entities;

public class Rectangle {
	//Nomes das classes
	public double width;
	public double height;
	
	//Metodo da classes:
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return 2 * (width + height);
	}
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
	
	
	
	
	

}
