package Creational.Builder;

// Pizza.java - Product Class
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void describePizza() {
        System.out.println("Pizza with " + dough + " dough, " + sauce + " sauce, and " + topping + " topping");
    }
}