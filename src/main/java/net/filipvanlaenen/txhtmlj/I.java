package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithMixedContent;

/**
 * A class representing an i element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-i-element">4.5.20 The i
 *      element</a>
 */
public final class I extends ElementWithMixedContent implements FlowContent, PhrasingContent {
    /**
     * Constructs an i element with a string as its content.
     *
     * @param content A string.
     */
    public I(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the i element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "i";
    }
}
