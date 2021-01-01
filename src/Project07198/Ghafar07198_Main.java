package Project07198;
import Controller07198.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ghafar07198_Main {
    private Ghafar07198_UserController User = new Ghafar07198_UserController();
    private SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
    private Calendar tgl = Calendar.getInstance();
    private Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        Ghafar07198_Main Data= new Ghafar07198_Main();
        int pil;
        do{
            System.out.println("1.Daftar Akun");
            System.out.println("2.Login");
            System.out.println("3.hapus Data");
            System.out.println("4.Update Data");
            System.out.println("5.View");
            System.out.println("6.Exit");
            System.out.print("Pilih = ");
            pil=Data.input.nextInt();
            switch(pil){
                case 1:
                    Data.daftar();
                    break;
                    case 2:
                    System.out.print("Email = ");
                    String Email=Data.input.next();
                    System.out.print("Password = ");
                    String Password=Data.input.next();
                    Data.login(Email,Password);
                    break;
                case 3:
                    System.out.print("Nama Yang Dihapus = ");
                    String nama1=Data.input.next();
                    int Status1=Data.User.hapus(nama1);
                    Data.cekStatus(Status1);
                    break;
                case 4:
                    System.out.print("Nama = ");
                    String Nama=Data.input.next();
                    System.out.print("Email = ");
                    String Email1=Data.input.next();
                    int Status=Data.User.update(Nama,Email1);
                    Data.cekStatus(Status);
                    break;
                case 5:
                    Data.view();
            }  
        }while(pil!=6);
    }
    void daftar(){
        try{
        System.out.print("Nama = ");
        String Ghafar07198_nama=input.next();
        System.out.print("Jenis Kelamin = ");
        String Ghafar07198_jeniskelamin=input.next();
        System.out.print("Masukan Email = ");
        String Ghafar07198_Email=input.next();
        System.out.print("Masukan Password = ");
        String Ghafar07198_Password=input.next();
        User.InsertDataPengguna(Ghafar07198_Email,Ghafar07198_nama,Ghafar07198_Password,Ghafar07198_jeniskelamin);
        }catch(Exception exception){
            System.out.println("Inputan Salah");
        }
    }
     
    void login(String Ghafar07198_Email,String Ghafar07198_Password){
        int Ghafar07198_jangkawaktuterkumpul1;
        int CekDataPengguna=User.loginUser(Ghafar07198_Email,Ghafar07198_Password);
            if(CekDataPengguna==-1||CekDataPengguna==-2){
                System.out.println("Password atau Email Salah");
            }else{
                System.out.print("Target Menabung = ");
                int Ghafar07198_target=input.nextInt();
                System.out.print("Nominal menabung = ");
                int Ghafar07198_menabung=input.nextInt();            
                if(Ghafar07198_target<=500000&&Ghafar07198_menabung<500000){
                    System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+Ghafar07198_target);  
                }else if(Ghafar07198_target>500000&&Ghafar07198_menabung<500000){
                    System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+Ghafar07198_target);   
                }else{
                    System.out.println("Anda disarankan menabung perbulan untuk nominal sebesar "+Ghafar07198_target);  
                }
                System.out.println("Menabung (perhari/perbulan)");
                System.out.println("1)perhari");
                System.out.println("2)perbulan");
                System.out.print("Pilih = ");
                int Ghafar07198_sekalamenabung=input.nextInt();
                Ghafar07198_jangkawaktuterkumpul1=Ghafar07198_target/Ghafar07198_menabung;
                switch(Ghafar07198_sekalamenabung){
                    case 1:
                        if(Ghafar07198_target==Ghafar07198_jangkawaktuterkumpul1*Ghafar07198_menabung){
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE,Ghafar07198_jangkawaktuterkumpul1);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime()));
                            User.InsertDataTabungan(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_target,Ghafar07198_menabung,Ghafar07198_sekalamenabung);
                        }else {
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE,Ghafar07198_jangkawaktuterkumpul1);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            User.InsertDataTabungan(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_target,Ghafar07198_menabung,Ghafar07198_sekalamenabung);
                        }
                         break;
                    case 2:
                        if(Ghafar07198_target==Ghafar07198_jangkawaktuterkumpul1*Ghafar07198_menabung){
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE,Ghafar07198_jangkawaktuterkumpul1*30);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            User.InsertDataTabungan(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_target,Ghafar07198_menabung,Ghafar07198_sekalamenabung);
                        }else{
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE,Ghafar07198_jangkawaktuterkumpul1*30);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            User.InsertDataTabungan(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_target,Ghafar07198_menabung,Ghafar07198_sekalamenabung);
                        }
                }
            }
        
    }
      
    public void view(){
        if(User.Ghafar07198_GetArrayListDataPenggunaIsEmpty()){
            System.out.println("Data Kosong");
        }else{
            for(int a=0;a<User.Ghafar07198_GetArrayListDataPenggunaSize();a++){
                System.out.println("Nama = "+User.Ghafar07198_Costumer(a).getNama());
                System.out.println("Jenis Kelamin = "+User.Ghafar07198_Costumer(a).getJeniskelamin());
                System.out.println("Email = "+User.Ghafar07198_Costumer(a).getEmail());
                System.out.println("");       
            }
        }
    }
    public void cekStatus(int Ghafar07198_Cek){
        if(Ghafar07198_Cek==1){
            System.out.println("Berhasil");
        }else{
            System.out.println("Nama Tidak Ditemukan");
        }
    }
      
}
