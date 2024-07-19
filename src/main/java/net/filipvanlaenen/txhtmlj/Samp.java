package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a samp element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-samp-element">4.5.17 The samp
 *      element</a>
 */
public final class Samp extends XhtmlElementWithMixedContent<Samp> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Samp() {
        super();
    }

    /**
     * Constructs a samp element with a string as its content.
     *
     * @param content A string.
     */
    public Samp(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the samp element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "samp";
    }
}
