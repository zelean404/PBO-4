package Inheritance;

public class super_class {
    
    //atribut super class
    private String nama, keterangan;
    
    //constructor -> Alt+insert
    public super_class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    //getter
    public String getNama() {
        return nama;
    }
    public String getKeterangan() {
        return keterangan;
    }
    
    //---------------------------------------------------------------
    public void cetak() {
        System.out.println(getNama() + " " + getKeterangan());
    }
    
    public void halo(){
        System.out.println("Halo");
    }
}
