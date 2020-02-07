import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.SQLException;

public class ViewObat extends JFrame {
    ImageIcon icon = new ImageIcon("aptk_pic.jpg");
    JLabel labelpic = new JLabel(icon);
    JLabel judul = new JLabel("PENAMBAHAN DATA OBAT");
    JLabel labelobat = new JLabel("Nama Obat ");
    JLabel labelkode = new JLabel("Kode Obat ");
    JLabel labelstock = new JLabel("Stock");
    JLabel labelharga = new JLabel("Harga");
    JTextField kode = new JTextField();
    JTextField obat = new JTextField();
    JTextField stock = new JTextField();
    JTextField harga = new JTextField();
    JButton tambah = new JButton("Tambah Obat");
    JButton lihat = new JButton("Daftar Obat");
    JButton ubah = new JButton("Ubah Data");
    JButton hapus = new JButton("Hapus Data");
    public ViewObat(){
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
        add(labelobat);
        labelobat.setBounds(12,80,70,20);
        add(obat);
        obat.setBounds(100,80,150,20);
        add(labelstock);
        labelstock.setBounds(12,110,70,20);
        add(stock);
        stock.setBounds(100,110,150,20);
        add(labelharga);
        labelharga.setBounds(12,140,70,20);
        add(harga);
        harga.setBounds(100,140,150,20);

        add(tambah);
        tambah.setBounds(12,190,110,30);

        add(lihat);
        lihat.setBounds(132,190,105,30);

        add(ubah);
        ubah.setBounds(248,190,105,30);

        add(hapus);
        hapus.setBounds(364,190,105,30);

        add(labelpic);
        labelpic.setBounds(0,0,500,450);
    }

}
