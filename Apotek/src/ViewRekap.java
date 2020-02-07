import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewRekap extends JFrame {
    ImageIcon icon = new ImageIcon("aptk_pic.jpg");
    JLabel labelpic = new JLabel(icon);
    JLabel labelJudul = new JLabel("DAFTAR PEMBELI");
    Font fontJudul = new Font("Times New Roman", Font.BOLD, 36);
    Font fontTabel = new Font("Times New Roman", Font.CENTER_BASELINE, 17);
    Object kolom[] = {"Kode Pembelian", "Tanggal pembelian", "Nama Obat","Nama Pembeli","Stok yang dibeli","Harga"};
    DefaultTableModel defaultTabelModel = new DefaultTableModel(kolom, 0);
    JTable table = new JTable(defaultTabelModel);
    JScrollPane scroll = new JScrollPane(table);
    public ViewRekap() {
        setTitle("APOTEK SUKA MAJU");
        setSize(700, 500);
        setLayout(null);
        setVisible(true);
        add(labelJudul);
        labelJudul.setFont(fontJudul);
        labelJudul.setBounds(120, 10, 500, 50);
        add(scroll);
        scroll.setFont(fontTabel);
        scroll.setBounds(30, 70, 600, 300);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(labelpic);
        labelpic.setBounds(0,0,680,450);
    }
}
