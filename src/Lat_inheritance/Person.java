package Lat_inheritance;

public class Person {
    //atribut
    private String id, name, address;
    
    //constructor
    public Person(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    //getter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
