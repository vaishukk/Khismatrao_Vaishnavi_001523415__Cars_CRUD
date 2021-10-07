/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kiran
 */
public class Cars {
    
    private String carModelName;
    private String manufacturer;
    private long manufacturingYear;
    private int seats;
    private String vehicleLicensePlate;
    private String colour;
    private String carAvailability;
    private String maintenanceExpiration;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(long manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String getMaintenanceExpiration() {
        return maintenanceExpiration;
    }

    public void setMaintenanceExpiration(String maintenanceExpiration) {
        this.maintenanceExpiration = maintenanceExpiration;
    }
    
    @Override
    public String toString(){
        return carModelName;
    }
    
    
    
}
