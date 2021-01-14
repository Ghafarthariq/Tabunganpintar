package View07198;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;
import java.text.SimpleDateFormat;
public class Ghafar07198_GUItabungan {
    JFrame Ghafar07198_GUItabungan = new JFrame();
    JLabel Header,TargetMenabung,NominalMenabung,MulaiMenabung,TabunganTerkumpul;
    JTextField TextTargetMenabung,TextNominalMenabung;
    JTextArea areaMulai,areaTerkumpul;
    JRadioButton RadioHari,RadioBulan;  
    JButton Checkout,Back,Reset;
    private Calendar tgl = Calendar.getInstance();
    private SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
    int menabung,target,jangkawaktuterkumpul1;
    int Cek;
    public Ghafar07198_GUItabungan() {
        Ghafar07198_GUItabungan.setSize(600, 700);
        Ghafar07198_GUItabungan.setLayout(null);
        Ghafar07198_GUItabungan.getContentPane().setBackground(Color.CYAN);
        
        Header = new JLabel("Menabung");
        Header.setBounds(190, 40, 350,45);
        Header.setFont(new Font("Times New Roman",Font.BOLD,40));
        Ghafar07198_GUItabungan.add(Header);
        
        TargetMenabung = new JLabel("Target Menabung");
        TargetMenabung.setBounds(170, 115, 190, 60);
        TargetMenabung.setFont(new Font("Times New Roman",Font.BOLD,20));
        Ghafar07198_GUItabungan.add(TargetMenabung);
        
        TextTargetMenabung = new JTextField();
        TextTargetMenabung.setBounds(170, 160, 220, 30);
        Ghafar07198_GUItabungan.add(TextTargetMenabung);
        
        NominalMenabung = new JLabel("Nominal Menabung");
        NominalMenabung.setBounds(170, 180, 190, 60);
        NominalMenabung.setFont(new Font("Times New Roman",Font.BOLD,20));
        Ghafar07198_GUItabungan.add(NominalMenabung);
        
        TextNominalMenabung = new JTextField();
        TextNominalMenabung.setBounds(170, 225, 220, 30);
        Ghafar07198_GUItabungan.add(TextNominalMenabung);
        
        RadioHari = new JRadioButton("Perhari");
        RadioHari.setBounds(170, 270, 90, 35);
        RadioHari.setBackground(Color.PINK);
         Ghafar07198_GUItabungan.add(RadioHari);
         
        RadioBulan = new JRadioButton("Perbulan");
        RadioBulan.setBounds(300, 270, 90, 35);
        RadioBulan.setBackground(Color.PINK);
        Ghafar07198_GUItabungan.add(RadioBulan);
        
        MulaiMenabung = new JLabel("Mulai Menabung");
        MulaiMenabung.setBounds(170, 300, 190, 60);
        MulaiMenabung.setFont(new Font("Times New Roman",Font.BOLD,20));
        Ghafar07198_GUItabungan.add(MulaiMenabung);
        
        areaMulai = new JTextArea();
        areaMulai.setBounds(170, 345, 220, 30);
        Ghafar07198_GUItabungan.add(areaMulai);
         
        TabunganTerkumpul = new JLabel("Tabungan Terkumpul");
        TabunganTerkumpul.setBounds(170, 365, 190, 60);
        TabunganTerkumpul.setFont(new Font("Times New Roman",Font.BOLD,20));
        Ghafar07198_GUItabungan.add(TabunganTerkumpul);
        
        areaTerkumpul = new JTextArea();
        areaTerkumpul.setBounds(170, 410, 220, 30);
        Ghafar07198_GUItabungan.add(areaTerkumpul);
        
        Checkout= new JButton("Checkout");
        Checkout.setBounds(170, 480, 220, 43);
        Checkout.setFont(new Font("Times New Roman",Font.BOLD,20));
        Checkout.setBackground(Color.BLACK);
        Checkout.setForeground(Color.WHITE);
        Ghafar07198_GUItabungan.add(Checkout);
          
        Reset = new JButton("Reset");
        Reset.setBounds(170, 540, 220, 43);
        Reset.setFont(new Font("Times New Roman",Font.BOLD,20));
        Reset.setBackground(Color.WHITE);
        Ghafar07198_GUItabungan.add(Reset);
          
        Back = new JButton("Kembali");
        Back.setBounds(170, 600, 220, 43);
        Back.setFont(new Font("Times New Roman",Font.BOLD,20));
        Back.setBackground(Color.WHITE);
        Ghafar07198_GUItabungan.add(Back);
        
        Ghafar07198_GUItabungan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ghafar07198_GUItabungan.setVisible(true);
        Ghafar07198_GUItabungan.setLocationRelativeTo(null);
        
        Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){  
                if(Cek ==1){
                    Ghafar07198_GUItabungan.dispose();
                    Ghafar07198_home home = new Ghafar07198_home();
                }else{
                    Ghafar07198_GUItabungan.dispose();
                    Ghafar07198_GUI login = new Ghafar07198_GUI();
                }
                   
            }
        });
        
        RadioBulan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(RadioBulan.isSelected()){
                    jangkawaktuterkumpul1=0;
                    RadioHari.setSelected(false);
                    try{
                        target = Integer.parseInt(TextTargetMenabung.getText());
                        menabung = Integer.parseInt(TextNominalMenabung.getText());
                        jangkawaktuterkumpul1= target/menabung;
                 
                    if(target==jangkawaktuterkumpul1*menabung){
                        areaMulai.setText(sdf.format(tgl.getTime()));
                        tgl.add(Calendar.DATE,jangkawaktuterkumpul1*30);
                        areaTerkumpul.setText(sdf.format(tgl.getTime()));
                        Ghafar07198_allobjctrl.user.InsertDataTabungan(jangkawaktuterkumpul1, target, menabung, menabung, tgl);
                        Ghafar07198_kosong();
                        Cek = 1;
                   }else{
                        areaMulai.setText(sdf.format(tgl.getTime()));
                        tgl.add(Calendar.DATE, jangkawaktuterkumpul1*30);
                        areaTerkumpul.setText(sdf.format(tgl.getTime()));
                        Ghafar07198_allobjctrl.user.InsertDataTabungan(jangkawaktuterkumpul1, target, menabung, menabung, tgl);
                        Ghafar07198_kosong();
                        Cek = 1;
                   }
                   }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Gagal Menabung, Harap Login Ulang  ","information", JOptionPane.INFORMATION_MESSAGE); 
                        Ghafar07198_allobjctrl.user.Ghafar07198_hapusTabungan(target);
                        Cek =0;
                   }
                }
            
            }
        });
           
        RadioHari.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(RadioHari.isSelected()){
                    jangkawaktuterkumpul1=0;
                    RadioBulan.setSelected(false);
                    try{
                        target = Integer.parseInt(TextTargetMenabung.getText());
                        menabung = Integer.parseInt(TextNominalMenabung.getText());
                        jangkawaktuterkumpul1= target/menabung;   
                        if(target==jangkawaktuterkumpul1*menabung){
                            areaMulai.setText(sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, jangkawaktuterkumpul1);
                            areaTerkumpul.setText(sdf.format(tgl.getTime()));
                            Ghafar07198_allobjctrl.user.InsertDataTabungan(jangkawaktuterkumpul1,target,menabung,menabung,tgl);
                            Ghafar07198_kosong();
                            Cek =1;
                        }else{
                            areaMulai.setText(sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE,jangkawaktuterkumpul1);
                            areaTerkumpul.setText(sdf.format(tgl.getTime()));
                            Ghafar07198_allobjctrl.user.InsertDataTabungan(jangkawaktuterkumpul1,target,menabung,menabung,tgl);
                            Ghafar07198_kosong();
                            Cek =1;
                        }
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Gagal Menabung, Harap Login Ulang","information", JOptionPane.INFORMATION_MESSAGE); 
                        Ghafar07198_allobjctrl.user.Ghafar07198_hapusTabungan(target);
                        Cek =0;
                    }
                }
            }
        });
        Checkout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                target = Integer.parseInt (TextTargetMenabung.getText());
                menabung = Integer.parseInt (TextNominalMenabung.getText());
                if(target<=500000&&menabung<500000){
                    JOptionPane.showMessageDialog(null, "Anda disarankan menabung perhari ","information", JOptionPane.INFORMATION_MESSAGE);  
                }else if(target>500000&&menabung<500000){
                    JOptionPane.showMessageDialog(null, "Anda disarankan menabung perhari ","information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Anda disarankan menabung perbulan ","information", JOptionPane.INFORMATION_MESSAGE); 
                }     
                }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "maaf, anda tidak dapat menabung, masukkan target dan nominal kemudian, checkout","information", JOptionPane.INFORMATION_MESSAGE); }
                }
        });
                
        Reset.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae){
                Ghafar07198_kosongNilai();
            }
        });   
    }
    void Ghafar07198_kosong(){
        TextTargetMenabung.setText(null);
        TextNominalMenabung .setText(null);
    }
    void Ghafar07198_kosongNilai(){
        areaTerkumpul.setText(null);
        areaMulai.setText(null);
    }
}
    

