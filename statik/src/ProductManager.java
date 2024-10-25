public class ProductManager {
    static {
        System.out.println("Statik Bölüm Çalıştı");
    }
    public void ekle(Product product){
        ProductValidator productValidator=new ProductValidator();
        if (productValidator.isValid(product)){
            System.out.println("Eklendi");
        }else {
            System.out.println("Eklenmedi");
        }
    }
}
