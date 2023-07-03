package Behavioural.PubSub;

// Subscriber.java
interface Subscriber {
    void receive(String message);
}

// ExampleSubscriber.java
public class ExampleSubscriber implements Subscriber {
    private String name;

    public ExampleSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}