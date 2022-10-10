package TugasPBO;
import java.io.*;

public class MainClass {

    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String tanya = "";
        try 
        {
            do{
                String a,b,c,d,e,f;
                int price = 0;
                int jml = 0;
                
                System.out.println("--- PEMESANAN TIKET ---");
                System.out.print("Masukan Jumlah Penumpang : ");
                jml = Integer.parseInt(br.readLine());

                System.out.print("Kota Asal : ");
                String kotaAsal = br.readLine();

                System.out.println("Pilihan rute tujuan : ");
                System.out.println("Bali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar, Jakarta");
                System.out.print("Tujuan : ");
                String tujuan = br.readLine();


                System.out.print("Tanggal Berangkat : ");
                String tglBrngkt = br.readLine();

                System.out.print("Pesan Pulang-Pergi ? [y/n] : ");
                String pilihan = br.readLine();
                String tglPlg = "";
                if(pilihan.equalsIgnoreCase("y")){
                    System.out.print("Tanggal Pulang : ");
                    tglPlg = br.readLine();
                }

                System.out.println("");
                System.out.println("-- Pilih Maskapai --");
                System.out.println("Lion Air [la]");
                System.out.println("Citilink [cl]");
                System.out.print("Pilih Maskapai : ");
                String namaMaskapai = br.readLine();



                if(namaMaskapai.equalsIgnoreCase("la"))
                {   
                    LionAir la[] = new LionAir[jml];
                    for(int i=0; i<jml; i++)
                    {
                        System.out.println("-- Selamat datang di Lion Air --");
                        System.out.println("Silahkan Isi Data Penumpang");

                        System.out.print("Booking ID : ");
                        a = br.readLine();
                        System.out.print("NIK : ");
                        b = br.readLine();
                        System.out.print("Nama : ");
                        c = br.readLine();
                        System.out.print("Jenis Kelamin : ");
                        d = br.readLine();
                        System.out.print("No Pesawat : ");
                        e = br.readLine();
                        System.out.print("No Kursi : ");
                        f = br.readLine();
                        System.out.println("");

                        la[i] = new LionAir
                        (a, b, c, d, tglBrngkt, tglPlg, kotaAsal, tujuan, e, f, jml, price);
    //                    (String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal,
    //                    String kotaTujuan, String noPesawat, String noKursi, int jumlahPenumpang, int harga)
                    }

                    //output
                    System.out.println("-- Preview Tiket LION AIR --");
                    System.out.println("============================");
                    for (int j = 0; j < jml; j++) {
                        la[j].getData1();
                    }
                    la[0].getTotal1();
                }




                else if(namaMaskapai.equalsIgnoreCase("cl"))
                {   
                    Citilink cl[] = new Citilink[jml];
                    for(int i=0; i<jml; i++)
                    {
                        System.out.println("-- Selamat datang di Citilink --");
                        System.out.println("Silahkan Isi Data Penumpang");

                        System.out.print("Booking ID : ");
                        a = br.readLine();
                        System.out.print("NIK : ");
                        b = br.readLine();
                        System.out.print("Nama : ");
                        c = br.readLine();
                        System.out.print("Jenis Kelamin : ");
                        d = br.readLine();
                        System.out.print("No Pesawat : ");
                        e = br.readLine();
                        System.out.print("No Kursi : ");
                        f = br.readLine();
                        System.out.println("");

                        cl[i] = new Citilink
                        (a, b, c, d, tglBrngkt, tglPlg, kotaAsal, tujuan, e, f, jml, price);
    //                    (String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal,
    //                    String kotaTujuan, String noPesawat, String noKursi, int jumlahPenumpang, int harga)
                    }

                    //output
                    System.out.println("-- Preview Tiket LION AIR --");
                    System.out.println("============================");
                    for (int j = 0; j < jml; j++) {
                        cl[j].getData2();
                    }
                    cl[1].getTotal2();
                }
                
                System.out.print("Pesan lagi ?[y/n] : ");
                tanya = br.readLine();
            }while(tanya.equalsIgnoreCase("y"));
            
            
        } catch (Exception g) {
            System.out.println(g);
        }
    }
    
}
