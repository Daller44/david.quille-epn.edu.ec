
/**
//      * David Alejandro Quille
//      */
package BusinessLogic;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JFrame {

   


    private JLabel dqUserJLabel, dqPassJLabel;
    private JTextField dquserField;
    private JPasswordField dqpassField;
    private JButton dqemogiButton;
    private int dqLoginT = 0;
    private final int dqMax = 3;

    public login() {
        // Configurar la ventana
        setTitle("Login");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        // Configurar los componentes de la interfaz gráfica
        dqUserJLabel = new JLabel("Usuario:");
        dqPassJLabel = new JLabel("Contraseña:");
        dquserField = new JTextField(20);
        dqpassField = new JPasswordField(20);
        dqemogiButton = new JButton("Inicio");

       

        dqemogiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                daLogin1();
            }
        });

        // Configurar el panel y agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(dqUserJLabel);
        panel.add(dquserField);
        panel.add(dqPassJLabel);
        panel.add(dqpassField);
        panel.add(new JLabel(""));
        panel.add(dqemogiButton);
        panel.setBackground(Color.white);

        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }

    private void daLogin1() {
        String user = dquserField.getText();
        String password = new String(dqpassField.getPassword());
        String encryptedPassword = PasswordEncrypter.encrypt(password); // Encriptar la contraseña ingresada
    
        // Verificar las credenciales en una fuente de datos
        if ((user.equals("david.quille@epn.edu.ec") && encryptedPassword.equals("8425d7aa5a697e5b7f5f7646b42bedca")) ||
                (user.equals("profe") && encryptedPassword.equals("81dc9bdb52d04dc20036dbd8313ed055"))) {
            JOptionPane.showMessageDialog(this, "Iniciando sesión");
            dispose(); // cerrar la ventana
        } else {
            dqLoginT++;
            if (dqLoginT == dqMax) {
                JOptionPane.showMessageDialog(this, "Demasiados intentos fallidos. La aplicación se cerrará.");
                dispose(); // cerrar la ventana
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
    }
}

    
}