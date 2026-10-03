package abstraction.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * GardenPlotReport (Problem 1: Garden Plot Area Report).
 *
 * Abstraction design: common abstract base {@code Plot} holds the shared
 * state (owner + shape label) and declares {@code area()} without giving an
 * implementation. Each concrete shape (circle / rectangle / triangle) supplies
 * its own formula by overriding {@code area()}.
 *
 * The reporting code below only knows the {@code Plot} abstraction
 * (List&lt;Plot&gt; + plot.area()). Adding a new shape later means adding one
 * new subclass -- the report loop does NOT change (Open/Closed Principle).
 */
abstract class Plot {
    protected final String owner;
    protected final String shape;

    protected Plot(String owner, String shape) {
        this.owner = owner;
        this.shape = shape;
    }

    public String getOwner() {
        return owner;
    }

    public String getShape() {
        return shape;
    }

    /** Area in square units; implemented differently per shape. */
    public abstract double area();
}

class CirclePlot extends Plot {
    private final double radius;

    CirclePlot(String owner, double radius) {
        super(owner, "CIRCLE");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class RectanglePlot extends Plot {
    private final double length;
    private final double width;

    RectanglePlot(String owner, double length, double width) {
        super(owner, "RECTANGLE");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class TrianglePlot extends Plot {
    private final double base;
    private final double height;

    TrianglePlot(String owner, double base, double height) {
        super(owner, "TRIANGLE");
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class GardenPlotReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        List<Plot> plots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            String shape = sc.next().toUpperCase();
            switch (shape) {
                case "CIRCLE": {
                    String owner = sc.next();
                    double radius = sc.nextDouble();
                    plots.add(new CirclePlot(owner, radius));
                    break;
                }
                case "RECTANGLE": {
                    String owner = sc.next();
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    plots.add(new RectanglePlot(owner, length, width));
                    break;
                }
                case "TRIANGLE": {
                    String owner = sc.next();
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    plots.add(new TrianglePlot(owner, base, height));
                    break;
                }
                default:
                    // Unknown shape: skip rest of line to stay in sync.
                    if (sc.hasNextLine()) sc.nextLine();
                    break;
            }
        }
        sc.close();

        // Reporting code depends ONLY on the Plot abstraction.
        double total = 0.0;
        for (Plot p : plots) {
            double a = p.area();
            total += a;
            System.out.printf("%s (%s): %.2f%n", p.getOwner(), p.getShape(), a);
        }
        System.out.printf("Total Area: %.2f%n", total);
    }
}
