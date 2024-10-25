public class Main {
    public static void main(String[] args) {

        try {//try kodu dener...
            int[] sayilar =new int[]{1,2,3};
            System.out.println(sayilar[0]);
        }catch (ArrayIndexOutOfBoundsException exception){//catch koddaki hatayı yakalar...
            System.out.println("İndexler arası hata oluştu : "+exception);
        }catch (Exception exception){
            System.out.println("hata oluştu : "+exception);
        }finally {//finally her türlü işlemde devam eder...
            System.out.println("Devam ediyor...");
        }
    }
}