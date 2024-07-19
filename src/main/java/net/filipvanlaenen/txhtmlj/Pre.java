package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a block of preformatted text.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-pre-element">4.4.3 The pre element</a>
 */
public final class Pre extends XhtmlElementWithMixedContent<Pre> implements FlowContent {
    /**
     * Default constructor.
     */
    public Pre() {
        super();
    }

    /**
     * Constructs a pre element with a string as its content.
     *
     * @param content A string.
     */
    public Pre(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the block of preformatted text.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "pre";
    }
}
