package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a header element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-header-element">4.3.8 The header element</a>
 */
public final class Header extends XhtmlElementWithMixedContent<Header> implements FlowContent {
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
        return "header";
    }
}
