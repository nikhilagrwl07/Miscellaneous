

package ComparatorInJava;

import java.util.Comparator;
import java.util.Date;


public class Employee {

    private int id;
    private String name;
    private double salary;
    private int age;
    private Date dateOfJoining;

    public Employee(int id, String name, double salary, int age, Date dateOfJoining) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

//    
//    

    /**
     *
     */
    public static final Comparator<Employee> AgeComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.age!=o2.age){
                return o1.age - o2.age;    
            }
            else 
            {
                return o1.id-o2.id;
            }
              // This will work because age is positive integer
        }
      
    };


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   

//    @Override
//    public int compareTo(Employee o) {
//        System.out.println("Check");
//        return this.age-o.age;
//    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dateOfJoining=" + dateOfJoining + '}';
    }

}
