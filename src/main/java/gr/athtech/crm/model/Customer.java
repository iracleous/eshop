package gr.athtech.crm.model;

import lombok.Data;

import java.util.Date;


@Data
public class Customer {
    private String name;
    private char gender;
    private int age;
    private Date dateOfBirth;

}
