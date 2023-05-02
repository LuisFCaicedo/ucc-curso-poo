package co.edu.campusucc.poo.models;

import java.util.Date;
import java.util.List;

public class Bill {

    private int id;
    private List<BillProducts> billProductsList;
    private double total;
    private Date date;

    public Bill(int id, List<BillProducts> billProductsList, double total, Date date) {
        this.id = id;
        this.billProductsList = billProductsList;
        this.total = total;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BillProducts> getBillProductsList() {
        return billProductsList;
    }

    public void setBillProductsList(List<BillProducts> billProductsList) {
        this.billProductsList = billProductsList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
