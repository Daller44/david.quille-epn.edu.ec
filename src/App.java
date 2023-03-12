import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

    // Verificar las credenciales
    if ((user.equals("usuario1") && password.equals("contraseña1")) ||
            (user.equals("usuario2") && password.equals("contraseña2"))) {
        JOptionPane.showMessageDialog(this, "Iniciando Seion");
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