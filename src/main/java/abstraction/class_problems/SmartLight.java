package abstraction.class_problems;

/**
 * SmartLight
 *
 * Session 8: IS-A Device (extends) plus CAN-DO Remoteable and Schedulable
 * (implements). Proves one class carrying several capabilities at once.
 */
public class SmartLight extends Device implements Remoteable, Schedulable {

    public SmartLight(String deviceId) {
        super(deviceId);
    }

    @Override
    public void performPrimaryAction() {
        System.out.println(getDeviceId() + " is glowing at 100% brightness");
    }

    @Override
    public void connectToApp(String appId) {
        System.out.println(getDeviceId() + " connected to app: " + appId);
    }

    @Override
    public void scheduleAction(String time) {
        System.out.println(getDeviceId() + " scheduled at " + time);
    }
}
