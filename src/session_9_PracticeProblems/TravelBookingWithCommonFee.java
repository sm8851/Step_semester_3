package session_9_PracticeProblems;

import java.util.Scanner;

abstract class Booking {

    protected static final double BOOKING_FEE = 50;
    protected double distance;

    Booking(double distance) {
        this.distance = distance;
    }

    abstract double calculateBaseFare();

    double calculateTotalFare() {
        return calculateBaseFare() + BOOKING_FEE;
    }
}

class BusBooking extends Booking {

    BusBooking(double distance) {
        super(distance);
    }

    double calculateBaseFare() {
        return distance * 2;
    }
}

class TrainBooking extends Booking {

    TrainBooking(double distance) {
        super(distance);
    }

    double calculateBaseFare() {
        return distance * 1.5;
    }
}

class FlightBooking extends Booking {

    FlightBooking(double distance) {
        super(distance);
    }

    double calculateBaseFare() {
        return 2500 + (distance * 4);
    }
}

public class TravelBookingWithCommonFee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String mode = sc.next();
            double distance = sc.nextDouble();

            Booking booking;

            if (mode.equals("BUS")) {
                booking = new BusBooking(distance);
            } else if (mode.equals("TRAIN")) {
                booking = new TrainBooking(distance);
            } else {
                booking = new FlightBooking(distance);
            }

            System.out.printf("%s: %.2f%n",
                    mode, booking.calculateTotalFare());
        }
    }
}