import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Riwayat_Pembayaran extends JFrame {
    public Riwayat_Pembayaran() {
        setTitle("Aplikasi Pembayaran Pajak - Riwayat Pembayaran");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new BorderLayout());
        
        JTextArea riwayatArea = new JTextArea();
        riwayatArea.setText("Riwayat Pembayaran Sebelumnya:\n..."); // Tambahkan riwayat yang sebenarnya di sini
        panel.add(new JScrollPane(riwayatArea), BorderLayout.CENTER);
        
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
