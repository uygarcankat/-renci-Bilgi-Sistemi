

public class Main {
    public static void main(String[] args) {

        Course cs404 = new Course("cs404",26,"CS");
        Course cs303 = new Course("cs303",34,"CS");
        Course cs412 = new Course("cs412",46,"CS");

        Teacher Uygar= new Teacher("uygar","42343234","math");
        Student Melis = new Student("Melis","432343",12 , cs404 , cs303 , cs412);

        Melis.addBulkExamNote(90,40,60);
        Melis.isPass();






    }
}