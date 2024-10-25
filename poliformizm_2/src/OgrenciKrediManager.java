public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }
    public String sonuc(String mesaj){
        return mesaj="Öğrenci Kredisi için : ";
    }
}