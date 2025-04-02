package Projects;

import java.util.ArrayList;

public class Person {
    public String name;
    public String country;
    public ArrayList<Person> children;

    public Person(String n, String c) {
        name = n;
        country = c;
        children = new ArrayList<>();

    }//constructor

    public void addChild(Person p) {
        children.add(p);
    }


    public String getCountry() {
        return country;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}