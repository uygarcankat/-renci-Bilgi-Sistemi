public class Student{

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;


    Student( String name,String stuNo,int classes,Course c1, Course c2,Course c3){

        this.name=name;
        this.stuNo= stuNo;
        this.classes=classes;
        this.avarage=avarage;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;

    }

    void addBulkExamNote(int c1,int c2,int c3){
        if(0<=c1 && c1<=100){

            this.c1.note= c1;
        }

        if((0<=c2 && c2<=100)){

            this.c2.note= c2;
        }

        if((0<=c3 && c3<=100)){

            this.c3.note= c3;
        }

    }

    void isPass(){
        this.avarage= (this.c1.note+this.c2.note+this.c3.note)/3.0;

        if ( avarage>=60){

            System.out.println("thank you, you are successful for this course!");

          }

            else{

            System.out.println("Sorry! Repeating a grade level");

        }

        printNote();

    }





    void printNote(){

        System.out.println("öğrenci " + this.name);
        System.out.println( "C1 dersi notu "+ this.c1.note);
        System.out.println( "C2 dersi notu "+ this.c2.note);
        System.out.println( "C3 dersi notu "+ this.c3.note);
        System.out.println( "ortalamanız " + this.avarage);



    }








}