package session_9_PracticeProblems;

import java.util.Scanner;

abstract class Connection {

    int units;

    Connection(int units) {
        this.units = units;
    }

    abstract double calculateBill();
}

class HomeConnection extends Connection {

    HomeConnection(int units) {
        super(units);
    }

    double calculateBill() {

        if (units <= 100) {
            return units * 5;
        }

        return (100 * 5) + ((units - 100) * 7);
    }
}

class ShopConnection extends Connection {

    ShopConnection(int units) {
        super(units);
    }

    double calculateBill() {
        return (units * 8) + 100;
    }
}

class FactoryConnection extends Connection {

    FactoryConnection(int units) {
        super(units);
    }

    double calculateBill() {

        double bill = units * 6;

        if (bill < 1000) {
            return 1000;
        }

        return bill;
    }
}

public class ElectricityConnectionBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int units = sc.nextInt();

            Connection connection;

            if (type.equals("HOME")) {
                connection = new HomeConnection(units);
            } else if (type.equals("SHOP")) {
                connection = new ShopConnection(units);
            } else {
                connection = new FactoryConnection(units);
            }

            double bill = connection.calculateBill();

            System.out.printf("%s: %.2f%n", type, bill);

            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}