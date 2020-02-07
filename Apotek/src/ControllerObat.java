import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ControllerObat {
    ModelObat modelObat;
    ViewObat viewObat;


    public ControllerObat(ModelObat modelObat, ViewObat viewObat) {
        this.modelObat = modelObat;
        this.viewObat = viewObat;


        viewObat.tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (viewObat.kode.getText().equals("") || viewObat.obat.getText().equals("") || viewObat.stock.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Masih Ada Kolom Kosong");
                } else {
                    String kodeObat = viewObat.kode.getText();
                    String namaObat = viewObat.obat.getText();
                    String Stock = viewObat.stock.getText();
                    String harga = viewObat.harga.getText();
                    modelObat.insertData(kodeObat, namaObat, Stock, harga);
                    viewObat.kode.setText("");
                    viewObat.obat.setText("");
                    viewObat.stock.setText("");
                    viewObat.harga.setText("");
                }
            }
        });
        viewObat.lihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MVC_View view = new MVC_View();
            }
        });

            viewObat.ubah.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MVC__Update mvc__update= new MVC__Update();
                }
            });

            viewObat.hapus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MVC_Hapus mvc_hapus = new MVC_Hapus();
                }
            });

    }
}
