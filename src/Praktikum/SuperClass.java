package Praktikum;


public class SuperClass {
    //atribut
    private String id, namaAT;
    
    //constructor
    public SuperClass(String id, String namaAT) {
        this.id = id;
        this.namaAT = namaAT;
    }
    
    
    //getter
    public String getId() {
        return id;
    }
    public String getNamaAT() {
        return namaAT;
    }
}
