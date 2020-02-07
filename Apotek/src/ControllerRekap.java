import javax.swing.*;
        import java.sql.SQLException;

public class ControllerRekap {
    ModelPembelian modelPembelian;
    ViewRekap viewRekap;

    public ControllerRekap(ModelPembelian modelPembelian, ViewRekap viewRekap) {
        this.modelPembelian = modelPembelian;
        this.viewRekap = viewRekap;
        viewTableRekap();
    }
    public void viewTableRekap(){
        try {
            String dataMahasiswa[][] = modelPembelian.dataRekap();
            viewRekap.table.setModel((new JTable(dataMahasiswa, viewRekap.kolom)).getModel());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
