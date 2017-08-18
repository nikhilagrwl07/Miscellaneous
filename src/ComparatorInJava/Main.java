package ComparatorInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "A", 1000.0, 32, new Date(2011, 10, 1));
		Employee e2 = new Employee(2, "AB", 1300.0, 32, new Date(2012, 10, 1));
		Employee e3 = new Employee(3, "B", 10.0, 42, new Date(2010, 11, 3));
		Employee e4 = new Employee(4, "CD", 100.0, 32, new Date(2011, 10, 1));
		Employee e5 = new Employee(5, "AAA", 1200.0, 26, new Date(2011, 10, 1));

		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		listOfEmployees.add(e5);


		//        Employee[] listOfEmployees= new Employee[5];
		//        listOfEmployees[0]= e1;
		//        listOfEmployees[1]= e2;
		//        listOfEmployees[2] = e3;
		//        listOfEmployees[3] = e4;
		//        listOfEmployees[4] = e5;



		System.out.println("Unsorted List : ");
		printObjectsFromList(listOfEmployees);

		//         Collections.sort(listOfEmployees, new Comparator<Employee>() {
		//            public int compare(Employee s1, Employee s2) {
		//                // notice the cast to (Integer) to invoke compareTo
		//                return ((Double)s1.getSalary()).compareTo(s2.getSalary());
		//            }
		//        });

		Collections.sort(listOfEmployees, Employee.AgeComparator);

		//         Arrays.sort(listOfEmployees);
		System.out.println("Sorted List : ");
		printObjectsFromList(listOfEmployees);


	}


	public static void printObjects(Employee[] listOfEmployees) {
		for (Employee e : listOfEmployees) {
			System.out.println(e.toString());
		}
	}

	public static void printObjectsFromList(List<Employee> listOfEmployees) {
		for (Employee e : listOfEmployees) {
			System.out.println(e.toString());
		}
	}

}
