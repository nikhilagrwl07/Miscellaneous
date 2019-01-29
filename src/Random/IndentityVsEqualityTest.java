package Random;

import java.util.Objects;

public class IndentityVsEqualityTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nikhil", 123);
        Employee e2 = new Employee("Nikhil", 123);


        // e3 and e1 are pointing to same memory address so identity check will pass
        Employee e3 = e1;
        System.out.println(e3==e1);
        System.out.println(e3==e2);


        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e2));
    }
}


class Employee {
    private String employeeName;
    private int employeeId;

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
