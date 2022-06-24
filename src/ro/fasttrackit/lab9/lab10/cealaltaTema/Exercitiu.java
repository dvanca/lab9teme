package ro.fasttrackit.lab9.lab10.cealaltaTema;

public class Exercitiu {
    public static void main(String[] args) {

        Company companie = new Company();
        Person ion = new Person("Ioan Petrescu", 35, "manager");
        Person marcel = new Person("Marcelescu Petrescu", 45, "welder");
        Person marcelescu = new Person("Iliescu", 25, "welder");
        companie.adaugaAngajatul(ion);
        companie.adaugaAngajatul(ion);
        companie.adaugaAngajatul(ion);

        //Person marcel = new Person("Marcelescu Petrescu", 45, "welder");
        //Person ion = new Person("Ioan Petrescu", 35, "manager");
       // Person ion = new Person("Ioan Petrescu", 35, "manager");
       // Person ion = new Person("Ioan Petrescu", 35, "manager");

        System.out.println(companie);
    }
}
