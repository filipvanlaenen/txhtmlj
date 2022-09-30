package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Span</code> class.
 */
public class SpanTest {
    /**
     * Test verifying that a simple span with a content and a class is exported correctly.
     */
    @Test
    public void shouldExportSpanWithContentAndClassCorrectlyToString() {
        Span span = new Span("Foo").clazz("foo");
        assertEquals("<span class=\"foo\">Foo</span>", span.asString());
    }
}
