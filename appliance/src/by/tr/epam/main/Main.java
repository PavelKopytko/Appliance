package by.tr.epam.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Appliance oven1 = new Oven(100, 1000, 10, 45.5, 59.5, 32, 60);
		Appliance oven2 = new Oven(105, 1500, 12, 45, 68, 33, 60);
		Appliance oven3 = new Oven(120, 2000, 11, 40, 70, 33, 60);

		Appliance refrigerator1 = new Refrigerator(450, 100, 20, 200, 70, 10, 300);
		Appliance refrigerator2 = new Refrigerator(500, 200, 30, 180, 80, 15, 300);
		Appliance refrigerator3 = new Refrigerator(470, 150, 35, 250, 75, 20, 350.5);

		Appliance vacuumCleaner1 = new VacuumCleaner(480, 100, "A", "A2", "all-in-one", 3000, 20);
		Appliance vacuumCleaner2 = new VacuumCleaner(490, 110, "B", "AA-89", "all-in-one", 2900, 25);
		Appliance vacuumCleaner3 = new VacuumCleaner(520, 90, "C", "XX00", "all-in-one", 2950, 30);

		List<Appliance> kitchen = new ArrayList<Appliance>();
		kitchen.add(oven1);
		kitchen.add(oven2);
		kitchen.add(oven3);
		kitchen.add(refrigerator1);
		kitchen.add(refrigerator2);
		kitchen.add(refrigerator3);
		kitchen.add(vacuumCleaner1);
		kitchen.add(vacuumCleaner2);
		kitchen.add(vacuumCleaner3);

		ApplianceView view = new ApplianceView();
//		view.print(kitchen);

		Collections.sort(kitchen, new ApplianceComparator());

//		System.out.println();

		view.print(kitchen);
	}

}
