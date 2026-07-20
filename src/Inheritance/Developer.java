package Inheritance;
public class Developer extends Isci {

    public Developer(String name) {
        super(name);
    }

    public void writeCode() {
        System.out.println("Developer " + getName() + " hal-hazırda Java-da yeni funksionallıq yazır.");
    }
}
