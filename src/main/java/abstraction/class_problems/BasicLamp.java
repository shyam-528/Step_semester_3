package abstraction.class_problems;

/**
 * BasicLamp
 *
 * Session 8 - Section 4 (IS-A vs CAN-DO): Every bit as much a Device as
 * SmartLight (IS-A via extends) with no implements clause at all, so it
 * CAN-DO nothing extra: no Remoteable array, no scheduling, no power draw.
 */
public class BasicLamp extends Device {

    public BasicLamp(String deviceId) {
        super(deviceId);
    }

    @Override
    public void performPrimaryAction() {
        System.out.println(getDeviceId() + " is simply lit, nothing fancy");
    }
}
