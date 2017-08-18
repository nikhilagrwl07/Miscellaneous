package Java8Constructs.LambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by nikhilagrawal on 26/02/17.
 */
public class PartitionByExample {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 1000);
		Employee e2 = new Employee(2, 2000);
		Employee e3 = new Employee(3, 3000);
		Employee e4 = new Employee(4, 4000);
		Employee e5 = new Employee(5, 5000);
		Employee e6 = new Employee(6, 6000);
		
		List<Employee> targetEmployeeList = new ArrayList<Employee>() {{
			add(e1);
			add(e2);
			add(e3);
			add(e4);
			add(e5);
			add(e6);
		}};
		
		Map<Boolean, List<Employee>> employeeWithSalaryMorethan3000 =
				targetEmployeeList.stream().parallel().collect(Collectors.partitioningBy(e -> e.getSalary() > 3000));
		System.out.println("Emloyee with salary > 3000 are - " + employeeWithSalaryMorethan3000.get(true));
		System.out.println("Emloyee with salary < 3000 are - " + employeeWithSalaryMorethan3000.get(false));
	}
}
