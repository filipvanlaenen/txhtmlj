package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithMixedContent;

/**
 * A class representing a sup element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-sub-and-sup-elements">4.5.19 The
 *      sub and sup elements</a>
 */
public final class Sup extends ElementWithMixedContent implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Sup() {
        super();
    }

    /**
     * Constructs a sup element with a string as its content.
     *
     * @param content A string.
     */
    public Sup(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the sup element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "sup";
    }
}
