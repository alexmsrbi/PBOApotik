import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ControllerBeli {
    ModelPembelian modelPembelian;
    ViewBeli viewBeli;

    public ControllerBeli(ModelPembelian modelPembelian, ViewBeli viewBeli) {
        this.modelPembelian = modelPembelian;
        this.viewBeli = viewBeli;
        viewBeli.buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                String idStruk = viewBeli.kodeStruck.getText();
                String kodeObat = viewBeli.kodeObat.getText();
                String nama = viewBeli.pelanggan.getText();
                String tanggal = viewBeli.tgl.getText();
                int stok =Integer.parseInt(viewBeli.stock.getText());
                modelPembelian.insertPembeli(idStruk,kodeObat,nama,tanggal,stok);
                modelPembelian.updateBeli(stok,kodeObat);

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        viewBeli.rekap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MVC_Rekap rekap = new MVC_Rekap();
            }
        });
    }
}
