public class HesapYonetici {
    private double param;
    public void paraYatirma(double para){
        param = getParam() + para;
    }
    public void paraCekme(double para) throws YetersizBakiyeException {
        if (param>=para){
            param = getParam() - para;
        }else {
            throw new YetersizBakiyeException("Yetersiz bakiye...");
        }
    }

    public double getParam() {
        return param;
    }
}
