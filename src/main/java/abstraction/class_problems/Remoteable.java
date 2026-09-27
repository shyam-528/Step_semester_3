package abstraction.class_problems;

/**
 * Remoteable
 *
 * Session 8 - Section 2: Pure capability contract. Any class can adopt it
 * regardless of ancestry (lights, thermostats, even a SmartDoorLock that is
 * not a Device at all).
 */
public interface Remoteable {
    void connectToApp(String appId);
}
