package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing an s element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-s-element">4.5.5 The s element</a>
 */
public final class S extends XhtmlElementWithMixedContent<S> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public S() {
        super();
    }

    /**
     * Constructs an s element with a string as its content.
     *
     * @param content A string.
     */
    public S(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the s element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "s";
    }
}
