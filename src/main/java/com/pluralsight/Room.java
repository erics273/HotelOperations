package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
//        if(!this.isDirty() && !this.isOccupied()){
//            return true;
//        }
//
//        return false;

        return !this.isDirty() && !this.isOccupied();

    }

    //check-in method
    //Once a room has been checked in, it should be occupied and marked as dirty.
    public void checkIn() {
        this.setOccupied(true);
        this.setDirty(true);
    }

    //check-out method
    //When a guest checks out of a room it must first be cleaned by a housekeeper
    //before another guest can check into the room.
    public void checkOut() {
        this.cleanRoom();
        this.setOccupied(false);
    }

    //clean the room
    //set isDirty to false
    public void cleanRoom() {
        this.setDirty(false);
    }



}
