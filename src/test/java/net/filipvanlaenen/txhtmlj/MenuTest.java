package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Menu</code> class.
 */
public class MenuTest {
    /**
     * Test verifying that a simple list item in a menu is exported correctly.
     */
    @Test
    void simpleMenuWithLIIsConvertedCorrectlyToString() {
        Menu menu = new Menu();
        menu.addElement(new LI());
        assertEquals("<menu>\n  <li/>\n</menu>", menu.asString());
    }
}
