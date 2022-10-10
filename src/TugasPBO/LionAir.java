package TugasPBO;

public class LionAir extends Tiket
{
    private int jumlahPenumpang, harga;
    private String kotaTujuan, noPesawat, noKursi;
    
    //constructor berparamter dari super dan sub class
    public LionAir
    (String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal, 
    String kotaTujuan, String noPesawat, String noKursi, int jumlahPenumpang, int harga)
    {
        super(bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jumlahPenumpang = jumlahPenumpang;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
        this.harga = harga;
    }
    
    
    //getter di sub class
    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public int getHarga() {
        if(super.getKotaAsal().equalsIgnoreCase("Surabaya"))
        {
            if(getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")){
                harga = 500000;
            }
            else if(getKotaTujuan().equalsIgnoreCase("Jakarta") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")){
                harga = 600000;
            }
            else if(getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")){
                harga = 700000;
            }
        }
        
        else if(super.getKotaAsal().equalsIgnoreCase("Jakarta"))
        {
            if(getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")){
                harga = 700000;
            }
            else if(getKotaTujuan().equalsIgnoreCase("Surabaya") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")){
                harga = 750000;
            }
            else if(getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")){
                harga = 800000;
            }
        }
        return harga;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }
    
    
    //custom method
    
    public void getData1(){
        System.out.println("Booking ID : " + super.getBookingID());
        System.out.println("NIK : " + super.getNik());
        System.out.println("Nama : " + super.getNama());
        System.out.println("Kota Asal : " + super.getKotaAsal());
        System.out.println("Kota Tujuan : " + getKotaTujuan());
        System.out.println("Tanggal Berangkat : " + super.getTglBerangkat());
        System.out.println("Tanggal Kembali : " + super.getTglKembali());
        System.out.println("Nomer Pesawat : " + getNoPesawat());
        System.out.println("Nomer kursi : " + getNoKursi());
        System.out.println("Harga Tiket : " + getHarga());
        System.out.println("");
    }
    
    public void getTotal1(){
        int t = getHarga() * getJumlahPenumpang();
        System.out.println("Grand Total : " + t);
    }
    
}
