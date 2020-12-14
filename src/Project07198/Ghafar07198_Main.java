package Project07198;
import Model07198.*;
import Entity07198.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Ghafar07198_Main {
       private Ghafar07198_DataTabunganModel datatabunganModel=new Ghafar07198_DataTabunganModel();
       private Scanner input=new Scanner(System.in);
       private Ghafar07198_DataPenggunaModel datapenggunaModel=new Ghafar07198_DataPenggunaModel();
       private SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
       private Calendar tgl = Calendar.getInstance();
       
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
                Data.datapenggunaModel.hapusnama(nama1);
                break;
            case 4:
                System.out.print("Nama = ");
                String Nama=Data.input.next();
                Data.datapenggunaModel.update(Nama);
                break;
            case 5:
                Data.datapenggunaModel.view();               
        }
        }while(pil!=6);
      }
      void login(String Email,String Password){
        int jangkawaktuterkumpul1;
        int CekDataPengguna=datapenggunaModel.CekData(Email,Password);
            if(CekDataPengguna==-1||CekDataPengguna==-2){
                System.out.println("Password atau Email Salah");
            }else{
                System.out.print("Target Menabung = ");
                int target=input.nextInt();          
                System.out.print("Nominal menabung = ");
                int menabung=input.nextInt();
                if(target<=500000&&menabung<500000){
                     System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+target);  
                }else if(target>500000&&menabung<500000){
                    System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+target);   
                }else{
                     System.out.println("Anda disarankan menabung perbulan untuk nominal sebesar "+target);  
                }
                System.out.println("Menabung (perhari/perbulan)");
                System.out.println("1)perhari");
                System.out.println("2)perbulan");
                System.out.print("Pilih = ");
                int sekalamenabung=input.nextInt();
                jangkawaktuterkumpul1=target/menabung;
                switch(sekalamenabung){
                    case 1:
                        if(target==jangkawaktuterkumpul1*menabung){
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, jangkawaktuterkumpul1);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime()));
                            datatabunganModel.InsertDataTabunganPintar(new Ghafar07198_DataTabunganEntity(jangkawaktuterkumpul1,target,menabung,sekalamenabung));
                        }else {
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, jangkawaktuterkumpul1);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            datatabunganModel.InsertDataTabunganPintar(new Ghafar07198_DataTabunganEntity(jangkawaktuterkumpul1,target,menabung,sekalamenabung));
                        }
                        break;
                    case 2:
                        if(target==jangkawaktuterkumpul1*menabung){
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, jangkawaktuterkumpul1*30);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            datatabunganModel.InsertDataTabunganPintar(new Ghafar07198_DataTabunganEntity(jangkawaktuterkumpul1,target,menabung,sekalamenabung));
                    }else{
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, jangkawaktuterkumpul1*30);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            datatabunganModel.InsertDataTabunganPintar(new Ghafar07198_DataTabunganEntity(jangkawaktuterkumpul1,target,menabung,sekalamenabung));
                    }            
                }
            }  
    }
       void daftar(){
         System.out.print("Nama = ");
         String nama=input.next();
         System.out.print("Jenis Kelamin = ");
         String jeniskelamin=input.next();
         System.out.print("Masukan Email = ");
         String Email=input.next();          System.out.print("Masukan Password = ");
         String Password=input.next();
         datapenggunaModel.InsertDataPengguna(new Ghafar07198_DataPenggunaEntity(Email,nama,Password,jeniskelamin)); 
        } 
      }

