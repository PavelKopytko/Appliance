package by.tr.epam.main;

import java.util.Objects;

public class KitchenAppliance extends HouseholdAppliance {

	private double weight;
	private double height;
	private double width;

	public KitchenAppliance() {
		super();
	}

	public KitchenAppliance(int price, int powerConsuption, double weight, double height, double width) {
		super(price, powerConsuption);
		this.weight = weight;
		this.height = height;
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(height, weight, width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KitchenAppliance other = (KitchenAppliance) obj;
		return Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [weight=" + weight + ", height=" + height + ", width=" + width + "]";
	}

}
