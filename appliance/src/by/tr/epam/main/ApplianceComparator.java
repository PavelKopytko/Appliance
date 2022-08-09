package by.tr.epam.main;

import java.util.Comparator;

public class ApplianceComparator implements Comparator<Appliance> {

	@Override
	public int compare(Appliance o1, Appliance o2) {
		int price1 = o1.getPrice();
		int price2 = o2.getPrice();
		if (price1 < price2) {
			return -1;
		} else if (price1 == price2) {
			return 0;
		} else {
			return 1;
		}
	}

}
