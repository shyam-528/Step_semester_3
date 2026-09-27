package oops.class_problems;

/**
 * Course
 *
 * Session 7 - Category C, M3: Course Credit Management.
 *
 * Supports theory-only and theory+lab courses without duplicating setup
 * logic via constructor chaining: Course(code, title, credits) delegates
 * with this(..., 0) to Course(code, title, credits, labCredits).
 */
public class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        Course theory = new Course("21CSC201J", "Data Structures", 4);
        Course lab = new Course("21CSC205L", "DSA Lab", 3, 1);
        System.out.println(theory.code + " total credits: " + theory.totalCredits());
        System.out.println(lab.code + " total credits: " + lab.totalCredits());
    }
}
