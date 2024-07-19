package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing an em element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-em-element">4.5.2 The em
 *      element</a>
 */
public final class Em extends XhtmlElementWithMixedContent<Em> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Em() {
        super();
    }

    /**
     * Constructs an em element with a string as its content.
     *
     * @param content A string.
     */
    public Em(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the em element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "em";
    }
}
