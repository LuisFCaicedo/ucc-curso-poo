package co.edu.campusucc.poo.models;

import java.util.Date;

public class Client {

    private int id;
    private String name;
    private String lastName;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client(int id, String name, String lastName, Date date) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.date = date;
    }
}