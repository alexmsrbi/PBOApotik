import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerHapus {
    ModelObat modelObat;
    ViewHapus viewHapus;

    public ControllerHapus(ModelObat modelObat, ViewHapus viewHapus) {
        this.modelObat = modelObat;
        this.viewHapus = viewHapus;
        viewHapus.cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (viewHapus.kode.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Kode Kosong");
                }
                else {
                    String kodeCari = viewHapus.kode.getText();
                    viewTableHapus(kodeCari);
                    viewHapus.kode.setText("");
                    viewHapus.hapus.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            modelObat.deleteData(kodeCari);
                        }
                    });
                }
            }
        });
    }
    private void viewTableHapus(String searchCode){
        String dataMahasiswa[][] = modelObat.cariData(searchCode);
        viewHapus.tableCari.setModel((new JTable(dataMahasiswa, viewHapus.kolomCari)).getModel());
    }
}
