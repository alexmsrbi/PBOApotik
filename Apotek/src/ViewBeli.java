import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ViewBeli extends JFrame {
    ImageIcon icon = new ImageIcon("aptk_pic.jpg");
    JLabel labelpic = new JLabel(icon);
    JLabel judul = new JLabel("PEMBELIAN OBAT");
    JLabel labelobat = new JLabel("Kode Struk");
    JLabel labelkode = new JLabel("Kode Obat");
    JLabel labelpelanggan = new JLabel("Nama Pelanggan");
    JLabel labeltanggal = new JLabel("Tanggal Pembelian");
    JLabel labelstok = new JLabel("Stock");
    JTextField stock = new JTextField();
    JTextField kodeStruck = new JTextField();
    JTextField kodeObat = new JTextField();
    JTextField pelanggan = new JTextField();
    DateFormat formatTanggal = new SimpleDateFormat("dd/MM/yyyy");
    DateFormatter tanggal = new DateFormatter(formatTanggal);
    JFormattedTextField tgl = new JFormattedTextField(tanggal);
    JButton buy = new JButton("Beli");
    JButton rekap = new JButton("Rekap");
    public ViewBeli(){
        setTitle("APOTIK SUKA MAKMUR");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        add(judul);
        judul.setBounds(150,10,200,20);
        add(labelobat);
        labelobat.setBounds(12,40,70,20);
        add(kodeStruck);
        kodeStruck.setBounds(150,40,150,20);
        add(labelkode);
        labelkode.setBounds(12,70,70,20);
        add(kodeObat);
        kodeObat.setBounds(150,70,150,20);
        add(labelpelanggan);
        labelpelanggan.setBounds(12,110,100,20);
        add(pelanggan);
        pelanggan.setBounds(150,110,150,20);
        add(labeltanggal);
        labeltanggal.setBounds(12,140,150,20);
        add(tgl);
        tgl.setBounds(150,140,150,20);
        tgl.setValue(new Date());
        add(labelstok);
        labelstok.setBounds(12,180,100,20);
        add(stock);
        stock.setBounds(150,180,150,20);
        add(buy);
        buy.setBounds(150,220,100,20);
        add(rekap);
        rekap.setBounds(250,220,100,20);

        add(labelpic);
        labelpic.setBounds(0,0,500,450);
    }
}
