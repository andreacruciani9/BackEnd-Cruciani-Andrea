package it.epicode.week2.day3.esercizi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private long id;
    private String status;
    private LocalDate deliveryDate;
  private   Custumer clienti;
    private   List<Product> productList;
    public Order(Custumer clienti) {
        this.clienti = clienti;
    }

    public Custumer getClienti() {
        return clienti;
    }

    public List<Product> getProductList() {
        return productList;

    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setClienti(Custumer clienti) {
        this.clienti = clienti;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void  addList(Product p){
        productList.add(p);
        System.out.println(productList);

    }
    public void rimuovi(Product p){
        productList.remove(p);
    }
    public List<Order> aggiungiOrdine(Custumer clienti,Product l){

        return new ArrayList<Order> (Integer.parseInt(clienti+l.getName()));

        }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", clienti=" + clienti +
                ", productList=" + productList +
                '}';
    }
}

