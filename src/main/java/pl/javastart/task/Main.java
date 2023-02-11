package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Żywność", "Produkty przeznaczone do spożycia");
        Category category2 = new Category("Prasa", "Artykuły prasowe");

        Product product1 = new Product("Masło", 9.99, "Pyszne i tanie polskie masło", category1);
        Product product2 = new Product("Płatki owsiane", 2.99, "Pyszne górskie płatki owsiane", category1);
        Product product3 = new Product("CD-Action", 12.99, "Najczęściej czytane czasopismo gamingowe",
                category2);
        Product product4 = new Product("Papier toaletowy", 12.99, "Trójwarstowy papier o zapachu rumianku");

        SpecialOffer specialOffer1 = new SpecialOffer(product1, "Tylko teraz super" +
                "obniżka cen masła o 20%!", "11.02.2023 - 15.02.2023", 0.2);

        System.out.println(product1.getProductInfo());
        System.out.println(specialOffer1.printPriceAfterDiscount());
    }
}
