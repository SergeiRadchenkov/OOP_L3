package Ex02;

public class Worker {
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
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
