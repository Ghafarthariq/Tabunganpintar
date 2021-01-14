package View07198;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;
public class Ghafar07198_home {
    JFrame Ghafar07198_home = new JFrame();
    JButton Menabung,Update,Hapus,keluar;
    JLabel home,datapengguna;
    JTextArea View;
    public Ghafar07198_home() {
        Ghafar07198_home.setSize(600, 600);
        Ghafar07198_home.setLayout(null);
        Ghafar07198_home.getContentPane().setBackground(Color.CYAN);
        
        home = new JLabel("Menu Utama");
        home.setBounds(190, 40, 350,40);
        home.setFont(new Font("Times New Roman",Font.BOLD,40));
        Ghafar07198_home.add(home);
        
        datapengguna = new JLabel("Data Pengguna");
        datapengguna.setBounds(50, 100, 200,40);
        datapengguna.setFont(new Font("Times New Roman",Font.BOLD,25));
        Ghafar07198_home.add(datapengguna);
        
        View = new JTextArea();
        View.setBounds(50, 150, 486,270);
        View.setText(Ghafar07198_DataPengguna());
        Ghafar07198_home.add(View);
               
        Hapus = new JButton("Hapus Data");
        Hapus.setBounds(50, 455, 100, 40);
        Ghafar07198_home.add(Hapus);
        
        Update = new JButton("Update");
        Update.setBounds(180, 455, 100, 40);
        Ghafar07198_home.add(Update);
        
        Menabung = new JButton("Menabung");
        Menabung.setBounds(310, 455, 100, 40);
        Ghafar07198_home.add(Menabung);
        
        keluar = new JButton("Logout");
        keluar.setBounds(440, 455, 100, 40);
        keluar.setForeground(Color.WHITE);
        keluar.setBackground(Color.RED);
        Ghafar07198_home.add(keluar);      
        
        Ghafar07198_home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ghafar07198_home.setVisible(true);
        Ghafar07198_home.setLocationRelativeTo(null);
        
        keluar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                Ghafar07198_home.dispose();
                Ghafar07198_GUI login = new Ghafar07198_GUI();
            
            }
        });
        Menabung.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Ghafar07198_home.dispose();
                Ghafar07198_GUItabungan tabungan = new Ghafar07198_GUItabungan();
            }
        });
          
        Hapus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Ghafar07198_GUIhapus Hapus = new Ghafar07198_GUIhapus();
            }
        });

        Update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Ghafar07198_GUIupdate update = new Ghafar07198_GUIupdate();      
            }
        });

        }
        String Ghafar07198_DataPengguna()
        {
            for(int a=0;a<Ghafar07198_allobjctrl.user.Ghafar07198_GetArrayListDataPenggunaSize();a++){
                String  syahrul07185_Teks = "Nama = "+ Ghafar07198_allobjctrl.user.Ghafar07198_Costumer(a).getNama()+"\n"+"Jenis Kelamin = "+ Ghafar07198_allobjctrl.user.Ghafar07198_Costumer(a).getJeniskelamin() 
                       +"\n"+"Email = "+ Ghafar07198_allobjctrl.user.Ghafar07198_Costumer(a).getEmail();
                return syahrul07185_Teks;
            }
            return null;
        }    
}
