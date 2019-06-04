package dogexcercise;

import java.util.ArrayList;
import java.util.List;

public class DogExcercise {

    public static void main(String[] args) {

        List<Dog> dogList = new ArrayList();

        Dog d1 = new Dog("Beethoven", 3);
        Dog d2 = new Dog("Azor", 5);

        dogList.add(d1);
        dogList.add(d2);

//        List<Object> list2 = new ArrayList();
//        list2.add("Jack");
//        list2.add(3);
//        list2.add("Beethoven");
//        list2.add(5);
//        list2.add(d2);
//        for (Object o : list2) {
//            System.out.println(o.getClass());
//        }
        Person p1 = new Person("Nick", 30);
        p1.setSkyli(d1);
        Person p2 = new Person("Mary", 21);
        List<Person> personList = new ArrayList();
        Person p3 = new Person("Andy", 19);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        for (Person p : personList) {
            if (p.getSkyli() != null) {
                System.out.println("Person " + p.getName() + " has dog " + p.getSkyli().getName());
            } else {
                System.out.println("Person " + p.getName() + " has no dog ");

            }
        }
        
        Team t1 = new Team("Football");
        t1.setRoster(personList);
        
        
        t1.addPlayer(p3);
        
        Dog d3 = new Dog("Russel", 1);
        p3.setSkyli(d3);
        
        List<Person> listPerson2 = t1.getPlayers();
        for (Person human: listaPerson2){
            if(human.getSkyli() != null){
                System.out.println(human.getName() +" has "+ human.getSkyli().getName());
            }else{
                System.out.println("df");
            }
        }
        

    }

}
