package Java8Constructs;

import java.util.Arrays;

/**
 * Created by nikhilagrawal on 18/02/17.
 */
public class LambdaAndStreamExample {

    public static void main(String[] args) {

//        Employee employee1 = new Employee("nikhil",1000);
//        Employee employee2 = new Employee("ritu",2000);
//        Employee employee3 = new Employee("priya",3000);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);

//        for (Employee e : employeeList) {
//            System.out.println(e.toString());
//        }

//        employeeList.stream().forEach(e -> System.out.println(e.toString()));


        String[] names = {"Nikhil", "Ritu", "Priyanka"};

        Arrays.sort(names, (String o1, String o2) -> (o1.length() - o2.length()));
        System.out.println(Arrays.asList(names));
    }
}
