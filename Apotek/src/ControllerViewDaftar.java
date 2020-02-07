import javax.swing.*;
import java.sql.SQLException;

public class ControllerViewDaftar {
    ModelObat modelObat;
    ViewDaftarObat viewDaftarObat;

    public ControllerViewDaftar(ModelObat modelObat, ViewDaftarObat viewDaftarObat) {
        this.modelObat = modelObat;
        this.viewDaftarObat = viewDaftarObat;
        try {
            if (modelObat.getDataObat() != 0) {
                viewTable();
            } else {
                JOptionPane.showMessageDialog(null, "DATA MASIH KOSONG");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void viewTable(){
        String dataMahasiswa[][] = modelObat.bacaObat();
        viewDaftarObat.table.setModel((new JTable(dataMahasiswa, viewDaftarObat.kolom)).getModel());
    }


}
