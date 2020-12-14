package Model07198;
import Entity07198.Ghafar07198_DataTabunganEntity;
import java.util.ArrayList;
public class Ghafar07198_DataTabunganModel {
    private ArrayList<Ghafar07198_DataTabunganEntity> datatabunganpintarEntityArrayList;
    public Ghafar07198_DataTabunganModel() {
        datatabunganpintarEntityArrayList= new ArrayList<Ghafar07198_DataTabunganEntity>();
    }
    public void InsertDataTabunganPintar(Ghafar07198_DataTabunganEntity dataTabunganPintarEntity){
        datatabunganpintarEntityArrayList.add(dataTabunganPintarEntity);
    }
}
