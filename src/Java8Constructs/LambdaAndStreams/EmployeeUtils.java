package Java8Constructs.LambdaAndStreams;

import java.util.List;

/**
 * Created by nikhilagrawal on 21/02/17.
 */
public class EmployeeUtils{

    public static Employee findById(List<Employee> employeeList , int employeeId){

        final Employee[] resultEmployee = {null};
        employeeList.stream().parallel().forEach(employee -> {
            if(employee.getId()==employeeId)
            {
                resultEmployee[0] = employee;
            }
        });

        return resultEmployee[0];
    }

}