public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Product product=new Product();
        product.price=200;
        product.name="Emirhan";
        productManager.ekle(product);


    }
}