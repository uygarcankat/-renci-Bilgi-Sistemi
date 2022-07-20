public class Course{

   Teacher teacher;
   String name;
   int code;
   String prefix;
   int note ;
   int verbal_note;


   Course( String name, int code,String prefix,int note,int verbal_note){

       this.name= name;
       this.code= code;
       this.prefix= prefix;
      this.note=note;
       this.verbal_note=verbal_note;

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