import javax.swing.*;
import java.sql.*;

public class ModelPembelian {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/projectpbo";
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;
    ResultSet result;
    public ModelPembelian(){
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void insertPembeli(String kodeStruk, String kodeObat, String nama, String tanggal, int stock) throws SQLException {
        int harga;
        statement = koneksi.createStatement();
        String query1 = "SELECT `harga` FROM `obat` WHERE `kode_obat`='"+kodeObat+"'";
        result = statement.executeQuery(query1);
        result.next();
        int hargaobat = result.getInt("harga");
        int hargafinal = hargaobat*stock;
        String query = "INSERT INTO `pembelian` (`kode_struck`,`kode_obat`,`nama_pembeli`,`tanggal_beli`,`stok`,`Harga`) VALUES('"+kodeStruk+"','"+kodeObat+"','"+nama+"','"+tanggal+"','"+stock+"','"+hargafinal+"')";
        statement.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "PEMBELIAN SUKSES");
    }
    public int getRekap() throws SQLException {
        try {
            int banyakData=0;
            statement = koneksi.createStatement();
            String query = "SELECT `pembelian`.`kode_struck`, `obat`.`nama_obat`, `pembelian`.`nama_pembeli`, `pembelian`.`tanggal_beli`, `pembelian`.`stok` FROM `pembelian`  INNER JOIN `obat`  ON `pembelian`.`kode_obat` = `obat`.`kode_obat`";
            result = statement.executeQuery(query);
            while (result.next()){
                banyakData++;
            }

            return banyakData;
        } catch (SQLException e) {
            System.out.println("GAGAL!!!!!");
            e.printStackTrace();
        }
        finally{
            if(statement != null) {
                statement.close();
            }
        }
        return 0;
    }
    public String[][] dataRekap() throws SQLException {
        int indexbaris=0;
        String viewRekap[][]= new String[getRekap()][6];
        try {
            statement = koneksi.createStatement();
            String query = "SELECT `pembelian`.`kode_struck`, `obat`.`nama_obat`, `pembelian`.`nama_pembeli`, `pembelian`.`tanggal_beli`, `pembelian`.`stok`, `pembelian`.`harga` FROM `pembelian`  INNER JOIN `obat`  ON `pembelian`.`kode_obat` = `obat`.`kode_obat`";
            result = statement.executeQuery(query);

            while (result.next()){
                viewRekap[indexbaris][0] = result.getString("kode_struck");
                viewRekap[indexbaris][1] = result.getString("tanggal_beli");
                viewRekap[indexbaris][2] = result.getString("nama_obat");
                viewRekap[indexbaris][3] = result.getString("nama_pembeli");
                viewRekap[indexbaris][4] = result.getString("stok");
                viewRekap[indexbaris][5] = result.getString("harga");
                indexbaris++;
            }
            return viewRekap;
        } catch (SQLException e) {
            System.out.println("GAGAL!!!!!");
            e.printStackTrace();
        }
        return null;
    }
    public void updateBeli(int stockBeli, String kode){
        String query = "UPDATE `obat` SET `stock`= `stock` - '"+stockBeli+"' WHERE `kode_obat` = '"+kode+"' ";
        try {
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
