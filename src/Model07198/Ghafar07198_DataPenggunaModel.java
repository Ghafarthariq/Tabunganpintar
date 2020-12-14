package Model07198;

import Entity07198.Ghafar07198_DataPenggunaEntity;
import java.util.ArrayList;
import java.util.Scanner;
public class Ghafar07198_DataPenggunaModel implements ModelInterfaces {
    private ArrayList<Ghafar07198_DataPenggunaEntity> datapenggunaEntityArrayList;
    private  Scanner input=new Scanner(System.in);
    public Ghafar07198_DataPenggunaModel() {
        datapenggunaEntityArrayList= new ArrayList<Ghafar07198_DataPenggunaEntity>();
    }
    
    @Override
    public void view(){
        if(datapenggunaEntityArrayList.isEmpty()){
            System.out.println("Data Kosong");
        }else{
            for(int a=0;a<datapenggunaEntityArrayList.size();a++){
                System.out.println("Nama = "+datapenggunaEntityArrayList.get(a).getNama());
                System.out.println("Email = "+datapenggunaEntityArrayList.get(a).getEmail());
                System.out.println("Password = "+datapenggunaEntityArrayList.get(a).getPassword());
                System.out.println("");
            }
        }
    }
    public int CekData(String Email,String Password){
        int loop=0;
        if(datapenggunaEntityArrayList.size()==0){
            loop=-1;
        }else{
            for(int a=0;a<datapenggunaEntityArrayList.size();a++){
                if(datapenggunaEntityArrayList.get(a).getEmail().equals(Email)&&datapenggunaEntityArrayList.get(a).getPassword().equals(Password)){
                    loop=a;
                    break;
                }else{
                    loop=-2;
                }
            }
        }
        return loop;
    }
     
     public void hapusnama(String nama){
      if(nama.equals(datapenggunaEntityArrayList.get(carinama(nama)).getNama())){
           datapenggunaEntityArrayList.remove(carinama(nama));
            System.out.println("Nama Sudah Dihapus");
      }else{
            System.out.println("Nama Tidak Ditemukan");
      }
   }

     public void update(String nama){
       if(carinama(nama)!=-1){
           System.out.println("Email Baru = ");
           String Email1=input.next();
           datapenggunaEntityArrayList.get(carinama(nama)).setEmail(Email1);
       }else{
           System.out.println("Nama Tidak Ditemukan");
       }
   }
     
      private int carinama(String nama){
       int indeks=-1;
       
       for(int a=0;a<datapenggunaEntityArrayList.size();a++){
           if(nama.equals(datapenggunaEntityArrayList.get(a).getNama())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
      public void InsertDataPengguna(Ghafar07198_DataPenggunaEntity dataPenggunaEntity){
          datapenggunaEntityArrayList.add(dataPenggunaEntity);
      }
}
