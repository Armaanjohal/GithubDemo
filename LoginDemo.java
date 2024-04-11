import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginDemo extends JFrame implements ActionListener {
    // Components
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginDemo() {
        setTitle("Login Page");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Email Field
        emailField = new JTextField();
        emailField.setBorder(BorderFactory.createTitledBorder("Email"));
        add(emailField);

        // Password Field
        passwordField = new JPasswordField();
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
        add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    // ActionListener for Login Button
    public void actionPerformed(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        // Dummy validation, replace with actual authentication logic
        if (email.equals("user@example.com") && password.equals("password")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Email or Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LoginDemo();
    }
}
