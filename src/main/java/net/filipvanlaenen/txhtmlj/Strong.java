package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a strong element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-strong-element">4.5.3 The strong
 *      element</a>
 */
public final class Strong extends XhtmlElementWithMixedContent<Strong> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Strong() {
        super();
    }

    /**
     * Constructs a strong element with a string as its content.
     *
     * @param content A string.
     */
    public Strong(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the strong element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "strong";
    }
}
