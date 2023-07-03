package Structural.Adapter;

// Adaptee.java
class Adaptee {
    void specificRequest() {
        System.out.println("Adaptee: Specific Request");
    }
}

// Target.java
interface Target {
    void request();
}

// Adapter.java
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Adapter: Adapted Request");
        adaptee.specificRequest();
    }
}

// Main.java - Usage Example
public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
