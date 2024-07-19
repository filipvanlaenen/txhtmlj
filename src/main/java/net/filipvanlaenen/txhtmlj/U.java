package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a u element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-u-element">4.5.22 The u
 *      element</a>
 */
public final class U extends XhtmlElementWithMixedContent<U> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public U() {
        super();
    }

    /**
     * Constructs a u element with a string as its content.
     *
     * @param content A string.
     */
    public U(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the u element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "u";
    }
}
