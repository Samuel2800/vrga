package Methods;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import Containers.BigContainer;
import Containers.SmallContainer;
import Items.CylindricalBox;
import Items.PolygonBox;
import Items.RectangularBox;
import Items.item;

public class methods extends UserProgram{

	public void prueba() {
			 Double.valueOf(Height.getText());
		 }

	//this methods asks input form the user to add items to the order
	public void addItems(HashMap<String, Object> order){
		//this variable allows the user to keep adding items until his/her heart desires
		boolean orderIsIncomplete = true;

		while(orderIsIncomplete) {
			String itemName;
			int amount;
			double weight;
			double x;
			double y = 0;
			double height;
			double volume = 0;
			String baseShape;

			//user introduces the name of the item
			Scanner sc = new Scanner(System.in);
			itemName = ProductName.getText();
			if(order.containsKey(itemName)) {
				//prompter saying that the item has already been added
				continue;
			}

			//introduces the amount
			try {
			amount = Integer.valueOf(ProductQuantity.getText());
			}
			catch(Exception e){
				//prompter saying something went wrong
				continue;
			}

			//the height
			try {
				height = Double.valueOf(Height.getText());
			}
			catch(Exception e) {
				//prompter saying something went wrong
				continue;
			}

			//the weight
			try {
				weight = Double.valueOf(ProductWeight.getText());
			}
			catch(Exception e) {
				//prompter saying something went wrong
				continue;
			}

			//the shape of the base
			System.out.println("Please introducte one of the next options as the base of your box:");
			System.out.println("Circle    Rectangle    Polygon");
			String[] validShapes = {"circle", "rectangle", "polygon"};
			baseShape = sc.nextLine();
			baseShape = baseShape.toLowerCase().trim();
			if(!Arrays.asList(validShapes).contains(baseShape)) {
				System.out.println("This option isn't available at the moment");
				continue;
			}

			//according to the input of the user, the following objects are created and added into the order
			//Cylinder
			if(baseShape.equals(validShapes[0])) {
				try {
					System.out.println("What is the diameter of the base?");
					x = Double.valueOf(sc.nextLine());
				}
				catch(Exception e){
					System.out.println("Something went wrong, please try adding this item again");
					continue;
				}
				CylindricalBox cb = new CylindricalBox(itemName, amount, weight, x, y, height, volume, "Cylinder");
				volume = cb.calculateVolume(x, y, height);
				if(volume < 75.587337) {
					cb.setVolume(volume);
					order.put(itemName, cb);
				}
				else if(volume <= 0) {
					System.out.println("Seems like something went wrong, please make sure to enter the correct measurements");
				}
				else {
					System.out.println("This item is too big to fit in our containers");
					continue;
				}
			}
			//Rectangular prism
			else if(baseShape.equals(validShapes[1])) {
				try {
					System.out.println("What is the length of the base?");
					x = Double.valueOf(sc.nextLine());
					System.out.println("What is the width of the base?");
					y = Double.valueOf(sc.nextLine());
				}
				catch(Exception e){
					System.out.println("Something went wrong, please try adding this item again");
					continue;
				}
				RectangularBox rb = new RectangularBox(itemName, amount, weight, x, y, height, volume, "Rectangular prism");
				volume = rb.calculateVolume(x, y, height);
				if(volume < 75.587337) {
					rb.setVolume(volume);
					order.put(itemName, rb);
				}
				else if(volume <= 0) {
					System.out.println("Seems like something went wrong, please make sure to enter the correct measurements");
				}
				else {
					System.out.println("This item is too big to fit in our containers");
					continue;
				}
			}
			//Polygon prism
			else if(baseShape.equals(validShapes[2])) {
				try {
					System.out.println("What is the length of one of the base's sides?");
					x = Double.valueOf(sc.nextLine());
					System.out.println("How many sides does it have?");
					y = Double.valueOf(sc.nextLine());
					if(y < 5) {
						System.out.println("No shape found");
						continue;
					}
				}
				catch(Exception e){
					System.out.println("Something went wrong, please try adding this item again");
					continue;
				}
				PolygonBox pb = new PolygonBox(itemName, amount, weight, x, y, height, volume, "Polygonal prism");
				volume = pb.calculateVolume(x, y, height);
				if(volume < 75.587337) {
					pb.setVolume(volume);
					order.put(itemName, pb);
				}
				else if(volume <= 0) {
					System.out.println("Seems like something went wrong, please make sure to enter the correct measurements");
				}
				else {
					System.out.println("This item is too big to fit in our containers");
					continue;
				}
			}

			System.out.println("New Item added successfully");

			//continue ordering
			System.out.println("Do you want to continue with the order?(Y/N)");
			if(sc.nextLine().toLowerCase().equals("n") ||sc.nextLine().toLowerCase().equals("no")) {
				orderIsIncomplete = false;
				System.out.println("Thanks for trusting us with your order");
			}
		}
	}

