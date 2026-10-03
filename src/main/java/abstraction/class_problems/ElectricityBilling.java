package abstraction.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ElectricityBilling (Problem 4: Electricity Connection Billing).
 *
 * Abstraction design: {@code Connection} captures what every connection
 * shares (units used + type label) and declares the abstract
 * {@code calculateBill()}. Home / shop / factory each override it with their
 * own slab / fixed-charge / minimum-bill logic.
 */
abstract class Connection {
    protected final double units;
    protected final String type;

    protected Connection(String type, double units) {
        this.type = type;
        this.units = units;
    }

    public String getType() {
        return type;
    }

    /** Monthly bill in rupees. */
    public abstract double calculateBill();
}

class HomeConnection extends Connection {
    HomeConnection(double units) {
        super("HOME", units);
    }

    @Override
    public double calculateBill() {
        if (units <= 100) {
            return 5.0 * units;
        }
        return 5.0 * 100 + 7.0 * (units - 100);
    }
}

class ShopConnection extends Connection {
    ShopConnection(double units) {
        super("SHOP", units);
    }

    @Override
    public double calculateBill() {
        return 8.0 * units + 100.0;
    }
}

class FactoryConnection extends Connection {
    FactoryConnection(double units) {
        super("FACTORY", units);
    }

    @Override
    public double calculateBill() {
        return Math.max(6.0 * units, 1000.0);
    }
}

public class ElectricityBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        List<Connection> connections = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            String type = sc.next().toUpperCase();
            double units = sc.nextDouble();
            switch (type) {
                case "HOME":
                    connections.add(new HomeConnection(units));
                    break;
                case "SHOP":
                    connections.add(new ShopConnection(units));
                    break;
                case "FACTORY":
                    connections.add(new FactoryConnection(units));
                    break;
                default:
                    break;
            }
        }
        sc.close();

        double total = 0.0;
        for (Connection c : connections) {
            double bill = c.calculateBill();
            total += bill;
            System.out.printf("%s: %.2f%n", c.getType(), bill);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
