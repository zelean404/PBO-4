package Praktikum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        try 
        {
            System.out.print("Input Jumlah Data : ");
            int j = Integer.parseInt(br.readLine());
            Alat_tulis at[] = new Alat_tulis[j];
            
            //input
            for (int i = 0; i < at.length; i++) 
            {
                System.out.println("-- Input Data --");
                System.out.print("Input ID: ");
                String id = br.readLine();
                System.out.print("Input Nama: ");
                String nama = br.readLine();
                System.out.print("Input Merk: ");
                String merk = br.readLine();
                System.out.print("Input Fungsi: ");
                String fungsi = br.readLine();
                System.out.print("Input Warna: ");
                String warna = br.readLine();
                System.out.print("Input Jumlah: ");
                int jumlah = Integer.parseInt(br.readLine());
                System.out.print("Input Harga: ");
                int harga = Integer.parseInt(br.readLine());
                
                at[i] = new Alat_tulis(id, nama, fungsi, warna, merk, jumlah, harga);
            }
            //output
            for (int i = 0; i < at.length; i++) {
                //cetak method getData dari class employee
                at[i].getData1();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
