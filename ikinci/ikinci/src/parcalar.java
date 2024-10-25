public class parcalar {

    private String isim;
    private int id;
    private double fiyat;
    private String kod;

    public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim(String isim) {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKod(String kod) {
        return this.isim.substring(0, 1) + id + this.isim.substring(5);
    }
}
