package Items;
//I found out I misspelled "Cylindrical" way to far into the code and have no intention of changing it
public class CylindricalBox extends item {
	public CylindricalBox(String itemName, int amount, double weight, double x, double y, double height, double volume, String baseShape) {
		super(itemName, amount, weight, x, y, height, volume, baseShape);
	}

	public double calculateArea(double x, double y) {
		return Math.PI * (x / 2) * (x / 2);
	}
}
