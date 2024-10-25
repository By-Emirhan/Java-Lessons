import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen tutar giriniz : ");
        double tutar = girdi.nextDouble(); //Girilen değeri double değer olan tutara eşitledim..
        System.out.println("###################################");
        //Çoklu array yani dizi kullanarak dahil edebiliyorum...
        BaseKrediManager[] kredis = new BaseKrediManager[]{new TarimKrediManager(), new OgretmenKrediManager(),new OgrenciKrediManager()};
        for (BaseKrediManager kredi:kredis){
            System.out.println(kredi.sonuc("")+kredi.hesapla(tutar));
        }
        System.out.println("###################################");
    }
}