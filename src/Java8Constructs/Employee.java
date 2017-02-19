package Java8Constructs;

/**
 * Created by nikhilagrawal on 18/02/17.
 */
public class Employee {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

