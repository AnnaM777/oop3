package Student;
/*
firstname
lastname
avgGrage
studentNumber

Uneti sa tastature 2 studenta I prikazati ciji je prosek bolji.

 */
public class Zadatak1 {
    public static void main(String[] args) {


        Student student1 = new Student("Marko", "Markovic", 7.9, "44");
        Student student2 = new Student("Petar", "Petrovic", 6.8, " 33");

        if (student1.avg >student2.avg){
            System.out.println("Student 1 ima vecu prosecnu ocenu");
        } else if (student1.avg == student2.avg) {
            System.out.println("Studenti imaju istu prosecnu ocenu");

        }else {
            System.out.println( student2.firstname + student2.lastname + " ima vecu prosecnu ocenu");
        }


    }
}
