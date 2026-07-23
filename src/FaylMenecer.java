public class FaylMenecer implements Yuklene, Endirile {

    @Override
    public void yukle(String faylAdi) {
        System.out.println(faylAdi + " serverə yüklənir");
    }

    @Override
    public void endir(String faylAdi) {
        System.out.println(faylAdi + " serverdən endirilir");
    }
}
