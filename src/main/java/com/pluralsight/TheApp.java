package com.pluralsight;

public class TheApp {
    public static void main(String[] args) {

        //testing our room
        Room potatoRoom = new Room(2, 100.00, false, false);

        //is it available?
        System.out.println("is the room available:" + potatoRoom.isAvailable());

        //if statement similar to above
        if(potatoRoom.isAvailable()){
            System.out.println("Yaya the room is available");
        }else{
            System.out.println("sucks for you, no room available");
        }

        //change property to make the room not available
        potatoRoom.setDirty(true);

        //is it available?
        System.out.println("is the room available:" + potatoRoom.isAvailable());


        //testing the reservation
        Reservation pototaReservation = new Reservation("king", 1, false);

        //check the price
        System.out.println(pototaReservation.getPrice());

        //check the reservation total
        System.out.println(pototaReservation.getReservationTotal());

        //change to a weekend
        pototaReservation.setWeekend(true);

        //check the price
        System.out.println(pototaReservation.getPrice());

        //check the reservation total
        System.out.println(pototaReservation.getReservationTotal());

        //change number of nights
        pototaReservation.setNumberOfNights(2);

        //check the reservation total
        System.out.println(pototaReservation.getReservationTotal());


        //test the employee
        Employee potatoEmployee = new Employee(1, "Eric", "Front Desk", 10.00, 40);

        //print out regular hours
        System.out.println(potatoEmployee.getHoursWorked());

        //print out OT hours
        System.out.println(potatoEmployee.getOvertimeHours());

        //print total pay
        System.out.println(potatoEmployee.getTotalPay());

        //add another hour so there is overtime
        potatoEmployee.setHoursWorked(41);

        //print out regular hours
        System.out.println(potatoEmployee.getHoursWorked());

        //print out OT hours
        System.out.println(potatoEmployee.getOvertimeHours());

        //print total pay
        System.out.println(potatoEmployee.getTotalPay());

        //test punch in/out methods
        potatoEmployee.punchIn(13);
        potatoEmployee.punchOut(14);

        System.out.println(potatoEmployee.getHoursWorked());

        //test punch time card method
        potatoEmployee.punchTimeCard(13, 14);
        System.out.println(potatoEmployee.getHoursWorked());
    }
}
