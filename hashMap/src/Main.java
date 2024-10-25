import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk=new HashMap<String, String>();
        sozluk.put("book","kitap");
        sozluk.put("give","vermek");
        sozluk.put("table","masa");
        sozluk.put("chair","sandalye");

        for (String esya:sozluk.keySet()){
            System.out.println("Eleman-"+esya+" Değer-"+sozluk.get(esya));
        }
    }
}