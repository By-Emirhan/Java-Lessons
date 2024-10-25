import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        select();
    }

    //Listelemek için
    public static void select() throws SQLException {
        Connection baglanti = null;
        DBHelper dbHelper = new DBHelper();
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<kisi> kisiler=new ArrayList<kisi>();
        try {
            baglanti = dbHelper.getConnection();
            System.out.println("Bağlantı kuruldu...");
            statement = baglanti.createStatement();
            resultSet = statement.executeQuery("select * from kisi");
            while (resultSet.next()){
                System.out.println(resultSet.getString("isim")+" "+resultSet.getString("soyisim"));
            }
        } catch (SQLException exception) {
            dbHelper.hataEkrani(exception);
        } finally {
            if (baglanti != null) {
                baglanti.close();
            }
        }
    }

    //Veri eklemek için
    public static void insert() throws SQLException {
        Connection baglanti = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            baglanti = dbHelper.getConnection();
            System.out.println("Bağlantı kuruldu...");
            String sql = "insert into kisi(id,isim,soyisim) values(?,?,?)";
            statement = baglanti.prepareStatement(sql);
            statement.setInt(1,6);
            statement.setString(2,"Mustafa");
            statement.setString(3,"Doğanlardan");
            int i = statement.executeUpdate();
            System.out.println("Kayıt eklendi");
        }
        catch (SQLException exception) {
            dbHelper.hataEkrani(exception);
        }
        finally {
            if (baglanti!=null){
                baglanti.close();
            }
        }
    }
    //veri güncelleme
    public static void update() throws SQLException {
        Connection baglanti = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            baglanti = dbHelper.getConnection();
            System.out.println("Bağlantı kuruldu...");
            String sql = "update kisi set isim='Mustafa',soyisim='Doğanlardan' where id=?";
            statement = baglanti.prepareStatement(sql);
            statement.setInt(1,6);
            int i = statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
        }
        catch (SQLException exception) {
            dbHelper.hataEkrani(exception);
        }
        finally {
            if (baglanti!=null){
                baglanti.close();
            }
        }
    }
    public static void delete() throws SQLException {
        Connection baglanti = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            baglanti = dbHelper.getConnection();
            System.out.println("Bağlantı kuruldu...");
            String sql = "delete from kisi where id=?";
            statement = baglanti.prepareStatement(sql);
            statement.setInt(1,6);
            int i = statement.executeUpdate();
            System.out.println("Kayıt silindi.");
        }
        catch (SQLException exception) {
            dbHelper.hataEkrani(exception);
        }
        finally {
            if (baglanti!=null){
                baglanti.close();
            }
        }
    }
}
