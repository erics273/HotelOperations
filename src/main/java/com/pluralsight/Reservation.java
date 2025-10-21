package com.pluralsight;

public class Reservation {

    //create my class properties/attributes/fields
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    //this is the constructor that helps me create instances of this class (create a reservation)
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //getters and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    //derived getters
    public double getPrice(){
        /*
        Price is 139 if it is a king
        Price is 124 if its a double
         */

//        if(this.getRoomType().equalsIgnoreCase("king")){
//            return 139;
//        }else{
//            return 124;
//        }
//
        return this.getRoomType().equalsIgnoreCase("king") ? 139 : 124 ;
    }

    public double getReservationTotal(){
        /*
        the total is the price * the number of nights
        if it is the weekend then the price is increased by 10%
         */
        double total = this.getNumberOfNights() * this.getPrice();

        //handle the weekend increase
        if(this.isWeekend()){
            total = total + (total * .1);
        }

        return total;
    }

}
