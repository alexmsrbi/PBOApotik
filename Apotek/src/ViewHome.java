import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewHome extends JFrame {
    ImageIcon icon = new ImageIcon("aptk_pic.jpg");
    JLabel labelpic = new JLabel(icon);
    JButton beli = new JButton("Pembelian");
    JButton admin = new JButton("Admin");
    Font fontJudul = new Font("Times New Roman",Font.BOLD,25);//Setting Font
    JLabel judul = new JLabel("SELAMAT DATANG DI APOTEK KAMI");
        public  ViewHome(){
            setSize(500,500);
            setVisible(true);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            add(judul);
            judul.setFont(fontJudul);
            judul.setBounds(16,20,500,50);
            add(beli);
            beli.setBounds(150,150,100,70);
            beli.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MVC_Beli mvc_beli = new MVC_Beli();
                }
            });
            add(admin);
            admin.setBounds(250,150,100,70);
            admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewLogin tampil = new ViewLogin();
            }
        });
            add(labelpic);
            labelpic.setBounds(0,0,500,450);
    }

    public static void main(String[] args) { JFrame f = new JFrame();
    ViewHome tampil = new ViewHome();
    }
}
