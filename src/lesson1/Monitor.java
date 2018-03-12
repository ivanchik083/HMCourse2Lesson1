package lesson1;


public class Monitor {

    private String brand;
    private String model;
    private String price;


    public Monitor(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public String getPrice() {
        return price;
    }



    public String toString() {
        return  "Monitor: " + "\n" +
                " Brand = " + brand + "\n" +
                " Model = " + model + "\n" +
                " Price = " + price;
    }
}
