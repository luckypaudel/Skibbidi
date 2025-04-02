package Projects;

import java.util.ArrayList;

public class FamilyTreeMain {


    public static void run(){

        Person person1 = new Person("Bobbie", "Mexico");
//generation 2
        person1.addChild(  new Person("Susan", "Canada")     );   //0
        person1.addChild(  new Person("Jill", "Canada")     );    //1
        person1.addChild(  new Person("Bobette", "Japan")     );   //2
 //Generation 3
        person1.children.get(0).addChild(  new Person("Zain", "Japan")  );
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));

       //my add
        person1.children.get(1).addChild(new Person("Lucky", "Nepal"));
        person1.children.get(1).addChild(new Person("Jack", "Zimbabwe"));
//generation 4

        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));

        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));
//myadd
        person1.children.get(1).children.get(1).addChild(new Person("Charlie", "USA"));
        person1.children.get(1).children.get(1).addChild(new Person("Jimmy", "USA"));


    }



    public static int countFamily (Person ptemp){
        int num = 0;


        return num;
    }


    public static void printCanadians(Person ptemp){


    }
    public static void printFamily(){
     

    }




}
