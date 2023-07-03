# Java Design Patterns Examples

This repository contains examples of various design patterns implemented in Java. Each design pattern is provided as a separate Java file and can be run individually.

## Design Patterns Included

1. Factory Pattern
   - Location: [FactoryPattern.java](FactoryPattern.java)
   - Description: Demonstrates the Factory pattern, which provides an interface for creating objects but lets subclasses decide which class to instantiate.

2. Builder Pattern
   - Location: [BuilderPattern.java](BuilderPattern.java)
   - Description: Demonstrates the Builder pattern, which separates the construction of an object from its representation, allowing the same construction process to create various representations.

3. Singleton Pattern
   - Location: [Singleton.java](Singleton.java)
   - Description: Demonstrates the Singleton pattern, which ensures a class has only one instance and provides a global point of access to that instance.

4. Pub/Sub Pattern
   - Location: [Publisher.java](Publisher.java), [Subscriber.java](Subscriber.java), [ExampleSubscriber.java](ExampleSubscriber.java)
   - Description: Demonstrates the Pub/Sub (Publish/Subscribe) pattern, which allows decoupling between publishers and subscribers, enabling one-to-many communication.

5. Iterator Pattern
   - Location: [Item.java](Item.java), [ItemCollection.java](ItemCollection.java)
   - Description: Demonstrates the Iterator pattern, which provides a way to access the elements of an aggregate object sequentially without exposing its underlying structure.

6. Strategy Pattern
   - Location: [SortingStrategy.java](SortingStrategy.java), [BubbleSortStrategy.java](BubbleSortStrategy.java), [QuickSortStrategy.java](QuickSortStrategy.java), [SortingContext.java](SortingContext.java)
   - Description: Demonstrates the Strategy pattern, which enables the selection of an algorithm dynamically at runtime by encapsulating interchangeable algorithms in separate classes.

7. Facade Pattern
   - Location: [SubsystemA.java](SubsystemA.java), [SubsystemB.java](SubsystemB.java), [SubsystemC.java](SubsystemC.java), [Facade.java](Facade.java)
   - Description: Demonstrates the Facade pattern, which provides a simplified interface to a complex subsystem, making it easier to use and decoupling clients from the subsystem's implementation details.

8. Adapter Pattern
   - Location: [Adaptee.java](Adaptee.java), [Target.java](Target.java), [Adapter.java](Adapter.java)
   - Description: Demonstrates the Adapter pattern, which allows objects with incompatible interfaces to work together by providing a common interface that clients can use.

## Usage

To run the examples, you can compile each Java file individually and execute the compiled class using the `java` command. For example:

```shell
javac FactoryPattern.java
java FactoryPattern
