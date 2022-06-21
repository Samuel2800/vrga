package Containers;

public class SmallContainer {
	//the volume of the container stays fixed
	private double containerVolume = 38.139822;
	private int amount;
	private double weight;

	public SmallContainer(int amount) {
		super();
		this.containerVolume = containerVolume;
		this.amount = amount;
		this.weight = weight;
	}

	public double getContainerVolume() {
		return containerVolume;
	}

	public void setContainerVolume(double containerVolume) {
		this.containerVolume = containerVolume;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double localWeight) {
		this.weight = localWeight;
	}
}
