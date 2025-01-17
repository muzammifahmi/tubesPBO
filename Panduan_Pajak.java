import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panduan_Pajak extends JFrame {
    public Panduan_Pajak() {
        setTitle("Aplikasi Pembayaran Pajak - Panduan Pajak");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new BorderLayout());
        
        JTextArea panduanArea = new JTextArea();
        panduanArea.setText("Panduan Pajak:\n..."); // Tambahkan panduan yang sebenarnya di sini
        panel.add(new JScrollPane(panduanArea), BorderLayout.CENTER);
        
        JButton kembaliButton = new JButton("Kembali");
        panel.add(kembaliButton, BorderLayout.SOUTH);
        
        add(panel);
        
        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Halaman_Awal().setVisible(true);
                dispose();
            }
        });
    }
}
