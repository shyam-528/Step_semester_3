package abstraction.class_problems;

/**
 * EnergyMonitorable
 *
 * Session 8 - Section 2: Power-reporting capability. A future SmartPlug
 * could implement this without ever being a Device, just as SmartDoorLock
 * implements Remoteable without being a Device.
 */
public interface EnergyMonitorable {
    double getPowerConsumption();
}
