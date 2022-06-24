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

    @Override
    public String toString() {
        return "Company{" +
                "listaPersonal=" + listaPersonal +
                '}';
    }
}
