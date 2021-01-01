package Controller07198;
import Entity07198.*;
public class Ghafar07198_UserController implements Ghafar07198_ControllerInterface  {
public Ghafar07198_AllObjectModel allObject =new Ghafar07198_AllObjectModel();
    public Ghafar07198_UserController() {
    }
    public int Ghafar07198_GetArrayListDataPenggunaSize(){
        return allObject.UserModel.Ghafar07198_GetArrayListDataPenggunaSize();
    }
    public boolean Ghafar07198_GetArrayListDataPenggunaIsEmpty(){
        return allObject.UserModel.Ghafar07198_GetArrayListDataPenggunaIsEmpty();
    } 
    public int update(String Ghafar07198_nama,String Ghafar07198_email){
       return  allObject.UserModel.update(Ghafar07198_nama, Ghafar07198_email);   
    }
    public Ghafar07198_DataPenggunaEntity Ghafar07198_Costumer(int Ghafar07198_index){
        return allObject.UserModel.Ghafar07198_Costumer(Ghafar07198_index);
    }
    public int hapus(String Ghafar07198_nama){
        return  allObject.UserModel.hapusnama(Ghafar07198_nama);
    }
    @Override
    public int loginUser(String Ghafar07198_email,String Ghafar07198_password){  
        return allObject.UserModel.CekData(Ghafar07198_email, Ghafar07198_password);
    }
    public void InsertDataPengguna(String Ghafar07198_email, String Ghafar07198_nama, String Ghafar07198_password, String Ghafar07198_jeniskelamin){
        allObject.UserModel.InsertDataPengguna(new  Ghafar07198_DataPenggunaEntity(Ghafar07198_email,Ghafar07198_nama,Ghafar07198_password,Ghafar07198_jeniskelamin));
    }
    public void InsertDataTabungan(int Ghafar07198_jangkawaktuterkumpul1, int Ghafar07198_target, int Ghafar07198_menabung, int Ghafar07198_sekalamenabung){
        allObject.TabunganPintar.InsertDataTabunganPintar(new Ghafar07198_DataTabunganEntity(Ghafar07198_jangkawaktuterkumpul1,Ghafar07198_target,Ghafar07198_menabung,Ghafar07198_sekalamenabung));
    }
}
