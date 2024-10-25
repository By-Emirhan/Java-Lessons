public class Main {
    public static void main(String[] args) {

        parcalar parca = new parcalar();
        parca.setId(1);
        parca.setIsim("Leptop");

        musteri client = new musteri();
        client.ekle(parca);
        client.sil(parca);
        client.guncelle(parca);
        client.urunKodu(parca);
    }
}