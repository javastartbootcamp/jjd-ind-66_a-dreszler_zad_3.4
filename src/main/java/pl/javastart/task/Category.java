package pl.javastart.task;

public class Category {
    String name;
    String description;

    Category(String n, String d) {
        name = n;
        description = d;
    }

    String getCategoryInfo() {
        return "Kategoria: " + name + "\nOpis kategorii: " + description;
    }
}
