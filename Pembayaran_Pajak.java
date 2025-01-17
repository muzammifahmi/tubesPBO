import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pembayaran_Pajak extends JFrame {
    private JTextField kodeField;
    private JTextField alamatField;
    private JTextField rtField;
    private JTextField rwField;
    private JTextField ukuranTanahField;
    private JButton bayarButton;

    public Pembayaran_Pajak() {
        setTitle("Aplikasi Pembayaran Pajak - Pembayaran Pajak");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(7, 2));
        
        panel.add(new JLabel("Kode Pembayaran:"));
        kodeField = new JTextField();
        panel.add(kodeField);
        
        panel.add(new JLabel("Alamat:"));
        alamatField = new JTextField();
        panel.add(alamatField);
        
        panel.add(new JLabel("RT:"));
        rtField = new JTextField();
        panel.add(rtField);
        
        panel.add(new JLabel("RW:"));
        rwField = new JTextField();
        panel.add(rwField);
        
        panel.add(new JLabel("Ukuran Tanah (m2):"));
        ukuranTanahField = new JTextField();
        panel.add(ukuranTanahField);
        
        bayarButton = new JButton("Bayar");
        panel.add(bayarButton);
        
        add(panel);
        
        bayarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ukuranTanah = Integer.parseInt(ukuranTanahField.getText());
                int biayaPajak = ukuranTanah * 100000;
                JOptionPane.showMessageDialog(null, "Total Biaya Pajak: Rp " + biayaPajak);
                new Hasil_Pembayaran(kodeField.getText(), alamatField.getText(), rtField.getText(), rwField.getText(), ukuranTanah, biayaPajak).setVisible(true);
                dispose();
            }
        });
    }
}
