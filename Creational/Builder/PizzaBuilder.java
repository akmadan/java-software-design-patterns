package Creational.Builder;


// PizzaBuilder.java - Builder Class
public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder withDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    public PizzaBuilder withSauce(String sauce) {
        pizza.setSauce(sauce);
        return this;
    }

    public PizzaBuilder withTopping(String topping) {
        pizza.setTopping(topping);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
