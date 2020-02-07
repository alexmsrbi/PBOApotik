import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewLogin extends JFrame {
    public ViewLogin() {
        ImageIcon icon = new ImageIcon("aptk_pic.jpg");
        JLabel labelpic = new JLabel(icon);
        JLabel judul = new JLabel("Sistem Informasi Apotek");
        JLabel username = new JLabel("Username");
        JLabel password = new JLabel("Password");
        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();
        JButton login = new JButton("Log in");
        Font fontJudul = new Font("Burnstown Dam",Font.BOLD,14);
        Font fontMenu = new Font("Times New Roman",Font.BOLD,24);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        add(judul);
        judul.setFont(fontJudul);
        judul.setBounds(150, 10, 200, 20);
        add(username);
        username.setBounds(12, 50, 70, 20);
        add(user);
        user.setBounds(100, 50, 150, 20);
        add(password);
        password.setBounds(12, 80, 70, 20);
        add(pass);
        pass.setBounds(100, 80, 150, 20);
        add(login);
        login.setBounds(150, 150, 150, 30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String guser = user.getText();
                String gpass = pass.getText();
                ControllerLogin baru = new ControllerLogin();
                baru.login(guser, gpass);
                dispose();
            }
        });
        add(labelpic);
        labelpic.setBounds(0,0,500,450);
    }

}
