package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithElements;

/**
 * A class representing a head.
 *
 * @see <a href=
 *      "https://html.spec.whatwg.org/multipage/semantics.html#the-head-element">4.2.1
 *      The head element</a>
 */
public final class Head extends ElementWithElements implements XhtmlElement {
    /**
     * Adds metadata content to the list of elements.
     *
     * @param metadataContent
     *            The metadata content to be added.
     */
    public void addElement(final MetadataContent metadataContent) {
        super.addElement(metadataContent);
    }

    @Override
    public String getElementName() {
        return "head";
    }
}
