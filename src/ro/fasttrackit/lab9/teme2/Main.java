package ro.fasttrackit.lab9.teme2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Person ion = new Programmer("Marcel", "Iures",
            "str. Avram Iliescu, nr 4", df.parse("1976-03-12"), df.parse("2004-01-13"),
            "manager", "java" );
        System.out.println(ion);
    }
}
