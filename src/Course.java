public class Course{

   Teacher teacher;
   String name;
   int code;
   String prefix;
   int note ;


   Course( String name, int cod,String prefix){

       this.name= name;
       this.code= code;
       this.prefix= prefix;
       this.note= 0;
       this.teacher= teacher;

   }


    void addTeacher(Teacher t){

       if (this.prefix.equals(t.branch)){

           this.teacher=t;
           System.out.println("Ekleme başarılı");
       }
       else{
           System.out.println("Öğretmen ile ders uyuşmuyor!");
       }
   }

    void printTeacher(){

        System.out.println(this.name + "dersinin akademisyeni "+ teacher.name+"dir.");

   }

}