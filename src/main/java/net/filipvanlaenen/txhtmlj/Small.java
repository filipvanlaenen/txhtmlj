package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a small element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-small-element">4.5.4 The small
 *      element</a>
 */
public final class Small extends XhtmlElementWithMixedContent<Small> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Small() {
        super();
    }

    /**
     * Constructs a small element with a string as its content.
     *
     * @param content A string.
     */
    public Small(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the small element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "small";
    }
}
