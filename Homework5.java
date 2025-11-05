public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}

class Computer {
    String cpu = "Core i7";
    String memory = "32GB";
    String hd = "2TB";
    String color = "White";
    String power = "700W";

    void turnOn() {
        System.out.println("Turning on the computer.");
    }

    void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hd);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class Monitor {
    String monitorSize = "32 inch";
    String color = "black";
    String power = "45W";

    void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + monitorSize);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class PersonalComputer {
    Computer computer;
    Monitor monitor;

    PersonalComputer() {
        computer = new Computer();
        monitor = new Monitor();
    }

    void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}