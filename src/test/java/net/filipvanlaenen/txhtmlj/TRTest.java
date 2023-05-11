package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>TR</code> class.
 */
public class TRTest {
    /**
     * Test verifying that a table row with a table header cell is exported correctly.
     */
    @Test
    void tableRowWithTableHeaderCellIsConvertedCorrectlyToString() {
        TR tr = new TR();
        tr.addElement(new TH("Hello, world!"));
        assertEquals("<tr>\n  <th>Hello, world!</th>\n</tr>", tr.asString());
    }

    /**
     * Test verifying that a table row with a table data cell is exported correctly.
     */
    @Test
    void tableRowWithTableDataCellIsConvertedCorrectlyToString() {
        TR tr = new TR();
        tr.addElement(new TD("Hello, world!"));
        assertEquals("<tr>\n  <td>Hello, world!</td>\n</tr>", tr.asString());
    }

    /**
     * Test verifying that a table row with a custom data attribute and a table row with a table data cell is exported
     * correctly.
     */
    @Test
    void tableRowWithCustomDataAttributeIsConvertedCorrectlyToString() {
        TR tr = new TR().data("foo", "bar");
        tr.addElement(new TD("Hellow, world!"));
        assertEquals("<tr data-foo=\"bar\">\n  <td>Hellow, world!</td>\n</tr>", tr.asString());
    }
}
