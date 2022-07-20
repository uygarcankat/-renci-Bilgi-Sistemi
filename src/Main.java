

public class Main {
    public static void main(String[] args) {

        Course cs404 = new Course("cs404",26,"CS",35,46);
        Course cs303 = new Course("cs303",34,"CS",45,67);
        Course cs412 = new Course("cs412",46,"CS",56,35);

        Teacher Uygar= new Teacher("uygar","42343234","math");
        Student Melis = new Student("Melis","432343",12 , cs404 , cs303 , cs412);

        Melis.calcAvarage(85,72,65,92,72,75);






    }
}