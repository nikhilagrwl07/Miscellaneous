package Generics.genericsBoundedType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Driver {
    private static void main(String[] args) {
        Course maths = new Course("Math", 1);
        Course chemistry = new Course("Chemistry", 2);
        Course physics = new Course("Physics", 3);

        List<Course> courses = new ArrayList<>();
        courses.add(physics);
        courses.add(maths);
        courses.add(chemistry);

        System.out.println("Courses before sorting ... " + courses);

        Collections.sort(courses);

        System.out.println("Courses after sorting ... " + courses);


        int comparedResult = compare(maths, physics);
        System.out.println(comparedResult);
    }

    private static <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }

}


class Course implements Comparable<Course> {
    private String name;
    private Integer id;

    public Course(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    private Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Course otherCourse) {
        if (this.getId() > otherCourse.getId()) {
            return -1;
        } else if (this.getId() < otherCourse.getId()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}