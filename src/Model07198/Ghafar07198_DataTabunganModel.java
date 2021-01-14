package Model07198;
import Entity07198.Ghafar07198_DataTabunganEntity;
import java.util.ArrayList;
public class Ghafar07198_DataTabunganModel {
    public ArrayList<Ghafar07198_DataTabunganEntity> datatabunganpintarEntityArrayList;
    public Ghafar07198_DataTabunganModel() {
        datatabunganpintarEntityArrayList= new ArrayList<Ghafar07198_DataTabunganEntity>();
    }
    public void InsertDataTabunganPintar(Ghafar07198_DataTabunganEntity dataTabunganPintarEntity){
        datatabunganpintarEntityArrayList.add(dataTabunganPintarEntity);
    }
    public Ghafar07198_DataTabunganEntity Ghafar07198_TabunganPintar(int index){
        return datatabunganpintarEntityArrayList.get(index);
    }  
    public Ghafar07198_DataTabunganEntity Ghafar07198_ArraylistTabungan(int index){
        return datatabunganpintarEntityArrayList.remove(index);
    }
    public int Ghafar07198_hapus(int Target){
        int Status;
        if(Ghafar07198_cariTabungan(Target)!=-1){
           int index =Ghafar07198_cariTabungan(Target);
           datatabunganpintarEntityArrayList.remove(index); 
           Status=1;
      }else{
          Status =0;
      }
      return Status;
    }  
    public int Ghafar07198_cariTabungan(int Target){
        int indeks=-1;    
        for(int a=0;a< datatabunganpintarEntityArrayList.size();a++){
            if(Target==datatabunganpintarEntityArrayList.get(a).getTarget()){
                indeks=a;
                break;
            }
        }
        return indeks;
     }
}
