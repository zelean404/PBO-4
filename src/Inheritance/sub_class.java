package Inheritance;

public class sub_class extends super_class {

    private int tinggi;
    
    //constructor berparamter dari super dan sub class
    public sub_class(String nama, String keterangan, int tinggi){
        super(nama, keterangan);
        this.tinggi = tinggi;
    }
    
    //getter
    public int getTinggi() {
        return tinggi;
    }
    
    //custom method
    public void dataLengkap(){
        System.out.println
        (super.getNama() +" "+ super.getKeterangan() +" "+ getTinggi());
    }
    
    @Override
    public void cetak() {
        super.cetak(); 
    }

    @Override
    public void halo() {
        super.halo(); 
    }
    
    
}
