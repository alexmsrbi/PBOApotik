import javax.swing.*;
import java.sql.*;

public class ModelObat {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/projectpbo";
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;
    ResultSet result;

    public ModelObat() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void insertData(String kode, String nama, String stock, String harga) {
       String query = "INSERT INTO `obat` (`kode_obat`,`nama_obat`,`stock`,`harga`) VALUES('" +kode+ "','" +nama+ "','" +stock+ "','"+harga+"')";
        try {
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "OBAT BARU TELAH DITAMBAHKAN");
    }

    public int getDataObat() throws SQLException {
        try {
            int banyakData = 0;
            statement = koneksi.createStatement();
            String query = "SELECT * FROM `obat`";
            result = statement.executeQuery(query);
            while (result.next()) {
                banyakData++;
            }
            return banyakData;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"OBAT TIDAK  BISA DI GET");
            e.printStackTrace();
            return 0;
        }

    }

    public String[][] bacaObat() {
        try {
            int indexbaris = 0;
            String view[][] = new String[getDataObat()][4];
            String query = "SELECT * FROM `obat`";
            statement = koneksi.createStatement();
            result = statement.executeQuery(query);
            while (result.next()) {
                view[indexbaris][0] = result.getString("kode_obat");
                view[indexbaris][1] = result.getString("nama_obat");
                view[indexbaris][2] = result.getString("stock");
                view[indexbaris][3] = result.getString("harga");
                indexbaris++;
            }
            return view;
        } catch (SQLException e) {
            System.out.println("DATA OBAT TIDAK TERBACA");
            e.printStackTrace();
            return null;
        }
    }

    public void updateData(String uKode, String uNama, String uStock) {
        try {
            String query1 = "UPDATE `obat` SET `nama_obat`='" + uNama + "', `stock`='" + uStock + "' WHERE `kode_obat`= '" + uKode + "' ";
            statement = koneksi.createStatement();
            statement.executeUpdate(query1);
            JOptionPane.showMessageDialog(null, "EDIT DATA SUKSES");
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
        }

    }

    public void deleteData(String kode) {
        try {
            String query1 = "delete from `obat` where `kode_obat`='"+kode+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query1);
            JOptionPane.showMessageDialog(null, "HAPUS DATA SUKSES");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Gagal");
        }
    }

    public int getCariObat(String kodeCari) {
        try {
            int banyakData = 0;
            statement = koneksi.createStatement();
            String query = "SELECT * FROM `obat` WHERE `kode_obat`='" + kodeCari + "'";
            result = statement.executeQuery(query);

            while (result.next()) {
                banyakData++;
            }

            return banyakData;
        } catch (SQLException e) {
            System.out.println("DATA TIDAK BISA DICARI !");
            e.printStackTrace();
        } finally {
            if (statement != null) {
//                statement.close();
            }
        }
        return 0;

    }

    public String[][] cariData(String searchCode) {
        int indexbaris = 0;
        String viewCari[][] = new String[getCariObat(searchCode)][3];
        try {
            statement = koneksi.createStatement();
            String query2 = "SELECT * FROM `obat` WHERE `kode_obat`='" + searchCode + "'";
            result = statement.executeQuery(query2);

            while (result.next()) {
                viewCari[indexbaris][0] = result.getString("kode_obat");
                viewCari[indexbaris][1] = result.getString("nama_obat");
                viewCari[indexbaris][2] = result.getString("stock");
                indexbaris++;
            }
            return viewCari;
        } catch (SQLException e) {
            System.out.println("CARI DATA TIDAK DIDAPATKAN !");
            e.printStackTrace();
        }
        return null;
    }
}