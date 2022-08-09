package by.tr.epam.main;

import java.util.List;

public class ApplianceView {

	public void print(List<Appliance> appliances) {

		for (Appliance app : appliances) {
			System.out.println(app.getClass().getSimpleName() + " " + app.getPrice());
		}
	}

}
