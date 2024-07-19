package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a kbd element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-kbd-element">4.5.18 The kbd
 *      element</a>
 */
public final class Kbd extends XhtmlElementWithMixedContent<Kbd> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Kbd() {
        super();
    }

    /**
     * Constructs a kbd element with a string as its content.
     *
     * @param content A string.
     */
    public Kbd(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the kbd element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "kbd";
    }
}
