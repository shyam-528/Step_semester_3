package abstraction.class_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * WeeklyStaffPay (Problem 2: Weekly Staff Pay).
 *
 * Abstraction design: {@code Staff} is abstract so a generic "staff member"
 * with no pay rule can never be created (compiler forbids
 * {@code new Staff(...)}). It holds the shared state (name) and forces every
 * concrete subclass to define {@code calculatePay()}.
 */
abstract class Staff {
    protected final String name;

    protected Staff(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /** Weekly pay in rupees; each staff kind implements its own rule. */
    public abstract double calculatePay();
}

class FullTimeStaff extends Staff {
    private final double weeklySalary;

    FullTimeStaff(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculatePay() {
        return weeklySalary;
    }
}

class HourlyStaff extends Staff {
    private final double hours;
    private final double rate;

    HourlyStaff(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePay() {
        if (hours <= 40) {
            return hours * rate;
        }
        return 40 * rate + (hours - 40) * 1.5 * rate;
    }
}

class InternStaff extends Staff {
    private final double stipend;

    InternStaff(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    public double calculatePay() {
        return stipend;
    }
}

public class WeeklyStaffPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        List<Staff> staff = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            String kind = sc.next().toUpperCase();
            switch (kind) {
                case "FULLTIME": {
                    String name = sc.next();
                    double salary = sc.nextDouble();
                    staff.add(new FullTimeStaff(name, salary));
                    break;
                }
                case "HOURLY": {
                    String name = sc.next();
                    double hours = sc.nextDouble();
                    double rate = sc.nextDouble();
                    staff.add(new HourlyStaff(name, hours, rate));
                    break;
                }
                case "INTERN": {
                    String name = sc.next();
                    double stipend = sc.nextDouble();
                    staff.add(new InternStaff(name, stipend));
                    break;
                }
                default:
                    if (sc.hasNextLine()) sc.nextLine();
                    break;
            }
        }
        sc.close();

        double total = 0.0;
        for (Staff s : staff) {
            double pay = s.calculatePay();
            total += pay;
            System.out.printf("%s: %.2f%n", s.getName(), pay);
        }
        System.out.printf("Total Payroll: %.2f%n", total);
    }
}
