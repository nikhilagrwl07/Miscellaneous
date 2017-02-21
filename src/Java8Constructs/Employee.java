package Java8Constructs;

/**
 * Created by nikhilagrawal on 18/02/17.
 */
public class Employee {
    int id;
    int salary;

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    public void raiseSalaryBy200Percent(){
        this.setSalary(this.getSalary()*2);
    }

    public void raiseSalaryBy400Percent(){
        this.setSalary(this.getSalary()*4);
    }
}

