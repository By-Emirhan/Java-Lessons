public class musteriYonetimi {
    private baselogger logger;

    public musteriYonetimi(baselogger logger){
        this.logger=logger;
    }

    public void ekle(){
        System.out.println("Müşteri Eklendi. ");
        this.logger.Log("Alındı.");
    }
}