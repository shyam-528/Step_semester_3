package abstraction.class_problems;

/**
 * SmartThermostat
 *
 * Session 8: Extends ONE class (Device) but implements THREE interfaces at
 * once (Remoteable, Schedulable, EnergyMonitorable). This is what multiple
 * inheritance means in Java: multiple contracts, never multiple parents.
 */
public class SmartThermostat extends Device implements Remoteable, Schedulable, EnergyMonitorable {

    private double targetTemperature;

    public SmartThermostat(String deviceId, double targetTemperature) {
        super(deviceId);
        this.targetTemperature = targetTemperature;
    }

    @Override
    public void performPrimaryAction() {
        System.out.println(getDeviceId() + " is regulating temperature to " + targetTemperature + " degrees");
    }

    @Override
    public void connectToApp(String appId) {
        System.out.println(getDeviceId() + " connected to app: " + appId);
    }

    @Override
    public void scheduleAction(String time) {
        System.out.println(getDeviceId() + " scheduled at " + time);
    }

    @Override
    public double getPowerConsumption() {
        return 45.5;
    }
}
