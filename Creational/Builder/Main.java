package Creational.Builder;

// Main.java - Usage Example
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .withDough("thin crust")
                .withSauce("tomato")
                .withTopping("cheese")
                .build();

        pizza.describePizza();
    }
}