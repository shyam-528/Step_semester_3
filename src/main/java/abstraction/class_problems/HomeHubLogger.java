package abstraction.class_problems;

/**
 * HomeHubLogger
 *
 * Session 8 - Section 5 (Use Cases): Plain concrete class is enough when
 * there is exactly one kind of thing with no variation expected.
 */
public class HomeHubLogger {

    public void log(String message) {
        System.out.println("[HUB] " + message);
    }
}
