public class Main {
    public static void main(String[] args) {
        baselogger[] loggers = {new filelogger(), new databaselogger(), new emaillogger(), new consollogger()};
        musteriYonetimi yonet = new musteriYonetimi(new baselogger());
        yonet.ekle();
        for (baselogger logger:loggers){
            logger.Log("Alındı");
        }
    }
}