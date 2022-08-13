package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Section</code> class.
 */
public class SectionTest {
    /**
     * Test verifying that a section with a simple paragraph with text is exported correctly.
     */
    @Test
    void sectionWithPWithTextShouldBeConvertedCorrectlyToString() {
        Section section = new Section();
        section.addElement(new P("Hello, world!"));
        assertEquals("<section>\n  <p>Hello, world!</p>\n</section>", section.asString());
    }
}
