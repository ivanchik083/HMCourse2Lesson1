package lesson1;

import java.io.IOException;
import java.io.Serializable;

public class Monitor implements Serializable {

    private String brand;
    private String model;
    private String price;

    public Monitor() {}


    public Monitor(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString() {
        return  "Monitor: " + "\n" +
                " Brand = " + brand + "\n" +
                " Model = " + model + "\n" +
                " Price = " + price;
    }
}
