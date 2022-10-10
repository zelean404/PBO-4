package Lat_inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_class {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //object: employee
//        Employee emp[] = new Employee[2];
        
        //deklarasi variabel
        String id, name, address, department, title;
        try 
        {
            //jumlah array ditentukan oleh user
            //1. entry jumlah array
            System.out.print("Masukan Jumlah Data : ");
            int jml = Integer.parseInt(br.readLine());
            
            //2. buat object
            Employee emp[] = new Employee[jml];
            
            //input
            for (int i = 0; i < emp.length; i++) 
            {
                System.out.print("Entry ID : ");
                id = br.readLine();
                System.out.print("Entry Name : ");
                name = br.readLine();
                System.out.print("Entry Address : ");
                address = br.readLine();
                System.out.print("Entry Title : ");
                title = br.readLine();
                System.out.println(" ");
                
                //masukan ke object
                emp[i] = new Employee
                (id, name, address, null, title);
            }
            
            //output
            for (int i = 0; i < 10; i++) {
                //cetak method getData dari class employee
                emp[i].getData();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
