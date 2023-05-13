package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a section element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-section-element">4.3.3 The section element</a>
 */
public final class Section extends XhtmlElementWithElements<Section> implements FlowContent {
    /**
     * Adds flow content to the list of elements.
     *
     * @param flowContent The flow content to be added.
     */
    public void addElement(final FlowContent flowContent) {
        super.addElement(flowContent);
    }

    @Override
    public String getElementName() {
        return "section";
    }
}
