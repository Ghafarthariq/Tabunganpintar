package View07198;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ghafar07198_GUIhapus {
    JFrame Ghafar07198_GUIhapus = new JFrame();
    JLabel nama,hapus;
    JTextField textemail;
    JButton kembali,Checkout;
    public Ghafar07198_GUIhapus() {
        Ghafar07198_GUIhapus.setSize(300, 300);
        Ghafar07198_GUIhapus.setLayout(null);
        Ghafar07198_GUIhapus.getContentPane().setBackground(Color.CYAN);
      
        hapus = new JLabel("Hapus");
        hapus.setBounds(20, 20, 250, 35);
        hapus.setFont(new Font("Times New Roman",Font.BOLD,30));
        Ghafar07198_GUIhapus.add(hapus);
             
        nama = new JLabel("Email ");
        nama.setBounds(50,60,150,15);
        Ghafar07198_GUIhapus.add(nama);
        
        textemail = new JTextField();
        textemail.setBounds(50, 80, 190, 25);
        Ghafar07198_GUIhapus.add(textemail);
            
        Checkout = new JButton("Selesai");
        Checkout.setBounds(80,170,120,30);
        Ghafar07198_GUIhapus.add(Checkout);
        
        kembali = new JButton("Kembali");
        kembali.setBounds(80,210,120,30);
        Ghafar07198_GUIhapus.add(kembali);
           
        Checkout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                int cek = Ghafar07198_allobjctrl.user.hapus(textemail.getText());
                if (cek==1){
                    JOptionPane.showMessageDialog(null, "Berhasil Hapus Data","information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Nama Tidak Ditemukan","information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        kembali .addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Ghafar07198_GUIhapus.dispose();
                Ghafar07198_home home = new Ghafar07198_home();
            }
        });
        
        Ghafar07198_GUIhapus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ghafar07198_GUIhapus.setVisible(true);
        Ghafar07198_GUIhapus.setLocationRelativeTo(null);
    }
}
