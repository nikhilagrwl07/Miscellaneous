package Java8Constructs.LambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by nikhilagrawal on 26/02/17.
 */
public class GroupByExample {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 1000, "Bangalore");
		Employee e2 = new Employee(2, 2000, "Bangalore");
		Employee e3 = new Employee(3, 3000, "Delhi");
		Employee e4 = new Employee(4, 4000, "Delhi");
		Employee e5 = new Employee(5, 5000, "Mumbai");
		Employee e6 = new Employee(6, 6000, "Mumbai");
		Employee e7 = new Employee(7, 7000, "Pune");
		
		List<Employee> targetEmployeeList = new ArrayList<Employee>() {{
			add(e1);
			add(e2);
			add(e3);
			add(e4);
			add(e5);
			add(e6);
			add(e7);
		}};
		
		Map<String, Long> coutingByOfficeAddress =
				targetEmployeeList.parallelStream().collect(Collectors.groupingBy(Employee::getOfficeAddress, Collectors.counting()));
		System.out.println(coutingByOfficeAddress);
	}
}
