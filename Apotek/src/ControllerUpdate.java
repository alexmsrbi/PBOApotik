import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerUpdate {
    ModelObat modelObat;
    ViewUpdate viewUpdate;

    public ControllerUpdate(ModelObat modelObat, ViewUpdate viewUpdate) {
        this.modelObat = modelObat;
        this.viewUpdate = viewUpdate;
        viewUpdate.cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (viewUpdate.kode.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Kode Kosong");
                }
                else {
                    String kodeCari = viewUpdate.kode.getText();
                    viewTableUpdate(kodeCari);
                    viewUpdate.edit.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String namaObat = viewUpdate.obatupdate.getText();
                            String stockObat = viewUpdate.stockupdate.getText();
                            modelObat.updateData(kodeCari,namaObat,stockObat);
                            viewUpdate.obatupdate.setText("");
                            viewUpdate.stockupdate.setText("");
                        }
                    });

                }

            }
        });
    }
    private void viewTableUpdate(String searchCode){
        String dataMahasiswa[][] = modelObat.cariData(searchCode);
        viewUpdate.tableCari.setModel((new JTable(dataMahasiswa, viewUpdate.kolomCari)).getModel());
    }
}
