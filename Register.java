import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JCheckBox showPasswordCheckbox;
    private JButton registerButton;

    public Register() {
        setTitle("Aplikasi Pembayaran Pajak");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Title label
        JLabel titleLabel = new JLabel("APLIKASI PEMBAYARAN PAJAK", JLabel.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(10, 0, 10, 0);
        panel.add(titleLabel, gbc);

        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(createLabel("Nama:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        nameField = new JTextField();
        setFixedSize(nameField, 200, 25);
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(createLabel("Email:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        emailField = new JTextField();
        setFixedSize(emailField, 200, 25);
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(createLabel("Password:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        passwordField = new JPasswordField();
        setFixedSize(passwordField, 200, 25);
        panel.add(passwordField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        showPasswordCheckbox = new JCheckBox("Show Password");
        panel.add(showPasswordCheckbox, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        registerButton = new JButton("Register");
        setFixedSize(registerButton, 200, 25);
        panel.add(registerButton, gbc);

        add(panel);

        showPasswordCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox cb = (JCheckBox) e.getSource();
                if (cb.isSelected()) {
                    passwordField.setEchoChar((char) 0); // Show password
                } else {
                    passwordField.setEchoChar('\u2022'); // Hide password
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    validateFields();
                    new Halaman_Awal().setVisible(true);
                    dispose();
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(Register.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        setFixedSize(label, 80, 25);
        return label;
    }

    private void setFixedSize(JComponent component, int width, int height) {
        Dimension dimension = new Dimension(width, height);
        component.setPreferredSize(dimension);
        component.setMinimumSize(dimension);
        component.setMaximumSize(dimension);
    }

    private void validateFields() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong.");
        }
        if (email.isEmpty()) {
            throw new IllegalArgumentException("Email tidak boleh kosong.");
        }
        if (!email.endsWith("@gmail.com")) {
            throw new IllegalArgumentException("Email harus mengandung '@gmail.com'.");
        }
        if (password.isEmpty()) {
            throw new IllegalArgumentException("Password tidak boleh kosong.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
}

