package ro.fasttrackit.lab9.teme2;

import java.time.LocalDate;
import java.util.Date;

public class Employee implements Person{
    private String firstName;
    private String lastName;
    private String address;
    private Date dateOfBirthday;

    private Date dateOfEmployment;
    private String position;

    public Employee(String firstName, String lastName, String address,
                    Date dateOfBirthday, Date dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirthday = dateOfBirthday;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public Employee() {
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Date  getBirthday() {
        return dateOfBirthday;
    }

    @Override
    public String getAddress() {
        return address;
    }


    public String getPosition() {return position;}

    public Date getDateOfEmployment() {return dateOfEmployment;}

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", dateOfEmployment=" + dateOfEmployment +
                ", position='" + position + '\'' +
                '}';
    }

}
