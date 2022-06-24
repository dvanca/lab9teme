package ro.fasttrackit.lab9.teme2;

import java.util.Date;

public class DatabaseAdmin extends Employee {

    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, String address, Date dateOfBirthday, Date dateOfEmployment, String position) {
        super(firstName, lastName, address, dateOfBirthday, dateOfEmployment, position);
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
        return "db admin" + super.getAddress();
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }
}
