package View07198;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ghafar07198_GUI {
    JFrame TamPut = new JFrame();
    JLabel login,email,pass,judul; 
    JTextField textemail;
    JPasswordField textpass;
    JButton masuk,daftar;
    public Ghafar07198_GUI() {
        TamPut.setSize(700,600);
        TamPut.setLayout(null);
        TamPut.getContentPane().setBackground(Color.CYAN);

        judul = new JLabel("TABUNGAN PINTAR");
        judul.setBounds(110,20,500,50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,45));
        TamPut.add(judul);

        login = new JLabel("LOGIN");
        login.setBounds(280,100,500,50);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        TamPut.add(login);

        email = new JLabel("Email");
        email.setBounds(200,150,500,50);
        email.setFont(new Font("Times New Roman",Font.BOLD,25));
        TamPut.add(email);

        textemail = new JTextField();
        textemail.setBounds(200,200,270,30);
        TamPut.add(textemail);

        pass = new JLabel("Password");
        pass.setBounds(200,230,500,50);
        pass.setFont(new Font("Times New Roman",Font.BOLD,25));
        TamPut.add(pass);

        textpass = new JPasswordField();
        textpass.setBounds(200,280,270,30);
        TamPut.add(textpass);

        masuk = new JButton("Masuk");
        masuk.setBounds(200,320,100,30);
        TamPut.add(masuk);

        daftar = new JButton("Daftar");
        daftar.setBounds(370,320,100,30);
        TamPut.add(daftar);

        masuk .addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){                                  
                int cek = Ghafar07198_allobjctrl.user.loginUser(textemail.getText(),textpass.getText());
                if(cek>=0){
                    JOptionPane.showMessageDialog(null, "Selamat datang "+ Ghafar07198_allobjctrl.user.Ghafar07198_Costumer(cek).getNama(),"information", JOptionPane.INFORMATION_MESSAGE);
                    TamPut.dispose();
                    Ghafar07198_home home = new Ghafar07198_home();
                }else{
                    JOptionPane.showMessageDialog(null, "Password atau Email Salah","information", JOptionPane.INFORMATION_MESSAGE);
                }                 
            }
        });

        daftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                TamPut.dispose();
                Ghafar07198_GUIdaftar menu = new Ghafar07198_GUIdaftar();     
                }
        });     

        TamPut.setVisible(true);
        TamPut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TamPut.setLocationRelativeTo(null);

        }
}
