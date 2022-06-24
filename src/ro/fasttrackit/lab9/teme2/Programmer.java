package ro.fasttrackit.lab9.teme2;

import java.time.LocalDate;
import java.util.Date;

public class Programmer extends Employee {

    private String language;

    public Programmer(String firstName, String lastName, String address, Date dateOfBirthday,
                     Date dateOfEmployment, String position, String language) {
        super(firstName, lastName, address, dateOfBirthday, dateOfEmployment, position);
        this.language = language;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public Date getBirthday() {
        return super.getBirthday();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String getPosition(){
        return "programmer";
    }

    public String getLanguage(){
        return language;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", dateOfBirthday=" + getBirthday() +
                ", dateOfEmployment=" + getDateOfEmployment() +
                ", position='" + getPosition() + '\'' +
                ", language='" + getLanguage() + '\'' +
                '}';
    }

}
