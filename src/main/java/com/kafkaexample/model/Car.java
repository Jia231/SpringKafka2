package com.kafkaexample.model;

public class Car{
    private String make;
    private String manufacturer;
    private String id;

    public Car(){
        super();
    }

    public Car(String make,String manufacturer,String id){
        super();
        this.make = make;
        this.manufacturer = manufacturer;
        this.id = id;
    }

    public String getMake(){
        return this.make;
    }

    public void setMake(String make){
        this.make = make;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id=id;
    }
    @Override
    public String toString(){
        return "Car [make="+make+", manufacturer="+manufacturer+", id="+id+"]";
    }
}