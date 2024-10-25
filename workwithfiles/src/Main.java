import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //dosyaCreate();
        //dosyaBilgi();
        dosyaYazma();
        dosyaOku();
    }
    public static void dosyaCreate(){
        File file=new File("D:\\java_projects\\Beginer\\dosyalar\\ogrenci.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu.");
            }else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void dosyaBilgi(){
        File file=new File("D:\\java_projects\\Beginer\\dosyalar\\ogrenci.txt");
        if (file.exists()){
            System.out.println("Dosya adı : "+file.getName());
            System.out.println("Dosya yolu : "+file.getAbsolutePath());
            System.out.println("Dosya okunurabilir mi? : "+file.canRead());
            System.out.println("Dosya yazılabilir mi? : "+file.canWrite());
            System.out.println("Dosya boyutu : "+file.length());
        }
    }
    public static void dosyaOku(){
        File file=new File("D:\\java_projects\\Beginer\\dosyalar\\ogrenci.txt");
        try {
            Scanner oku=new Scanner(file);
            while (oku.hasNextLine()){
                String line = oku.nextLine();
                System.out.println(line);
            }
            oku.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void dosyaYazma(){
        try {
            BufferedWriter yazma=new BufferedWriter(new FileWriter("D:\\java_projects\\Beginer\\dosyalar\\ogrenci.txt",true));
            yazma.newLine();
            yazma.write("Jhon");
            System.out.println("Dosya yazıldı.");
            yazma.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}