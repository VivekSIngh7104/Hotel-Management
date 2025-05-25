package model;

import java.io.Serializable;

public class Room implements Serializable {
    private String roomNumber;
    private String availability;
    private String cleaningStatus;
    private String bedType;
    private double price;
    

    
    public Room(String roomNumber, String availability, String cleaningStatus, double price, String bedType) {
        this.roomNumber = roomNumber;
        this.availability = availability;
        this.cleaningStatus = cleaningStatus;
        this.price = price;
        this.bedType = bedType;
    }

    public String getRoomNumber() { return roomNumber; }
    public String getAvailability() { return availability; }
    public String getCleaningStatus() { return cleaningStatus; }
    public double getPrice() { return price; }
    public String getBedType() { return bedType; }

    public void setAvailability(String availability) { this.availability = availability; }
    public void setCleaningStatus(String cleaningStatus) { this.cleaningStatus = cleaningStatus; }
    public void setPrice(double price) { this.price = price; }
    public void setBedType(String bedType) { this.bedType = bedType; }

    @Override
    public String toString() {
        return roomNumber + "," + availability + "," + cleaningStatus + "," + price + "," + bedType;
    }
} 