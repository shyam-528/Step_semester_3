package oops.class_problems;

/**
 * IdCard
 *
 * Session 7 - Category C, M4: Library ID Card Management.
 *
 * Proves reference aliasing vs object identity: a second variable pointing
 * at the same object sees mutations, while a third object with identical
 * field values is still not == to the first.
 */
public class IdCard {
    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {
        IdCard ravi = new IdCard("Ravi", 0);
        IdCard duplicate = ravi;
        duplicate.booksIssued = 3;
        IdCard separate = new IdCard("Ravi", 3);

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}
