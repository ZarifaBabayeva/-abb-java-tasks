package Inheritance;
public class Isci {
    private String name;

    public Isci(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void introduce() {
        System.out.println("Salam, mən şirkət əməkdaşıyam. Adım: " + name);
    }
}