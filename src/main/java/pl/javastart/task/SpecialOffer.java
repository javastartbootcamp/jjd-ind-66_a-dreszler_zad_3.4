package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String duration;
    double discount;

    SpecialOffer(Product prod, String desc, String dur, double dis) {
        product = prod;
        description = desc;
        duration = dur;
        discount = dis;
    }

    double getPriceAfterDiscount() {
        return product.price - product.price * discount;
    }

    String printPriceAfterDiscount() {
        return String.format("Cena produktu %s po obniżce: %.2f", product.name, getPriceAfterDiscount());
    }
}
