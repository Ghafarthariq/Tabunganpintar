package Model07198;
import Entity07198.Ghafar07198_DataPenggunaEntity;
import java.util.ArrayList;
public class Ghafar07198_DataPenggunaModel implements ModelInterfaces {
    private ArrayList<Ghafar07198_DataPenggunaEntity> datapenggunaEntityArrayList;
    public Ghafar07198_DataPenggunaModel() {
        datapenggunaEntityArrayList= new ArrayList<Ghafar07198_DataPenggunaEntity>();
    }
    @Override
    public int CekData(String Ghafar07198_Email,String Ghafar07198_Password){
        int loop=0;
        if(datapenggunaEntityArrayList.size()==0){
            loop=-1;
        }else{
            for(int a=0;a<datapenggunaEntityArrayList.size();a++){
                if(datapenggunaEntityArrayList.get(a).getEmail().equals(Ghafar07198_Email)&&datapenggunaEntityArrayList.get(a).getPassword().equals(Ghafar07198_Password)){
                    loop=a;
                    break;
                }else{
                    loop=-2;
                }
            }
        }
        return loop;
    }
     
     public int hapusnama(String Ghafar07198_email){
           int Status;
      if(cariemail(Ghafar07198_email)!=-1){
           int index =cariemail(Ghafar07198_email);
           datapenggunaEntityArrayList.remove(index);
           Status=1;
      }else{
           Status =0;
          
      }
      return Status;
   }
     
    public int update(String Ghafar07198_emaillama,String Ghafar07198_email){
        int Status;
        if(cariemail(Ghafar07198_emaillama)!=-1){     
            datapenggunaEntityArrayList.get(cariemail(Ghafar07198_emaillama)).setEmail(Ghafar07198_email);
            Status=1;
       }else{
            Status=0;
       }
       return Status;
   }
     
      private int cariemail(String email){
       int indeks=-1;
       
       for(int a=0;a<datapenggunaEntityArrayList.size();a++){
           if(email.equals(datapenggunaEntityArrayList.get(a).getEmail())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
      public void InsertDataPengguna(Ghafar07198_DataPenggunaEntity dataPenggunaEntity){
          datapenggunaEntityArrayList.add(dataPenggunaEntity);
      }
      
      public int Ghafar07198_GetArrayListDataPenggunaSize(){
          int index;
          return  index=datapenggunaEntityArrayList.size();
      }
      public Ghafar07198_DataPenggunaEntity Ghafar07198_Costumer(int index){
        return datapenggunaEntityArrayList.get(index);
    }
      public boolean Ghafar07198_GetArrayListDataPenggunaIsEmpty(){
          return datapenggunaEntityArrayList.isEmpty();
      }
    
    
}
