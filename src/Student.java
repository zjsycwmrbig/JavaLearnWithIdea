abstract class Man{
    String name;
    String country;
    Man(){
        this.name = "zjs";
        this.country = "CN";
    }
    Man(String name,String country){
        this.name = name;
        this.country = country;
    }

    abstract void run();

}


public class Student extends Man{
    public static  String SEX = "0 and 1";
    public static  void PrintSchool(){
        System.out.println("BUPT!!!");
    }
    void run(){
        System.out.println(this.name + " are running!!");
    }

}

