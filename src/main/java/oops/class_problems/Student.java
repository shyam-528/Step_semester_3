package oops.class_problems;

/**
 * Student
 *
 * Session 7 - Category C, M5: Student and College Information Management.
 *
 * Fixes duplicated college-name copies by using static collegeName shared
 * by every student, static studentCount incremented in the constructor,
 * and static printCollegeInfo() that touches only static state.
 */
public class Student {
    String name;
    int attendance;

    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 90);
        Student s2 = new Student("Anitha", 95);
        Student.printCollegeInfo();
    }
}
