package Java8Constructs.LambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by nikhilagrawal on 18/02/17.
 */
public class LambdaAndStreamExample {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1,1000);
        Employee employee2 = new Employee(2,2000);
        Employee employee3 = new Employee(3,3000);

        List<Employee> employeeNormalList = new ArrayList<>();
        employeeNormalList.add(employee1);
        employeeNormalList.add(employee2);
        employeeNormalList.add(employee3);

        List<Employee> employeeTargetList = new ArrayList<>();
        employeeTargetList.add(employee1);
        employeeTargetList.add(employee2);
        employeeTargetList.add(employee3);

//        for (Employee e : employeeList) {
//            System.out.println(e.toString());
//        }

        //Example for combining lambdas into one single lambda and then reusing it
        Consumer<Employee> giveAllRaise = e -> {
            System.out.println("Giving 200 percent hike ");
            e.setSalary(e.getSalary() * 2);
            System.out.println("Giving 400 percent hike ");
            e.setSalary(e.getSalary() * 4);
        };

        employeeNormalList.stream().parallel().forEach(giveAllRaise);
        employeeTargetList.stream().parallel().forEach(giveAllRaise);

//        employeeNormalList.stream().parallel().forEach(Employee::raiseSalaryBy400Percent);
//        employeeNormalList.stream().parallel().forEach(employee -> System.out.println(employee.toString()));


        final int[] total = {1000};

        employeeNormalList.stream().parallel().forEach(employee -> total[0] += employee.getSalary());
        System.out.println(total[0]);

//        String[] names = {"Nikhil", "Ritu", "Priyanka"};
//
//        Arrays.sort(names, (o1, o2) -> (o1.length() - o2.length()));
//        System.out.println(Arrays.asList(names));

       // Stream.of(employeeList).parallel().forEach(System.out::println);
    }
}
