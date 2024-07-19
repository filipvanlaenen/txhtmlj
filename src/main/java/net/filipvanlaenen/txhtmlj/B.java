package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a b element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-b-element">4.5.21 The b
 *      element</a>
 */
public final class B extends XhtmlElementWithMixedContent<B> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public B() {
        super();
    }

    /**
     * Constructs a b element with a string as its content.
     *
     * @param content A string.
     */
    public B(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the b element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "b";
    }
}
