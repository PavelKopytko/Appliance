package by.tr.epam.main;

import java.util.Objects;

public class Appliance {

	private int price;

	public Appliance() {
		super();
	}

	public Appliance(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return price == other.price;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [price=" + price + "]";
	}

}
