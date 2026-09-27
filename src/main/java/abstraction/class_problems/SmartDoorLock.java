package abstraction.class_problems;

/**
 * SmartDoorLock
 *
 * Session 8 - Section 2: A capability that does not need a Device at all.
 * Not a Device, yet fully Remoteable, so it works in a Remoteable[] array
 * and in connectAllToApp(...) which only asks for the capability.
 */
public class SmartDoorLock implements Remoteable {

    private String lockId;

    public SmartDoorLock(String lockId) {
        this.lockId = lockId;
    }

    @Override
    public void connectToApp(String appId) {
        System.out.println(lockId + " connected to app: " + appId);
    }
}
