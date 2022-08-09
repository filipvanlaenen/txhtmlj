package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Svg</code> class.
 */
public class SvgTest {
    /**
     * Test verifying that a simple svg fragment is exported correctly.
     */
    @Test
    void simpleSvgFragmentIsConvertedCorrectlyToString() {
        Svg svg = new Svg();
        svg.getSvg().viewBox(0, 1, 2, 3);
        assertEquals("<svg viewBox=\"0 1 2 3\"/>", svg.asString());
    }

    /**
     * Test verifying that the element name is correct.
     */
    @Test
    void elementNameShouldBeSvg() {
        assertEquals("svg", new Svg().getElementName());
    }
}
