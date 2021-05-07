package InterfaceAbstract;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Customer implements InterfaceAbstract.Ientity {

    private int Id;
    private String firstName;
    private String lastName;
    private String NationalityId;
    private DateTimeFormatter dateTimeFormatter;


    public Customer(int id, String firstName, String lastName, String nationalityId, DateTimeFormatter dateTimeFormatter) {
        this.Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.NationalityId = nationalityId;
        this.dateTimeFormatter=dateTimeFormatter;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }


    public DateTimeFormatter getDateTimeFormatter() {
        return dateTimeFormatter;
    }

    public void setDateTimeFormatter(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }


}
