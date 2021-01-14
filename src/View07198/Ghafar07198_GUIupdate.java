package View07198;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ghafar07198_GUIupdate {
    JFrame Ghafar07198_GUIupdate = new JFrame();
    JLabel emaillama,email,update;
    JTextField textemaillama,textemail;
    JButton Kembali,Checkout;
    public Ghafar07198_GUIupdate() {
        Ghafar07198_GUIupdate.setSize(300, 300);
        Ghafar07198_GUIupdate.setLayout(null);
        Ghafar07198_GUIupdate.getContentPane().setBackground(Color.CYAN);
        
        update = new JLabel("Update");
        update.setBounds(20, 20, 250, 35);
        update.setFont(new Font("Times New Roman",Font.BOLD,30));
        Ghafar07198_GUIupdate.add(update);
        
        emaillama = new JLabel("Email Lama ");
        emaillama.setBounds(50,60,150,15);
        Ghafar07198_GUIupdate.add(emaillama);
        
        textemaillama = new JTextField();
        textemaillama.setBounds(50, 80, 190, 25);
        Ghafar07198_GUIupdate.add(textemaillama);
         
        email = new JLabel("Email Baru  ");
        email.setBounds(50,110,150,25);
        Ghafar07198_GUIupdate.add(email);
         
        textemail = new JTextField();
        textemail.setBounds(50, 130, 190, 25);
        Ghafar07198_GUIupdate.add(textemail);
         
        Checkout = new JButton("Selesai");
        Checkout.setBounds(80,170,120,30);
        Ghafar07198_GUIupdate.add(Checkout);
        
        Kembali = new JButton("Kembali");
        Kembali.setBounds(80,210,120,30);
        Ghafar07198_GUIupdate.add(Kembali);
         
        Ghafar07198_GUIupdate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ghafar07198_GUIupdate.setVisible(true);
        Ghafar07198_GUIupdate.setLocationRelativeTo(null);
        
        Checkout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                int cek = Ghafar07198_allobjctrl.user.update(textemaillama.getText(),textemail.getText());
                if (cek==1){
                    JOptionPane.showMessageDialog(null,"Berhasil Update","information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Email Tidak Ditemukan","information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
         
        Kembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){        
                Ghafar07198_GUIupdate.dispose();
                Ghafar07198_home menu = new Ghafar07198_home();
            }
        });
    }
    
}
