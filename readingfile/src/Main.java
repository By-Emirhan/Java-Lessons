import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int toplam = 0;
        try {
            reader = new BufferedReader(new FileReader("D:\\java_projects\\Beginer\\readingfile\\src\\sayilar.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                toplam += Integer.valueOf(line);
            }
            System.out.println("Toplam : " + toplam);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Sayısal hata : "+e);
        } finally {
            try {
                reader.close();
            } catch (Exception exception) {

            }

        }
    }
}