	//this method removes a specific item from the order
	//the user must introduce the specific name of the object
	public void removeItem(HashMap<String, Object> order, String item) {
		try {
			order.remove(item);
			System.out.println("Item removed successfully");
		}
		catch(Exception e) {
			System.out.println(item + " couldn't be found in the order");
		}
	}

	//this method calculates the complete volume of the order by getting
	//the object's quantity and individual volume
	public double orderVolume(HashMap<String, Object> order) {
		double totalVolume = 0;
		for(Object value : order.values()) {
			totalVolume += (((item) value).getVolume() * ((item) value).getAmount());
		}
		return totalVolume;
	}

	//this method does the same form the last one but with volume
	public double orderWeight(HashMap<String, Object> order) {
		double totalWeight = 0;
		for(Object value : order.values()) {
			totalWeight += (((item) value).getWeight() * ((item) value).getAmount());
		}
		return totalWeight;
	}

	//this method just prints information from the selected object
	public void printItemInfo(Object item) {
		System.out.println("Item name: " + ((Items.item) item).getItemName());
		System.out.println("Quantity: " + ((Items.item) item).getAmount());
		System.out.println("Item's volume: " + ((Items.item) item).getVolume());
		System.out.println("Item's weight: " + ((Items.item) item).getWeight());
		System.out.println("Item's shape: " + ((Items.item) item).getBaseShape());
	}

	//this method prints the general information of the order or the specific information of each object
	public void printOrderInfo(HashMap<String, Object> order) {
		if(order.isEmpty()) {
			System.out.println("You have not added any items to this order yet");
		}
		else {
			String option;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please choose one of the following options");
			System.out.println("1. Show general information about the order");
			System.out.println("2. Show information about every item in the order");
			option = sc.nextLine();

			if(option.trim().equals("1. Show general information about the order") || option.trim().equals("1") || option.trim().toLowerCase().equals("show general information about the order")) {
				double volume = orderVolume(order);
				double weight = orderWeight(order);
				System.out.println("The order has " + order.size() + " items");
				System.out.println("The total volume is: " + volume);
				System.out.println("The total weight is: " + weight);
			}

			else if(option.trim().equals("2. Show information about every item in the order") || option.trim().equals("2") || option.trim().toLowerCase().equals("show information about every item in the order")) {
				for(Object value : order.values()) {
					printItemInfo(value);
					System.out.println("------------------------------------------------");
				}
			}
			else {
				System.out.println("This option is not available");
			}
		}
	}

