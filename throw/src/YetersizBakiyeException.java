public class YetersizBakiyeException extends Exception{
    String mesaj;
    public YetersizBakiyeException(String mesaj){
        this.mesaj=mesaj;
    }
    public String getMesaj(){
        return this.mesaj;
    }
}
