public class Student{

    Course fizik;
    Course kimya;
    Course biyoloji;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;


    Student( String name,String stuNo,int classes,Course fizik, Course kimya,Course biyoloji){

        this.name=name;
        this.stuNo= stuNo;
        this.classes=classes;
        this.avarage=avarage;
        this.fizik=fizik;
        this.kimya=kimya;
        this.biyoloji=biyoloji;

    }

    void addBulkExamNote(int fizik_yazılı,int fizik_verbal,int kimya_yazılı,int kimya_verbal,int biyoloji_yazılı,int biyoloji_verbal){
        if(0<=fizik_yazılı && fizik_yazılı<=100 && 0<=fizik_verbal && fizik_verbal<=100){

            this.fizik.note= fizik_yazılı;
            this.fizik.verbal_note= fizik_yazılı;

        }

        if((0<=kimya_yazılı && kimya_yazılı<=100&& 0<=kimya_verbal && kimya_verbal<=100)){

            this.kimya.note= kimya_yazılı;
            this.kimya.verbal_note= kimya_yazılı;
        }

        if((0<=biyoloji_yazılı && biyoloji_yazılı<=100 && 0<=biyoloji_verbal && biyoloji_verbal<=100)){

            this.biyoloji.note= biyoloji_yazılı;
            this.biyoloji.verbal_note= biyoloji_verbal;
        }

    }

    void isPass(){
        this.avarage= (this.fizik.note+this.kimya.note+this.biyoloji.note)/3.0;

        if ( avarage>=60){

            System.out.println("thank you, you are successful for this course!");

          }

            else{

            System.out.println("Sorry! Repeating a grade level");

        }

        printNote();

    }

    void calcAvarage(int fizik_yazılı,int fizik_verbal,int kimya_yazılı,int kimya_verbal,int biyoloji_yazılı,int biyoloji_verbal){

        double fizik_verbal_rate= 0.2;
        double kimya_verbal_rate=0.3;
        double biyoloji_verbal_rate=0.4;
        double fizik_yazılı_rate= 0.8;
        double kimya_yazılı_rate=0.7;
        double biyoloji_yazılı_rate=0.6;

        double average_of_fizik = ( fizik_verbal_rate * fizik_verbal )+ ( fizik_yazılı * fizik_yazılı_rate );
        double average_of_kimya = ( kimya_verbal_rate * kimya_verbal )+ ( kimya_yazılı * kimya_yazılı_rate );
        double average_of_biyoloji = (biyoloji_verbal_rate * biyoloji_verbal )+ ( biyoloji_yazılı * biyoloji_yazılı_rate );

        System.out.println("Fizik ortalamanız :" + average_of_fizik);
        System.out.println("Kimya ortalamanız :" + average_of_kimya);
        System.out.println("Biyoloji ortalamanız :" + average_of_biyoloji);




    }

    void printNote(){

        System.out.println("öğrenci " + this.name);
        System.out.println( "C1 dersi notu "+ this.fizik.note);
        System.out.println( "C2 dersi notu "+ this.kimya.note);
        System.out.println( "C3 dersi notu "+ this.biyoloji.note);
        System.out.println( "ortalamanız " + this.avarage);



    }








}