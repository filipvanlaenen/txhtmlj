package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Table</code> class.
 */
public class TableTest {
    /**
     * Test verifying that a simple table with a body is exported correctly.
     */
    @Test
    void simpleTableWithTBodyIsConvertedCorrectlyToString() {
        Table table = new Table();
        table.addElement(new TBody());
        assertEquals("<table>\n  <tbody/>\n</table>", table.asString());
    }

    /**
     * Test verifying that a table with a caption, a head and a body is exported correctly.
     */
    @Test
    void tableWithCaptionTHeadAndTBodyIsConvertedCorrectlyToString() {
        Table table = new Table();
        table.addElement(new Caption());
        table.addElement(new THead());
        table.addElement(new TBody());
        assertEquals("<table>\n  <caption/>\n  <thead/>\n  <tbody/>\n</table>", table.asString());
    }

    /**
     * Test verifying that a simple table with a body and class is exported correctly.
     */
    @Test
    void simpleTableWithTBodyAndClassIsConvertedCorrectlyToString() {
        Table table = new Table().clazz("foo");
        table.addElement(new TBody());
        assertEquals("<table class=\"foo\">\n  <tbody/>\n</table>", table.asString());
    }
}
