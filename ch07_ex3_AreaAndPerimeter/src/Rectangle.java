import java.text.NumberFormat;

public class Rectangle {
	
	private double length;
	private double width;
	
	
	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}
	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}


	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		double area = width * length;
		return area;
	}
	
	public String formatArea() {
		NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String numberFormatted = number.format(this.getArea());
        return numberFormatted;
	}

	public double getPer() {
		double perimeter = 2 * width + 2 * length;
		return perimeter;
	}
	
	public String formatPer() {
		NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String numberFormatted = number.format(this.getPer());
        return numberFormatted;
	}
}
