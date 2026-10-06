package session_9_AssignmentProblems;

import java.util.Scanner;

interface NightService {
    double applyNightCharge(double fare);
}

abstract class Cab {

    double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double getRate();

    double calculateFare() {

        double fare = km * getRate();

        if (fare < 100) {
            fare = 100;
        }

        return fare;
    }
}

class MiniCab extends Cab {

    MiniCab(double km) {
        super(km);
    }

    double getRate() {
        return 10;
    }
}

class SedanCab extends Cab implements NightService {

    SedanCab(double km) {
        super(km);
    }

    double getRate() {
        return 14;
    }

    public double applyNightCharge(double fare) {
        return fare * 1.20;
    }
}

class SUVCab extends Cab implements NightService {

    SUVCab(double km) {
        super(km);
    }

    double getRate() {
        return 18;
    }

    public double applyNightCharge(double fare) {
        return fare * 1.20;
    }
}

public class CityCabFareMeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String cabType = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            Cab cab;

            if (cabType.equals("MINI")) {
                cab = new MiniCab(km);
            } else if (cabType.equals("SEDAN")) {
                cab = new SedanCab(km);
            } else {
                cab = new SUVCab(km);
            }

            if (time.equals("NIGHT") && !(cab instanceof NightService)) {

                System.out.println(cabType + ": night service not available");
                continue;
            }

            double fare = cab.calculateFare();

            if (time.equals("NIGHT")) {
                fare = ((NightService) cab).applyNightCharge(fare);
            }

            System.out.printf("%s: %.2f%n", cabType, fare);

            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}