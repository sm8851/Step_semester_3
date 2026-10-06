package session_9_AssignmentProblems;

import java.util.Scanner;

interface BusUser {
    double TRANSPORT_FEE = 12000;

    double getTransportFee();
}

abstract class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    abstract double calculateFee();
}

class DayScholar extends Student implements BusUser {

    DayScholar(String name) {
        super(name);
    }

    public double getTransportFee() {
        return TRANSPORT_FEE;
    }

    double calculateFee() {
        return 40000 + getTransportFee();
    }
}

class Hosteller extends Student {

    Hosteller(String name) {
        super(name);
    }

    double calculateFee() {
        return 40000 + 60000;
    }
}

class ScholarStudent extends Student implements BusUser {

    ScholarStudent(String name) {
        super(name);
    }

    public double getTransportFee() {
        return TRANSPORT_FEE;
    }

    double calculateFee() {
        return 20000 + getTransportFee();
    }
}

public class CollegeFeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalCollected = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();

            Student student;

            if (type.equals("DAY_SCHOLAR")) {
                student = new DayScholar(name);
            } else if (type.equals("HOSTELLER")) {
                student = new Hosteller(name);
            } else {
                student = new ScholarStudent(name);
            }

            double fee = student.calculateFee();

            System.out.printf("%s: %.2f%n", name, fee);

            totalCollected += fee;
        }

        System.out.printf("Total Collected: %.2f%n", totalCollected);
    }
}