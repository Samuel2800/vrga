package Items;

public class RectangularBox extends item{
	public RectangularBox(String itemName, int amount, double weight, double x, double y, double height, double volume, String baseShape) {
		super(itemName, amount, weight, x, y, height, volume, baseShape);
	}

	public double calculateArea(double x, double y) {
		return x * y;
	}
}
