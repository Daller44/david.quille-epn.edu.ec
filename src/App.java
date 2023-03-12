import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class App extends JFrame {

    public static void main(String[] args) {
        new App();
    }


    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton emojiButton;
    private int loginAttempts = 0;
    private final int MAX_LOGIN_ATTEMPTS = 3;

    public App() {
        // Configurar la ventana
        setTitle("Login");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        // Configurar los componentes de la interfaz gráfica
        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contraseña:");
        userField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emojiButton = new JButton("Inicio");

       

        emojiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        // Configurar el panel y agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(emojiButton);
        panel.setBackground(Color.white);

        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login() {
        String user = userField.getText();
        String password = new String(passwordField.getPassword());
    
        // Encriptar la contraseña por md5
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] hash = md.digest();
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            password = hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    
        // Verificar las credenciales encriptadas
        if ((user.equals("david.quille@epn.edu.ec") && password.equals("9f9d51bc70ef21ca5c14f307980a29d8")) ||
                (user.equals("profe") && password.equals("81dc9bdb52d04dc20036dbd8313ed055"))) {
            JOptionPane.showMessageDialog(this, "Iniciando Sesión");
            dispose(); // cerrar la ventana
        } else {
            loginAttempts++;
            if (loginAttempts == MAX_LOGIN_ATTEMPTS) {
                JOptionPane.showMessageDialog(this, "Demasiados intentos fallidos. La aplicación se cerrará.");
                dispose(); // cerrar la ventana
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        }
    }
    
}