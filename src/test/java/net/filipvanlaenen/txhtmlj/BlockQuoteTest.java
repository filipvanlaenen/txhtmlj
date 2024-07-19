package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>BlockQuote</code> class.
 */
public class BlockQuoteTest {
    /**
     * Test verifying that a simple block quotation with text is exported correctly.
     */
    @Test
    void simpleBlockQuoteWithTextIsConvertedCorrectlyToString() {
        BlockQuote blockquote = new BlockQuote("Hello, world!");
        assertEquals("<blockquote>Hello, world!</blockquote>", blockquote.asString());
    }

    /**
     * Test verifying that a simple block quotation with a span element is exported correctly.
     */
    @Test
    void simpleBlockQuoteWithSpanIsConvertedCorrectlyToString() {
        BlockQuote blockquote = new BlockQuote();
        blockquote.addElement(new Span("Foo"));
        assertEquals("<blockquote>\n  <span>Foo</span>\n</blockquote>", blockquote.asString());
    }

    /**
     * Test verifying that a block quotation with text and ID is exported correctly.
     */
    @Test
    void blockQuoteWithTextAndIdIsConvertedCorrectlyToString() {
        BlockQuote blockquote = new BlockQuote("Foo").id("foo");
        assertEquals("<blockquote id=\"foo\">Foo</blockquote>", blockquote.asString());
    }

}
