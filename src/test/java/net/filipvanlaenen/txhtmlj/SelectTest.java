package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Body</code> class.
 */
public class SelectTest {
    /**
     * Test verifying that a select with two options is exported correctly.
     */
    @Test
    public void shouldExportSelectWithTwoOptionsCorrectly() {
        Select select = new Select();
        select.addElement(new Option("Foo").value("foo"));
        select.addElement(new Option("Bar").value("bar"));
        StringBuffer sb = new StringBuffer();
        sb.append("<select>\n");
        sb.append("  <option value=\"foo\">Foo</option>\n");
        sb.append("  <option value=\"bar\">Bar</option>\n");
        sb.append("</select>");
        assertEquals(sb.toString(), select.asString());
    }

    /**
     * Test verifying that a select with an ID is exported correctly.
     */
    @Test
    public void shouldExportSelectWithAnIdCorrectly() {
        Select select = new Select().id("foo");
        assertEquals("<select id=\"foo\"/>", select.asString());
    }

    /**
     * Test verifying that a select with an onchange event is exported correctly.
     */
    @Test
    public void shouldExportSelectWithAnOnchangeCorrectly() {
        Select select = new Select().onchange("foo();");
        assertEquals("<select onchange=\"foo();\"/>", select.asString());
    }
}
