package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndMixedContent;

/**
 * A class representing a paragraph.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-p-element">4.4.1 The p element</a>
 */
public final class P extends ElementWithAttributesAndMixedContent implements FlowContent {
    /**
     * Default constructor.
     */
    public P() {
        super();
    }

    /**
     * Constructs a p element with a string as its content.
     *
     * @param content A string.
     */
    public P(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the paragraph.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "p";
    }

    /**
     * Sets the ID.
     *
     * @param id The ID.
     * @return The instance called.
     */
    public P id(final String id) {
        addStringAttribute("id", id);
        return this;
    }
}
