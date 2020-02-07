import javax.swing.*;

public class ControllerLogin {
    public void login(String user, String pass) {
        if ((user.equals("admin") && pass.equals("pass"))) {
            JOptionPane.showMessageDialog(null, "Login Berhasil");
            MVC_Obat mvc = new MVC_Obat();
        } else if ((!user.equals("admin") && pass.equals("pass"))) {
            JOptionPane.showMessageDialog(null, "Username Salah");
        } else if ((user.equals("admin") && !pass.equals("pass"))) {
            JOptionPane.showMessageDialog(null, "Password Salah");
        } else if ((!user.equals("admin") && !pass.equals("pass"))) {
            JOptionPane.showMessageDialog(null, "Username dan Password Salah");
        }
    }
}
