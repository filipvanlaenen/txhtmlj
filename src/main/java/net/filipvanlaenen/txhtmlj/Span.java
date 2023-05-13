package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithContent;

/**
 * A class representing a span element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-span-element">4.5.26 The span
 *      element</a>
 */
public final class Span extends XhtmlElementWithContent<Span> implements FlowContent, PhrasingContent {
    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public Span(final String content) {
        super(content);
    }


    @Override
    public String getElementName() {
        return "span";
    }
}
