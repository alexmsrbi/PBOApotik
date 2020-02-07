import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ViewUpdate extends JFrame {
    ImageIcon icon = new ImageIcon("aptk_pic.jpg");
    JLabel labelpic = new JLabel(icon);
    JLabel judul = new JLabel("PERBARUI DATA OBAT");
    JLabel labelkode = new JLabel("Kode Obat");
    JTextField kode = new JTextField();
    JButton cari = new JButton("Cari Obat");
    JButton edit = new JButton("Edit");
    JLabel labelobat = new JLabel("Nama Obat");
    JLabel labelstock = new JLabel("Stock");
    JTextField obatupdate = new JTextField();
    JTextField stockupdate = new JTextField();
    Object kolomCari[] = {"Kode Obat", "Nama Obat", "Stock"};
    DefaultTableModel defaultTabelModel = new DefaultTableModel(kolomCari, 0);
    JTable tableCari = new JTable(defaultTabelModel);
    JScrollPane scroll = new JScrollPane(tableCari);
    public ViewUpdate(){
        setTitle("APOTIK SUKA MAKMUR");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        add(judul);
        judul.setBounds(150,10,200,20);
        add(labelkode);
        labelkode.setBounds(12,50,70,20);
        add(kode);
        kode.setBounds(100,50,150,20);
        add(cari);
        cari.setBounds(150,130,150,30);
        add(scroll);
        scroll.setBounds(12, 180, 400, 50);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(labelobat);
        labelobat.setBounds(12,250,70,20);
        add(obatupdate);
        obatupdate.setBounds(100,250,150,20);
        add(labelstock);
        labelstock.setBounds(12,280,70,20);
        add(stockupdate);
        stockupdate.setBounds(100,280,150,20);
        add(edit);
        edit.setBounds(150,320,150,30);


        add(labelpic);
        labelpic.setBounds(0,0,500,450);
    }
}

