public class musteri {
    public void ekle(parcalar parca){
        System.out.println("Ürün Eklendi "+parca.getIsim(""));
    }
    public void sil(parcalar parca){
        System.out.println("Ürün Silindi "+parca.getIsim(""));
    }
    public void guncelle(parcalar parca){
        System.out.println("Ürün Güncellendi "+parca.getIsim(""));
    }
    public void urunKodu(parcalar parca){
        System.out.println("Ürün Kodunuz : "+"_"+parca.getKod("")+"_");
    }
}
