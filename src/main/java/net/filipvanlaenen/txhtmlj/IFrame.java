package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.EmptyXhtmlElement;

/**
 * A class representing an iframe element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/iframe-embed-object.html#the-iframe-element">4.8.5 The iframe
 *      element</a>
 */
public final class IFrame extends EmptyXhtmlElement<IFrame> implements FlowContent, PhrasingContent {
    @Override
    public String getElementName() {
        return "iframe";
    }

    /**
     * Sets the address of the resource.
     *
     * @param src The address of the resource.
     * @return The instance called.
     */
    public IFrame src(final String src) {
        addStringAttribute("src", src);
        return this;
    }
}
