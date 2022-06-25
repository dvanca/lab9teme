package ro.fasttrackit.lab9.lab10.cealaltaTema;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Person> listaPersonal;

    public Company(){
        this.listaPersonal = new ArrayList<>();

    }

    public boolean adaugaAngajatul(Person e){
        return listaPersonal.add(e);
    }

    public void getManager(){
        for (Person e : listaPersonal){
            if (e.positionFind().equals("manager")){
                System.out.println("This is the manager" + e);
                return;
            }
        }
        System.out.println("Managerul nu exista");
        }

        public void getPersons(String profession){
        List<Person> a = new ArrayList<>();
        for (Person e : listaPersonal){
            if (e.positionFind().equals(profession)){
                a.add(e);
            }
        }
            System.out.println(a);
        }

        public void getPersonsOlder(int age){
        List<Person> b = new ArrayList<>();
        for (Person e : listaPersonal){
            if (age < e.getAge()){
                b.add(e);
            }
        }
            System.out.println(b);
        }

        public void getPerson(String person){
        List<Person> c = new ArrayList<>();
        for (Person e : listaPersonal){
            if (person.equals(e.getName())){
                c.add(e);
            }
        }
            System.out.println(c);
        }

        public void employ(Person noulAngajat){
        listaPersonal.add(noulAngajat);
        }

        public void roster(){
        for ( Person e : listaPersonal){
            System.out.println("Person " + e.getName() + " is "+ e.getAge()+" and has the position " + e.getPosition());
        }
        }

    @Override
    public String toString() {
        return "Company{" +
                "listaPersonal=" + listaPersonal +
                '}';
    }
}
