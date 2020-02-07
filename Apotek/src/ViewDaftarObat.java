import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

public class ViewDaftarObat extends JFrame {
    ImageIcon dafbek = new ImageIcon("daf_apt.jpg");
    ImageIcon icon = new ImageIcon("aptk_pic.jpg");
    JLabel labelpic = new JLabel(icon);
    JLabel labelJudul = new JLabel("DAFTAR OBAT YANG ADA");
    Font fontJudul = new Font("Times New Roman", Font.BOLD, 36);
    Font fontTabel = new Font("Times New Roman", Font.CENTER_BASELINE, 17);
    Object kolom[] = {"Kode Obat", "Nama Obat", "Stock","Harga"};
    DefaultTableModel defaultTabelModel = new DefaultTableModel(kolom, 0);
    JTable table = new JTable(defaultTabelModel);
    JScrollPane scroll = new JScrollPane(table);
    public ViewDaftarObat()  {
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
