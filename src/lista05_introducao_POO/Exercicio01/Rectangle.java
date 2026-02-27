package lista05_introducao_POO.Exercicio01;

public class Rectangle {

	private double width;
	private double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area() {
		return (this.height * this.width);
	}

	public double perimeter() {
		return 2 * (this.height + this.width);
	}

	public double diagonal() {
		return Math.sqrt((this.height * this.height) + (this.width * this.width));
	}
}
