package com.pluralsight;

public class TheApp {
    public static void main(String[] args) {

        //testing our room
        Room potatoRoom = new Room(2, 100.00, false, false);

        //is it available?
        System.out.println("is the room available:" + potatoRoom.isAvailable());

        //change property to make the room not available
        potatoRoom.setDirty(true);

        //is it available?
        System.out.println("is the room available:" + potatoRoom.isAvailable());


        //testing the reservation
        Reservation pototaReservation = new Reservation()

    }
}
