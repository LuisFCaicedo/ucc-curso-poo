package co.edu.campusucc.poo.models;

public class BillProducts {

    private Product product;
    private int quantity;
    private double total;

    public BillProducts(Product product, int quantity, double total) {
        this.product = product;
        this.quantity = quantity;
        this.total =total;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}