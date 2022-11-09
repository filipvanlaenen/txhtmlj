package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndMixedContent;

/**
 * A class representing a paragraph.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-p-element">4.4.1 The p element</a>
 */
public final class P extends ElementWithAttributesAndMixedContent implements FlowContent {
    /**
     * Default constructor.
     */
    public P() {
        super();
    }

    /**
     * Constructs a p element with a string as its content.
     *
     * @param content A string.
     */
    public P(final String content) {
        super(content);
    }

    /**
     * Adds a span to the paragraph.
     *
     * @param span The span to be added.
     */
    public void addElement(final Span span) {
        super.addElement(span);
    }

    @Override
    public String getElementName() {
        return "p";
    }
}
