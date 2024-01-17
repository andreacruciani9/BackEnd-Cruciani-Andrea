package it.epicode.week2.day3.esercizi;

public class Product {
    private long id;
    private  String name;

    private String categoria;
    private double price;

    public Product(long id, String name, String categoria, double price) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoria='" + categoria + '\'' +
                ", price=" + price +
                '}';
    }
}

