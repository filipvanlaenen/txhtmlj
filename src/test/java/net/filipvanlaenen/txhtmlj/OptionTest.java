package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Option</code> class.
 */
public class OptionTest {
    /**
     * Test verifying that a simple option with a content and a value is exported correctly.
     */
    @Test
    public void shouldExportOptionWithContentAndValueCorrectlyToString() {
        Option option = new Option("Foo").value("foo");
        assertEquals("<option value=\"foo\">Foo</option>", option.asString());
    }

    /**
     * Test verifying that a simple option with a content, a value and a class is exported correctly.
     */
    @Test
    public void shouldExportOptionWithContentValueAndClassCorrectlyToString() {
        Option option = new Option("Foo").value("foo").clazz("bar");
        assertEquals("<option class=\"bar\" value=\"foo\">Foo</option>", option.asString());
    }
}
