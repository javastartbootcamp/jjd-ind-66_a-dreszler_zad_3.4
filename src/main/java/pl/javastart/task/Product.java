package pl.javastart.task;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String n, double pr, String desc, Category cat) {
        name = n;
        price = pr;
        description = desc;
        category = cat;
    }

    Product(String n, double pr, String desc) {
        name = n;
        price = pr;
        description = desc;
    }

    String getProductInfo() {
        return name + "\nCena: " + price + "zł\n" + "Opis: " + description + "\n" + category.getCategoryInfo();
    }
}