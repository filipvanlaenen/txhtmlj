package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndContent;

/**
 * A class representing a span element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-span-element">4.5.26 The span
 *      element</a>
 */
public final class Span extends ElementWithAttributesAndContent implements FlowContent, PhrasingContent {
    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public Span(final String content) {
        super(content);
    }

    /**
     * Sets the class.
     *
     * @param clazz The class.
     * @return The instance called.
     */
    public Span clazz(final String clazz) {
        addStringAttribute("class", clazz);
        return this;
    }

    @Override
    public String getElementName() {
        return "span";
    }
}
