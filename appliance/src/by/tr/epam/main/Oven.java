package by.tr.epam.main;

import java.util.Objects;

public class Oven extends KitchenAppliance {

	private int capacity;
	private int depth;

	public Oven() {
		super();
	}

	public Oven(int price, int powerConsuption, double weight, double height, double width, int capacity, int depth) {
		super(price, powerConsuption, weight, height, width);
		this.capacity = capacity;
		this.depth = depth;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity, depth);
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
		Oven other = (Oven) obj;
		return capacity == other.capacity && depth == other.depth;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [capacity=" + capacity + ", depth=" + depth + "]";
	}

}
