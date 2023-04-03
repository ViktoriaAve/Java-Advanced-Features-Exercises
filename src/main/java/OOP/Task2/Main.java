package OOP.Task2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ricardo", "Somewhere St.1", "Biology", 2, 1500);
        Lecturer lecturer = new Lecturer("Mr. Jenkins", "Green st.10", "Psychology", 4300);

        System.out.println(student);
        System.out.println(lecturer);
    }
}
