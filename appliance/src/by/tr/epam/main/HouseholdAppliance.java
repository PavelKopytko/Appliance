package by.tr.epam.main;

import java.util.Objects;

public class HouseholdAppliance extends Appliance {

	private int powerConsuption;

	public HouseholdAppliance() {
		super();
	}

	public HouseholdAppliance(int price, int powerConsuption) {
		super(price);
		this.powerConsuption = powerConsuption;
	}

	public int getPowerConsuption() {
		return powerConsuption;
	}

	public void setPowerConsuption(int powerConsuption) {
		this.powerConsuption = powerConsuption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(powerConsuption);
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
		HouseholdAppliance other = (HouseholdAppliance) obj;
		return powerConsuption == other.powerConsuption;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [powerConsuption=" + powerConsuption + "]";
	}

}