	//see explanation inside the method
	public void bestShippingMethod(HashMap<String, Object> order, BigContainer biggie, SmallContainer smalls) {
		double localVolume = orderVolume(order);
		double localWeight = orderWeight(order);
		double smallVolume = smalls.getContainerVolume();
		double bigVolume = biggie.getContainerVolume();
		//the counter variable stores the amount of objects from the order that have already been packed into a container
		int counter = 0;
		//when the packed items equals the items of the order, the program stops packing items
		while(counter != order.size()){
			double temp = 0;
			if(localVolume > smallVolume) {
				//every time a big container is added, the object's amount is updated
				biggie.setAmount(biggie.getAmount() + 1);
				//this loop goes through the order looking for objects that are not still in a container
				for(String key : order.keySet()) {
					Object value = order.get(key);
					while(!(((item) value).getAmount() == 0) && (temp + ((item) value).getVolume()) < bigVolume && !(((item) value).getAmount() == 0)) {
						temp += ((item) value).getVolume();
						((item) value).setAmount(((item) value).getAmount() - 1);
						localVolume -= ((item) value).getVolume();
						localWeight -= ((item) value).getWeight();
					}
					if(((item) value).getAmount() == 0) {
						counter += 1;
						continue;
					}
				}
			}
			else {
				//if there's the need, there will be only one small container
				smalls.setAmount(smalls.getAmount() + 1);
				smalls.setWeight(localWeight);
				//same than the loop for the big container
				for(String key : order.keySet()) {
					Object value = order.get(key);
					while(!(((item) value).getAmount() == 0) && !(((item) value).getAmount() == 0)) {
						temp += ((item) value).getVolume();
						((item) value).setAmount(((item) value).getAmount() - 1);
						localVolume -= ((item) value).getVolume();
					}
					if(((item) value).getAmount() == 0) {
						counter += 1;
						continue;
					}
				}
			}
		}
		double cost = shippingCost(biggie, smalls);
		System.out.println("Big containers used: " + biggie.getAmount());
		System.out.println("Small containers used: " + smalls.getAmount());
		System.out.println("Shipping cost: " + cost);
	}

	//gets the amount of containers used and calculates the total cost, including the condition on the small container
	public double shippingCost(BigContainer biggie, SmallContainer smalls) {
		return ((biggie.getAmount() * 1800) + ((smalls.getAmount()) * (smalls.getWeight() < 500 ? 1000 : 1200)));
	}

	//this is the implementation of the other methods
	public void app() {
		HashMap<String, Object> order = new HashMap<String, Object>();
		//music references made by my midnight self haha
		BigContainer biggie = new BigContainer(0);
		SmallContainer smalls = new SmallContainer(0);
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		while(!exit) {
			System.out.println("Please choose one of the following options");
			System.out.println("1. Add items to the order");
			System.out.println("2. Remove an item from the order");
			System.out.println("3. Show information about the order");
			System.out.println("4. Show information about an specific item");
			System.out.println("5. Get the best shipping method");
			System.out.println("6. Exit");
			String option = sc.nextLine();
			if(option.toLowerCase().trim().equals("add items to the order") || option.trim().equals("1") || option.trim().equals("1. Add items to the order")) {
				addItems(order);
			}
			else if(option.toLowerCase().trim().equals("remove an item from the order") || option.trim().equals("2") || option.trim().equals("2. Remove an item from the order")) {
				System.out.println("Enter the name of the item you want to remove");
				String itemToRemove = sc.nextLine();
				removeItem(order, itemToRemove);
			}
			else if(option.toLowerCase().trim().equals("show information about the order") || option.trim().equals("3") || option.trim().equals("3. Show information about the order")) {
				printOrderInfo(order);
			}
			else if(option.toLowerCase().trim().equals("show information about an specific item") || option.trim().equals("4") || option.trim().equals("4. Show information about an specific item")) {
				System.out.println("Introduce the name of the item");
				String str = sc.nextLine();
				try {
					printItemInfo(order.get(str));
				}
				catch(Exception e) {
					System.out.println("No item was found under this name");
					continue;
				}
			}
			else if(option.toLowerCase().trim().equals("get the best shipping method") || option.trim().equals("5") || option.trim().equals("5. Get the best shipping method")) {
				HashMap<String, Object> copy = order;
				bestShippingMethod(copy, biggie, smalls);
			}
			else if(option.toLowerCase().trim().equals("exit") || option.trim().equals("6") || option.trim().equals("6. Exit")) {
				exit = true;
				System.out.println("The programm has ended, please close the console");
			}
			else {
				System.out.println("Option not available");
			}
		}
	}
}
