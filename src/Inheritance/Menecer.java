package Inheritance;
public class Menecer extends Isci {

    public Menecer(String name) {
        super(name);
    }

    public void organizeMeeting() {
        System.out.println("Menecer " + getName() + " hal-hazırda komanda üçün iclas təşkil edir.");
    }
}