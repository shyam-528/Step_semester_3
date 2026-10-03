package abstraction.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * LibraryFineCounter (Problem 3: Library Late Fine Counter).
 *
 * Abstraction design: {@code LibraryItem} defines the common structure
 * (title + daysLate) and mandates {@code calculateFine()}. Each item type
 * (book / DVD / magazine) implements its own fine rule, including the DVD cap.
 */
abstract class LibraryItem {
    protected final String title;
    protected final int daysLate;

    protected LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    public String getTitle() {
        return title;
    }

    /** Fine in rupees for this item. */
    public abstract double calculateFine();
}

class BookItem extends LibraryItem {
    BookItem(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double calculateFine() {
        return 2.0 * daysLate;
    }
}

class DvdItem extends LibraryItem {
    DvdItem(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double calculateFine() {
        return Math.min(5.0 * daysLate, 50.0);
    }
}

class MagazineItem extends LibraryItem {
    MagazineItem(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double calculateFine() {
        return 1.0 * daysLate;
    }
}

public class LibraryFineCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        List<LibraryItem> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            String type = sc.next().toUpperCase();
            switch (type) {
                case "BOOK": {
                    String title = sc.next();
                    int days = sc.nextInt();
                    items.add(new BookItem(title, days));
                    break;
                }
                case "DVD": {
                    String title = sc.next();
                    int days = sc.nextInt();
                    items.add(new DvdItem(title, days));
                    break;
                }
                case "MAGAZINE": {
                    String title = sc.next();
                    int days = sc.nextInt();
                    items.add(new MagazineItem(title, days));
                    break;
                }
                default:
                    if (sc.hasNextLine()) sc.nextLine();
                    break;
            }
        }
        sc.close();

        double total = 0.0;
        for (LibraryItem item : items) {
            double fine = item.calculateFine();
            total += fine;
            System.out.printf("%s: %.2f%n", item.getTitle(), fine);
        }
        System.out.printf("Total Fines: %.2f%n", total);
    }
}
