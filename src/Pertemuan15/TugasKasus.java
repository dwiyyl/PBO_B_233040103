package Pertemuan15;
// Tugas Kasus 2-1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TugasKasus extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JButton button;

    public TugasKasus() {
        // Komponen
        textField1 = new JTextField();
        textField2 = new JTextField();
        button = new JButton("Jumlah");

        // Event
        button.addActionListener(this);

        // Layout
        setLayout(new GridLayout(3, 1));
        add(textField1);
        add(textField2);
        add(button);

        // Form properties
        setTitle("");
        setSize(200, 170); // disesuaikan seperti pada gambar
        setLocationRelativeTo(null); // posisikan di tengah layar
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(textField1.getText());
            int angka2 = Integer.parseInt(textField2.getText());
            int hasil = angka1 + angka2;

            JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
