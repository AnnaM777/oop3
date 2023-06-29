package Student;
/*
firstname
lastname
avgGrage
studentNumber

Uneti sa tastature 2 studenta I prikazati ciji je prosek bolji.

 */
public class Student {

    String firstname;
    String lastname;
    double avg;
    String studentNumber;

    public Student() {

    }

    public Student(String firstname, String lastname, double avg, String studentNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.avg = avg;
        this.studentNumber = studentNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
