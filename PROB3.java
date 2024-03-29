class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product {
    String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
    }
}

class Clothing extends Product {
    String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
    }
}

public class PROB3 {
    public static void main(String[] args) {
        Product genericItem = new Product("Generic Item", 20.0);
        Electronics smartphone = new Electronics("Smartphone", 599.99, "Samsung");
        Clothing tShirt = new Clothing("T-Shirt", 15.99, "Medium");

        System.out.println("-------- Product Details --------");
        genericItem.displayDetails();
        System.out.println("--------------------------------");

        System.out.println("-------- Product Details --------");
        smartphone.displayDetails();
        System.out.println("--------------------------------");

        System.out.println("-------- Product Details --------");
        tShirt.displayDetails();
        System.out.println("--------------------------------");
    }
}
