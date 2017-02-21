package Java8Constructs;

import java.util.List;
import java.util.function.Consumer;

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