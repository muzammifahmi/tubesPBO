import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hasil_Pembayaran extends JFrame {
    public Hasil_Pembayaran(String kode, String alamat, String rt, String rw, int ukuran, int biaya) {
        setTitle("Aplikasi Pembayaran Pajak - Hasil Pembayaran");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(7, 2));
        
        panel.add(new JLabel("Kode Pembayaran:"));
        panel.add(new JLabel(kode));
        
        panel.add(new JLabel("Alamat:"));
        panel.add(new JLabel(alamat));
        
        panel.add(new JLabel("RT:"));
        panel.add(new JLabel(rt));
        
        panel.add(new JLabel("RW:"));
        panel.add(new JLabel(rw));
        
        panel.add(new JLabel("Ukuran Tanah (m2):"));
        panel.add(new JLabel(String.valueOf(ukuran)));
        
        panel.add(new JLabel("Biaya Pajak:"));
        panel.add(new JLabel("Rp " + biaya));
        
        JButton kembaliButton = new JButton("Kembali");
        panel.add(kembaliButton);
        
        add(panel);
        
        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Pembayaran_Pajak().setVisible(true);
                dispose();
            }
        });
    }
}
