import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private String dbUrl = "jdbc:sqlserver://DESKTOP-8MT27RE;Database=java;trustServerCertificate=true";
    private String user = "sa";
    private String pass = "emir1453";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, user, pass);
    }

    public void hataEkrani(SQLException exception) {
        System.out.println("Hata : " + exception.getMessage());
        System.out.println("Hata Kodu : " + exception.getErrorCode());

        if (exception.getErrorCode()==2627){//Burda exception hata kodu 2627'ye eşitse verilecek hatayı yazdır.
            System.out.println("Bu veri zaten mevcut. Ancak güncelleyebilirsiniz");
        }
    }
}
