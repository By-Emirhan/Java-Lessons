import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<musteri> musteriler = new ArrayList<musteri>();
        musteri emirhan = new musteri(1,"Emirhan","Doğanlardan");
        musteriler.add(new musteri(2, "Ahmet", "Doğanlardan"));
        musteriler.add(new musteri(3, "Halime", "Doğanlardan"));
        musteriler.add(new musteri(4, "Şevval", "Doğanlardan"));

        musteriler.remove(emirhan);
        for (musteri musteri:musteriler){
            System.out.println(musteri.isim);
        }

    }
}