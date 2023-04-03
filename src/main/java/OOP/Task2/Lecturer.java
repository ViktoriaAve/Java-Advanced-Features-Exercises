package OOP.Task2;

public class Lecturer extends Person {
    String specialization;
    int salary;

    public Lecturer(String name, String address, String specialization, int salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "The lecturer's name is " + name + ". He specializes in " + specialization + ". The lecturer's salary is "+ salary + " EUR.";
    }
}
