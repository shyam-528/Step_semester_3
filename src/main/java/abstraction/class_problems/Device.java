package abstraction.class_problems;

/**
 * Device
 *
 * Session 8 - Section 1: Abstract class mixing shared state/code with one
 * unfinished promise. Holds deviceId + powerOn, concrete turnOn()/turnOff(),
 * and abstract performPrimaryAction() every concrete subclass must define.
 * Never instantiated directly; subclass constructors call super(deviceId).
 */
public abstract class Device {
    private String deviceId;
    private boolean powerOn;

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.powerOn = false;
    }

    protected String getDeviceId() {
        return deviceId;
    }

    public void turnOn() {
        powerOn = true;
        System.out.println(deviceId + " is now ON");
    }

    public void turnOff() {
        powerOn = false;
        System.out.println(deviceId + " is now OFF");
    }

    public abstract void performPrimaryAction();
}
