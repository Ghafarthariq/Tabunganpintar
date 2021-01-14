package View07198;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ghafar07198_GUIdaftar {
    JFrame TamDaf = new JFrame();
    JLabel Jdaftar,nama,email,jenkel,pass;
    JTextField tnama,temail,tpass;
    JButton back,daftar;
    JRadioButton radiolaki,radioperempuan;
    boolean cekKelamin;
    private boolean daf = false;
    public Ghafar07198_GUIdaftar() {
        TamDaf.setSize(700,600);
        TamDaf.setLayout(null);
        TamDaf.getContentPane().setBackground(Color.CYAN);
        
        Jdaftar = new JLabel("DAFTAR");
        Jdaftar.setBounds(280,20,500,50);
        Jdaftar.setFont(new Font("Times New Roman",Font.BOLD,30));
        TamDaf.add(Jdaftar);
        
        nama = new JLabel("Nama");
        nama.setBounds(200,70,500,50);
        nama.setFont(new Font("Times New Roman",Font.BOLD,25));
        TamDaf.add(nama);
        
        tnama = new JTextField();
        tnama.setBounds(200,120,270,30);
        TamDaf.add(tnama);
        
        jenkel = new JLabel("Jenis Kelamin");
        jenkel.setBounds(200,150,500,50);
        jenkel.setFont(new Font("Times New Roman",Font.BOLD,25));
        TamDaf.add(jenkel);
      
        radiolaki = new JRadioButton("Laki-Laki");
        radiolaki.setBounds(200,200,130,30);
        TamDaf.add(radiolaki);
        
        radioperempuan = new JRadioButton("Perempuan");
        radioperempuan.setBounds(340,200,130,30);
        TamDaf.add(radioperempuan);
        radiolaki.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae){
                if(radiolaki.isSelected()){
                    radioperempuan.setSelected(false);
                    daf=true;
                }
            }
        });
        radioperempuan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(radioperempuan.isSelected()){
                    radiolaki.setSelected(false);
                    daf=false;
                }
            }
        });
        
        email = new JLabel("Email");
        email.setBounds(200,230,500,50);
        email.setFont(new Font("Times New Roman",Font.BOLD,25));
        TamDaf.add(email);
    
        temail = new JTextField();
        temail.setBounds(200,280,270,30);
        TamDaf.add(temail);
        
        pass = new JLabel("Password");
        pass.setBounds(200,310,500,50);
        pass.setFont(new Font("Times New Roman",Font.BOLD,25));
        TamDaf.add(pass);
    
        tpass = new JTextField();
        tpass.setBounds(200,360,270,30);
        TamDaf.add(tpass);
        
        back = new JButton("Back");
        back.setBounds(200,400,100,30);
        TamDaf.add(back);
    
        daftar = new JButton("Daftar");
        daftar.setBounds(370,400,100,30);
        TamDaf.add(daftar);
        
        daftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(cekKelamin==true){
                    String nama =tnama.getText();
                    String jeniskelamin ="Laki - laki";
                    String email = temail.getText();
                    String password = tpass.getText();
                    Ghafar07198_allobjctrl.user.InsertDataPengguna(email, nama, password, jeniskelamin);
                    JOptionPane.showMessageDialog(null, "Registrasi sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }else{
                    String nama = tnama.getText();
                    String jeniskelamin ="Perempuan";
                    String email = temail.getText();
                    String password =tpass.getText();
                    Ghafar07198_allobjctrl.user.InsertDataPengguna(email, nama, password, jeniskelamin);
                    JOptionPane.showMessageDialog(null, "Registrasi sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }                      
            }
        });

        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){ 
            TamDaf.dispose();
            Ghafar07198_GUI login = new Ghafar07198_GUI();

            }
        });

            TamDaf.setVisible(true);
            TamDaf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            TamDaf.setLocationRelativeTo(null);
        }
    
    void kosong(){
        tnama.setText(null);
        temail.setText(null);
        tpass.setText(null);
    }
    
}
