package Structural.Facade;

// Subsystem classes

// SubsystemA.java
class SubsystemA {
    void operationA() {
        System.out.println("SubsystemA: Operation A");
    }
}

// SubsystemB.java
class SubsystemB {
    void operationB() {
        System.out.println("SubsystemB: Operation B");
    }
}

// SubsystemC.java
class SubsystemC {
    void operationC() {
        System.out.println("SubsystemC: Operation C");
    }
}

// Facade.java
class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    void operation() {
        System.out.println("Facade: Operation");
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}

// Main.java - Usage Example
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
