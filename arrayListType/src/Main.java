import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler= new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Adıyaman");
        sehirler.add("Zonguldak");
        sehirler.add("Sanlıurfa");

        sehirler.remove(0);
        Collections.sort(sehirler);
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}