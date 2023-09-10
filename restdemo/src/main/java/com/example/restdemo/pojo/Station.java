package com.example.restdemo.pojo;

public class Station {

    private String name;
    private String location;

    private  Integer id;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private static Integer idIncrement = 0;


    public Station(String name, String location) {
        this.name = name;
        this.location = location;
        this.id = Station.idIncrement++ + 1;        
    }    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
