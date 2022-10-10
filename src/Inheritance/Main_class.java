package Inheritance;
import java.io.*;

public class Main_class {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        // object: sub class
        sub_class sub = new sub_class(null, null, 0);
        
        try 
        {
            System.out.print("Isi Nama : ");
            String n = br.readLine();
            System.out.print("Isi Keterangan : ");
            String k = br.readLine();
            System.out.print("Isi Tinggi : ");
            int t = Integer.parseInt(br.readLine());
            
            //masukan variabel kedalam parameter object
            sub = new sub_class(n, k, t);
            
            //cetak data lengkap
            sub.dataLengkap();
            
            //panggil method cetak dan halo
            sub.cetak();
            sub.halo();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}