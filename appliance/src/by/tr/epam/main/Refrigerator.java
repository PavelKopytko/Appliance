package by.tr.epam.main;

import java.util.Objects;

public class Refrigerator extends KitchenAppliance {

	private int freezerCapacity;
	private double overalCapacity;

	public Refrigerator() {
		super();
	}

	public Refrigerator(int price, int powerConsuption, double weight, double height, double width, int freezerCapacity,
			double overalCapacity) {
		super(price, powerConsuption, weight, height, width);
		this.freezerCapacity = freezerCapacity;
		this.overalCapacity = overalCapacity;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOveralCapacity() {
		return overalCapacity;
	}

	public void setOveralCapacity(double overalCapacity) {
		this.overalCapacity = overalCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(freezerCapacity, overalCapacity);
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
		Refrigerator other = (Refrigerator) obj;
		return freezerCapacity == other.freezerCapacity && overalCapacity == other.overalCapacity;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [freezerCapacity=" + freezerCapacity + ", overalCapacity="
				+ overalCapacity + "]";
	}

}
