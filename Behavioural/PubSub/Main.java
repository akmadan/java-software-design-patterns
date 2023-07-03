package Behavioural.PubSub;






// Main.java - Usage Example
public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber subscriber1 = new ExampleSubscriber("Subscriber 1");
        Subscriber subscriber2 = new ExampleSubscriber("Subscriber 2");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        publisher.publish("Hello, subscribers!");

        publisher.unsubscribe(subscriber1);

        publisher.publish("Goodbye, subscribers!");
    }
}
