package Java8Constructs.LambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * @author Nikhil Agrawal on 5/17/17.
 */
//Predicates represent single argument functions that return a boolean value:

public class Java8PredicateExamples {
    public static void main(String[] args) {

        Predicate<Integer> isDivisblePredicate = (x) -> IntStream.range(2, x).noneMatch(divisor -> x % divisor == 0);

        System.out.println("IsPrime Predicate - " + isDivisblePredicate.test(30));

        process(10, (i) -> i > 20);

        User adminRole = new User("Nikhil", "admin");
        User guestRole = new User("Ritu", "guest");
        List<User> userList = new ArrayList<>();
        userList.add(adminRole);
        userList.add(guestRole);

        Predicate<User> userWithAdminRole = (u) -> u.getRole().equalsIgnoreCase("admin");
        List<User> resultSet = userWithAdminRole(userList, userWithAdminRole);

        for (User user : resultSet) {
            System.out.println(user.toString());
        }

    }

    public static List<User> userWithAdminRole(List<User> userList, Predicate<User> predicate) {
        List<User> usersWithAdminRole = new ArrayList<>();

        for (User user : userList) {
            if (predicate.test(user)) {
                usersWithAdminRole.add(user);
            }
        }
        return usersWithAdminRole;
    }

    public static void process(int number, Predicate<Integer> predicate) {
        System.out.println(predicate.test(number));
    }

    static class User {
        String name, role;

        public User(String name, String role) {
            this.name = name;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        @Override
        public String toString() {
            return "User{" + "name='" + name + '\'' + ", role='" + role + '\'' + '}';
        }
    }
}


