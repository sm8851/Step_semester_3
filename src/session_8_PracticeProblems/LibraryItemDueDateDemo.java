package session_8_PracticeProblems;

import java.time.LocalDate;
import java.util.Scanner;

abstract class LibraryItem {

    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract LocalDate getDueDate();
}

class Book extends LibraryItem {

    Book(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(14);
    }
}

class DVD extends LibraryItem {

    DVD(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(7);
    }
}

class Magazine extends LibraryItem {

    Magazine(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(3);
    }
}

public class LibraryItemDueDateDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            sc.nextLine();

            String title = sc.nextLine().replace("\"", "");

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book(title);
            } else if (type.equals("DVD")) {
                item = new DVD(title);
            } else {
                item = new Magazine(title);
            }

            System.out.println(title + ": " + item.getDueDate());
        }
    }
}