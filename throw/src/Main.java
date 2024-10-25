public class Main {
    public static void main(String[] args) {
        HesapYonetici yonetici=new HesapYonetici();
        System.out.println("Hesaptaki Bakiye : "+yonetici.getParam());
        yonetici.paraYatirma(100);
        System.out.println("Hesaptaki Bakiye : "+yonetici.getParam());
        try {
            yonetici.paraCekme(90);
        }catch (YetersizBakiyeException exception){
            System.out.println(exception.getMesaj());
        }
        System.out.println("Hesaptaki Bakiye : "+yonetici.getParam());
        try {
            yonetici.paraCekme(90);
        }catch (YetersizBakiyeException exception){
            System.out.println(exception.getMesaj());
        }
        System.out.println("Hesaptaki Bakiye : "+yonetici.getParam());
    }
}