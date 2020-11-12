package ghafar071987_sisteminformasitabunganpintar;
import java.util.ArrayList;
import java.util.Scanner;
public class Ghafar07198_SistemInformasiTabunganPintar {
ArrayList<Ghafar07198_DataPenggunaEntity> user=new ArrayList();
ArrayList<Ghafar07198_DataTabunganEntity> Tabungan=new ArrayList();
Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        Ghafar07198_SistemInformasiTabunganPintar data = new Ghafar07198_SistemInformasiTabunganPintar();
        int pil;
        do{
        System.out.println("1.Daftar Akun");
        System.out.println("2.Login");
        System.out.println("3.Hapus Data");
        System.out.println("4.Update Data");
        System.out.println("5.view");
        System.out.println("6.Exit");
        System.out.print("Pilih = ");
         pil=data.input.nextInt();
        switch(pil){
            case 1:
                data.daftar();
                break;
            case 2:
                System.out.print("Email = ");
                String Ghafar07198_Email=data.input.next();
                System.out.print("Password = ");
                String Ghafar07198_Password=data.input.next();
                data.menuutama(Ghafar07198_Email,Ghafar07198_Password);
                break;
            case 3:
                System.out.println("Nama yang Dihapus = ");
                String Ghafar07198_nama1=data.input.next();
                data.hapusnama(Ghafar07198_nama1);
                System.out.println("");

                break;
            case 4:

                System.out.println("Nama yang Diupdate = ");
                String Ghafar07198_nama=data.input.next();
                data.update(Ghafar07198_nama);

                break;
            case 5:
                if(data.user.isEmpty()){
                    System.out.println("data kosong");
                }else{
                for(int a=0;a<data.user.size();a++){
                    System.out.println("Nama = "+data.user.get(a).getNama());
                    System.out.println("Target Menabung = "+data.Tabungan.get(a).getGhafar07198_target());
                    System.out.println("Email = "+data.user.get(a).getEmail());
                }
            }
        }
        }while(pil!=6);
    }
    void daftar(){
        System.out.print("Nama = ");
        String Ghafar07198_nama=input.next();
        System.out.print("Jenis Kelamin = ");
        String Ghafar07198_jeniskelamin=input.next();
        System.out.print("Masukan Email = ");
        String Ghafar07198_Email=input.next();
        System.out.print("Masukan Password = ");
        String Ghafar07198_Password=input.next();
        user.add(new Ghafar07198_DataPenggunaEntity(Ghafar07198_Email,Ghafar07198_Password,Ghafar07198_jeniskelamin,Ghafar07198_nama));        
    }
    void hapusnama(String Ghafar07198_Nama){
        if(Carinama(Ghafar07198_Nama)!=-1){
            user.remove(Carinama(Ghafar07198_Nama));
        }else{
            System.out.println("data tidak ditemukan");
        }
    }
    
    void update(String Ghafar07198_Nama){
        if(Carinama(Ghafar07198_Nama)!=-1){
            System.out.println("Email Baru = ");
            String Ghafar07198_email=input.next();
            user.get(Carinama(Ghafar07198_Nama)).Ghafar07198_Email=Ghafar07198_email;
        }else{
            System.out.println("data tidak ditemukan");
        }
    }
    
    int Carinama(String Ghafar07198_Nama){
        int indeks=-1;
        for(int a=0;a<user.size();a++){
            if(Ghafar07198_Nama.equals(user.get(a).getNama())){
                indeks=a;
            }
        }
        return indeks;
    }
    
    
    void menuutama(String Ghafar07198_Email,String Ghafar07198_Password){
        int Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_jangkawaktuterkumpul2,Ghafar07198_bulan,Ghafar07198_kurang;
        for(int a=0;a<user.size();a++){
            if(Ghafar07198_Email.equals(user.get(a).getEmail())&&Ghafar07198_Password.equals(user.get(a).getPassword())){
                System.out.println("Nama = "+user.get(a).getNama());
                System.out.println("Jenis Kelamin = "+user.get(a).getJenisKelamin());
                System.out.println("");
                System.out.print("Nominal menabung  = ");
                int Ghafar07198_menabung=input.nextInt();
                System.out.print("Target Menabung = ");
                int Ghafar07198_target=input.nextInt();
                 if (Ghafar07198_target <=500000 && Ghafar07198_menabung <500000){
                    System.out.println("Anda disarankan untuk menabung Perhari untuk nomninal sebesar "+Ghafar07198_target);
                }else if(Ghafar07198_target >500000 && Ghafar07198_menabung <500000){
                    System.out.println("Anda disarankan untuk menabung Perhari untuk nomninal sebesar "+Ghafar07198_target);
                }else{
                     System.out.println("Anda Disarankan untuk menabung Perbulan untuk nominal sebesar "+Ghafar07198_target);
                 }
                System.out.println("1. Menabung perhari ");
                System.out.println("2. Menabung perbulan ");
                System.out.print("pilih = ");
                int Ghafar07198_sekalamenabung=input.nextInt();
                Ghafar07198_jangkawaktuterkumpul1=Ghafar07198_target/Ghafar07198_menabung;
                switch(Ghafar07198_sekalamenabung){
                    case 1:
                    if(Ghafar07198_target==Ghafar07198_jangkawaktuterkumpul1*Ghafar07198_menabung && Ghafar07198_jangkawaktuterkumpul1 <=30){
                        System.out.println(Ghafar07198_target+" akan terkumpul "+Ghafar07198_jangkawaktuterkumpul1+" hari");
                        Ghafar07198_jangkawaktuterkumpul2=0;
                        Ghafar07198_bulan=0;
                        Ghafar07198_kurang=0;
                        Tabungan.add(new Ghafar07198_DataTabunganEntity(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_jangkawaktuterkumpul2,Ghafar07198_bulan,Ghafar07198_kurang,Ghafar07198_sekalamenabung,Ghafar07198_target,Ghafar07198_menabung));
                    }else if(Ghafar07198_target==Ghafar07198_jangkawaktuterkumpul1*Ghafar07198_menabung && Ghafar07198_jangkawaktuterkumpul1 >30 && Ghafar07198_jangkawaktuterkumpul1 <365){
                        Ghafar07198_jangkawaktuterkumpul1 = Ghafar07198_jangkawaktuterkumpul1/30;
                        System.out.println(Ghafar07198_target+" akan terkumpul dalam jangka waktu "+Ghafar07198_jangkawaktuterkumpul1+" bulan\n");
                        Ghafar07198_bulan = 0;
                        Ghafar07198_kurang = 0;
                        Ghafar07198_jangkawaktuterkumpul2 = 0;
                        Tabungan.add(new Ghafar07198_DataTabunganEntity(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_jangkawaktuterkumpul2,Ghafar07198_bulan,Ghafar07198_kurang,Ghafar07198_sekalamenabung,Ghafar07198_target,Ghafar07198_menabung));
                    }else if (Ghafar07198_target==Ghafar07198_jangkawaktuterkumpul1*Ghafar07198_menabung && Ghafar07198_jangkawaktuterkumpul1 >365){
                        Ghafar07198_jangkawaktuterkumpul2 = Ghafar07198_jangkawaktuterkumpul1/365;
                        Ghafar07198_bulan = (Ghafar07198_jangkawaktuterkumpul1-365)/30;
                        System.out.println(Ghafar07198_target+" akan terkumpul dalam jangka waktu "+Ghafar07198_jangkawaktuterkumpul2+" tahun "+ Ghafar07198_bulan+" bulan\n");
                        Ghafar07198_kurang = 0;
                        Tabungan.add(new Ghafar07198_DataTabunganEntity(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_jangkawaktuterkumpul2,Ghafar07198_bulan,Ghafar07198_kurang,Ghafar07198_sekalamenabung,Ghafar07198_target,Ghafar07198_menabung));
                    }
                    break;
                    case 2:
                    Ghafar07198_jangkawaktuterkumpul2=Ghafar07198_jangkawaktuterkumpul1/12;
                    if(Ghafar07198_jangkawaktuterkumpul1==Ghafar07198_jangkawaktuterkumpul2*12){
                        System.out.println(Ghafar07198_target+" akan terkumpul "+Ghafar07198_jangkawaktuterkumpul2+" tahun");
                        Ghafar07198_bulan=0;
                        Ghafar07198_kurang=0;
                        Tabungan.add(new Ghafar07198_DataTabunganEntity(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_jangkawaktuterkumpul2,Ghafar07198_bulan,Ghafar07198_kurang,Ghafar07198_sekalamenabung,Ghafar07198_target,Ghafar07198_menabung));
                        
                    }else{
                        Ghafar07198_bulan=Ghafar07198_jangkawaktuterkumpul1-(Ghafar07198_jangkawaktuterkumpul2*12);
                        if(Ghafar07198_target==Ghafar07198_jangkawaktuterkumpul1*Ghafar07198_menabung&&Ghafar07198_jangkawaktuterkumpul1>12){
                            System.out.println(Ghafar07198_target+" akan terkumpul "+Ghafar07198_jangkawaktuterkumpul2+" tahun "+Ghafar07198_bulan+" bulan");
                            Ghafar07198_kurang=0;
                            Tabungan.add(new Ghafar07198_DataTabunganEntity(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_jangkawaktuterkumpul2,Ghafar07198_bulan,Ghafar07198_kurang,Ghafar07198_sekalamenabung,Ghafar07198_target,Ghafar07198_menabung));
                        }else if(Ghafar07198_jangkawaktuterkumpul1<12){
                             System.out.println(Ghafar07198_target+" akan terkumpul "+Ghafar07198_jangkawaktuterkumpul1+" bulan");
                             Ghafar07198_kurang=0;
                             Tabungan.add(new Ghafar07198_DataTabunganEntity(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_jangkawaktuterkumpul2,Ghafar07198_bulan,Ghafar07198_kurang,Ghafar07198_sekalamenabung,Ghafar07198_target,Ghafar07198_menabung));
                        }else{
                            Ghafar07198_kurang=Ghafar07198_target-(Ghafar07198_jangkawaktuterkumpul1*Ghafar07198_menabung);
                            System.out.println(Ghafar07198_target+" akan terkumpul "+Ghafar07198_jangkawaktuterkumpul2+" tahun "+Ghafar07198_bulan+" bulan");
                            System.out.println("Dengan catatan dibulan terakhir, menabung "+Ghafar07198_kurang+Ghafar07198_menabung);
                            Tabungan.add(new Ghafar07198_DataTabunganEntity(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_jangkawaktuterkumpul2,Ghafar07198_bulan,Ghafar07198_kurang,Ghafar07198_sekalamenabung,Ghafar07198_target,Ghafar07198_menabung));
                        }
                    }
                }
            }else{
                System.out.println("Email atau Password Salah");
            }
        }
    }
}
