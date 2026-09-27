package oops.class_problems;

/**
 * PlacementRecord
 *
 * Session 7 - Category C, M1: Student Placement Record Management.
 *
 * Rebuilds parallel-array placement tracking the OOP way with a
 * PlacementRecord class (studentName, company, packageLpa), a constructor
 * setting all three fields, and printRecord() printing one formatted line.
 */
public class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        PlacementRecord[] records = {
            new PlacementRecord("Ravi", "TCS", 4.5),
            new PlacementRecord("Anitha", "Zoho", 6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };
        for (PlacementRecord r : records) {
            r.printRecord();
        }
    }
}
