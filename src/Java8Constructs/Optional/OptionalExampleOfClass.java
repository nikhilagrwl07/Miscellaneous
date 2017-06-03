package Java8Constructs.Optional;

import Java8Constructs.LambdaAndStreams.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by nikhilagrawal on 18/02/17.
 */
public class OptionalExampleOfClass {

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

        employeeNormalList.forEach(giveAllRaise);
        employeeTargetList.forEach(giveAllRaise);

        employeeNormalList.forEach(Employee::raiseSalaryBy400Percent);
        employeeNormalList.forEach(employee -> System.out.println(employee.toString()));


        int[] total = {0};

        employeeNormalList.forEach(employee -> total[0] += employee.getSalary());
        System.out.println(total[0]);

//        String[] names = {"Nikhil", "Ritu", "Priyanka"};
//
//        Arrays.sort(names, (o1, o2) -> (o1.length() - o2.length()));
//        System.out.println(Arrays.asList(names));

      List<String> listOfLanguage = Arrays.asList("Java", "Perl", "C", "Lisp");

      String results = String.join(",",listOfLanguage);
      System.out.println("results = " + results);
    }

    public String getCustomerOfficeAddressWithGivenId(List<Employee> employeeList , int employeeId){
       return employeeList.stream()
                          .filter(c -> c.getId()==employeeId)
                          .findFirst()
                          .map(Employee::getOfficeAddress)
                          .orElse("null");
    }
}
