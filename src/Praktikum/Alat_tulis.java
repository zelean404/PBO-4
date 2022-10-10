package Praktikum;

public class Alat_tulis extends SuperClass
{
    //constructor berparamter dari super dan sub class
    private String merk, fungsi, warna;
    private int jumlah, harga;

    public Alat_tulis(String id, String namaAT, String fungsi, String warna, String merk, int jumlah, int harga) 
    {
        super(id, namaAT);
        this.merk = merk;
        this.fungsi = fungsi;
        this.warna = warna;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    public String getMerk() {
        return merk;
    }

    public int getJumlah() {
        return jumlah;
    }

    //getter
    public int getHarga() {    
        return harga;
    }

    public String getFungsi() {
        return fungsi;
    }
    public String getWarna() {
        return warna;
    }
    
    //custom method
    public void getData1()
    {
        System.out.println(super.getId()+" "+super.getNamaAT()+" "+getMerk());
        System.out.println(getJumlah()+" "+getHarga());
        System.out.println("Grand Total : " + getHarga()*getHarga());
    }
}