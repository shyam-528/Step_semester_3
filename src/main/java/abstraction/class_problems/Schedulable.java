package abstraction.class_problems;

/**
 * Schedulable
 *
 * Session 8 - Section 2: Schedulability capability, layerable onto any class
 * via implements, independent of the Device hierarchy.
 */
public interface Schedulable {
    void scheduleAction(String time);
}
