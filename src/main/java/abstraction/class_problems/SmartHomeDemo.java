package abstraction.class_problems;

/**
 * SmartHomeDemo
 *
 * Session 8 - Wrap-up: the whole smart home in one program. Device supplies
 * shared IS-A identity + code; Remoteable layers CAN-DO capability across
 * classes with no shared ancestry; BasicLamp proves IS-A never obligates
 * CAN-DO.
 *
 * Expected output (PDF p9):
 * LIGHT-01 is now ON / glowing at 100% / THERMO-01 ON / regulating 22.5 /
 * LAMP-01 ON / simply lit / power draw 45.5W / three HomeConnect lines.
 */
public class SmartHomeDemo {

    static void connectAllToApp(Remoteable[] devices, String appId) {
        for (Remoteable r : devices) {
            r.connectToApp(appId);
        }
    }

    public static void main(String[] args) {
        SmartLight light = new SmartLight("LIGHT-01");
        SmartThermostat thermostat = new SmartThermostat("THERMO-01", 22.5);
        BasicLamp lamp = new BasicLamp("LAMP-01");
        SmartDoorLock lock = new SmartDoorLock("LOCK-01");

        light.turnOn();
        light.performPrimaryAction();
        thermostat.turnOn();
        thermostat.performPrimaryAction();
        lamp.turnOn();
        lamp.performPrimaryAction();

        System.out.println("Thermostat power draw: " + thermostat.getPowerConsumption() + "W");

        Remoteable[] remoteDevices = { light, thermostat, lock };
        connectAllToApp(remoteDevices, "HomeConnect");
    }
}
