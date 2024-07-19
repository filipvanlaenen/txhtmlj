package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a mark element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-mark-element">4.5.23 The mark
 *      element</a>
 */
public final class Mark extends XhtmlElementWithMixedContent<Mark> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Mark() {
        super();
    }

    /**
     * Constructs a mark element with a string as its content.
     *
     * @param content A string.
     */
    public Mark(final String content) {
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
        return "mark";
    }
}
