public class Main {
    public static void main(String[] args) {
        CustomerManager kontrol =new CustomerManager();
        kontrol.veriYonetim=new MySqlDatabaseManager();
        kontrol.getCustomer();
    }
}