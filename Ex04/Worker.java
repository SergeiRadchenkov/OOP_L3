package Ex04;

import java.util.Iterator;

public class Worker implements Iterator<String> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker (String firstName,
            String lastname,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.age = age;
        this.salary = salary;
        this.index = 0;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("firstName: %s", firstName);
            case 2:
                return String.format("lastName: %s", lastName);
            case 3:
                return String.format("age: %s", age);
            default:
                return String.format("salary: %s", salary);
        }
    }
}