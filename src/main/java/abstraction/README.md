# abstraction

Topic: **Abstraction, Interface, Class vs Interface (Smart Home)** — STEP Semester 3, Session 8.

## Folder layout (per STEP spec)

- `class_problems/`     - problems solved live in the lab session.
- `assigment_problems/` - take-home assignments. *(Spelling preserved per the STEP GitHub guide.)*

## Session 8 - class problems (Category C)

| # | File | What it does | Key signature |
|---|------|--------------|---------------|
| S1 | `Device.java` | Abstract base: shared `deviceId`/`powerOn` + concrete `turnOn()`/`turnOff()`, abstract `performPrimaryAction()`. Never instantiated directly. | `public abstract void performPrimaryAction()` |
| S2 | `Remoteable.java` | Pure capability: connect any class to an app, no shared ancestor needed. | `void connectToApp(String appId)` |
| S2 | `Schedulable.java` | Schedulability capability layered via `implements`. | `void scheduleAction(String time)` |
| S2 | `EnergyMonitorable.java` | Power-reporting capability (fields would be `public static final` constants). | `double getPowerConsumption()` |
| S2 | `SmartLight.java` | IS-A Device + CAN-DO Remoteable, Schedulable. | `extends Device implements Remoteable, Schedulable` |
| S2 | `SmartThermostat.java` | Extends ONE class, implements THREE interfaces (Java multiple inheritance of capability). | `extends Device implements Remoteable, Schedulable, EnergyMonitorable` |
| S4 | `BasicLamp.java` | IS-A Device with no `implements`: full identity, zero extra capabilities. | `extends Device` |
| S2 | `SmartDoorLock.java` | Remoteable without being a Device; works in `Remoteable[]`. | `implements Remoteable` |
| S5 | `HomeHubLogger.java` | Plain class: exactly one kind of thing, nothing varies. | `void log(String message)` |
| Wrap | `SmartHomeDemo.java` | Whole ecosystem at once + `connectAllToApp(Remoteable[], appId)`. | `static void connectAllToApp(Remoteable[], String)` |

## Sample Input / Output (verified, PDF p9)

| Step | Output |
|------|--------|
| light on/action | `LIGHT-01 is now ON` / `LIGHT-01 is glowing at 100% brightness` |
| thermostat on/action | `THERMO-01 is now ON` / `THERMO-01 is regulating temperature to 22.5 degrees` |
| lamp on/action | `LAMP-01 is now ON` / `LAMP-01 is simply lit, nothing fancy` |
| power | `Thermostat power draw: 45.5W` |
| remote all | `LIGHT-01 connected to app: HomeConnect` / `THERMO-01 connected to app: HomeConnect` / `LOCK-01 connected to app: HomeConnect` |

## Concepts covered

- Abstract class: real fields/code + unfinished abstract methods; constructor via `super(...)`; never `new Device(...)`; concrete subclass must implement every abstract method or be abstract (S1).
- Interface: pure contract, no state/constructor; fields implicitly `public static final`; one class can implement many interfaces (S2).
- Abstract vs interface: shared state+code across a family (IS-A, single extends) vs shared capability across unrelated classes (CAN-DO, multiple implements) (S3).
- IS-A (`extends`, singular/permanent) vs CAN-DO (`implements`, plural/optional); new capabilities added as interfaces without touching the hierarchy (S4).
- Choosing: plain class (nothing varies) / abstract class (family + shared code, one differing behavior) / interface (capability across unrelated classes or several on one class) (S5).
