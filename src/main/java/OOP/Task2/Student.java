package OOP.Task2;

public class Student extends Person{
    String typeOfStudy;
    int yearOfStudy;
    int studyPrice;

    public Student(String name, String address,String typeOfStudy, int yearOfStudy, int studyPrice) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public int getStudyPrice() {
        return studyPrice;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setStudyPrice(int studyPrice) {
        this.studyPrice = studyPrice;
    }

    public String toString() {
        return "The student's name is " + name + ", he studies " + typeOfStudy + " for " + studyPrice + " EUR per year.";
    }
}
