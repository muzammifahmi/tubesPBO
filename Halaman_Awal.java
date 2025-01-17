import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Halaman_Awal extends JFrame {
    public Halaman_Awal() {
        setTitle("Aplikasi Pembayaran Pajak - Halaman Awal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(4, 1));
        
        JButton pembayaranPajakButton = new JButton("Pembayaran Pajak");
        JButton riwayatPembayaranButton = new JButton("Riwayat Pembayaran");
        JButton panduanPajakButton = new JButton("Panduan Pajak");
        
        panel.add(pembayaranPajakButton);
        panel.add(riwayatPembayaranButton);
        panel.add(panduanPajakButton);
        
        add(panel);
        
        pembayaranPajakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Pembayaran_Pajak().setVisible(true);
                dispose();
            }
        });
        
        riwayatPembayaranButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Riwayat_Pembayaran().setVisible(true);
                dispose();
            }
        });
        
        panduanPajakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Panduan_Pajak().setVisible(true);
                dispose();
            }
        });
    }
}
