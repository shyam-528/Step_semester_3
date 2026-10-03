package abstraction.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * TravelBooking (Problem 5: Travel Booking with a Common Fee).
 *
 * Abstraction design: {@code Booking} is the single place where the common
 * booking fee lives ({@code BOOKING_FEE}). It provides the concrete template
 * method {@code getTotal()} = mode-specific fare + shared fee, while each
 * subclass implements only {@code calculateFare()}. Changing the fee means
 * editing exactly ONE line: the {@code BOOKING_FEE} constant.
 */
abstract class Booking {
    /** Shared fee added to EVERY booking -- change here only. */
    protected static final double BOOKING_FEE = 50.0;

    protected final double distanceKm;
    protected final String mode;

    protected Booking(String mode, double distanceKm) {
        this.mode = mode;
        this.distanceKm = distanceKm;
    }

    public String getMode() {
        return mode;
    }

    /** Mode-specific base fare WITHOUT the booking fee. */
    public abstract double calculateFare();

    /** Final amount the customer pays: fare + shared fee. */
    public double getTotal() {
        return calculateFare() + BOOKING_FEE;
    }
}

class BusBooking extends Booking {
    BusBooking(double distanceKm) {
        super("BUS", distanceKm);
    }

    @Override
    public double calculateFare() {
        return 2.0 * distanceKm;
    }
}

class TrainBooking extends Booking {
    TrainBooking(double distanceKm) {
        super("TRAIN", distanceKm);
    }

    @Override
    public double calculateFare() {
        return 1.5 * distanceKm;
    }
}

class FlightBooking extends Booking {
    FlightBooking(double distanceKm) {
        super("FLIGHT", distanceKm);
    }

    @Override
    public double calculateFare() {
        return 2500.0 + 4.0 * distanceKm;
    }
}

public class TravelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        List<Booking> bookings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            String mode = sc.next().toUpperCase();
            double distance = sc.nextDouble();
            switch (mode) {
                case "BUS":
                    bookings.add(new BusBooking(distance));
                    break;
                case "TRAIN":
                    bookings.add(new TrainBooking(distance));
                    break;
                case "FLIGHT":
                    bookings.add(new FlightBooking(distance));
                    break;
                default:
                    break;
            }
        }
        sc.close();

        for (Booking b : bookings) {
            System.out.printf("%s: %.2f%n", b.getMode(), b.getTotal());
        }
    }
}
