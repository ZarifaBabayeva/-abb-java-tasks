public abstract class Sened {
    private String baslik;

    public Sened(String baslik) {
        this.baslik = baslik;
        System.out.println("Sənəd (Ata) konstruktoru işə düşdü: " + baslik);
    }

    public abstract void capEt();

    public String getBaslik() {
        return baslik;
    }
}
