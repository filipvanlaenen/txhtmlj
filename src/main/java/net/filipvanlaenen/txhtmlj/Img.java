package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.EmptyXhtmlElement;

/**
 * A class representing an img element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#the-img-element">4.8.3 The img element</a>
 */
public final class Img extends EmptyXhtmlElement<Img> implements FlowContent, PhrasingContent {
    /**
     * Sets the replacement text.
     *
     * @param alt The replacement text.
     * @return The instance called.
     */
    public Img alt(final String alt) {
        addStringAttribute("alt", alt);
        return this;
    }

    @Override
    public String getElementName() {
        return "img";
    }

    /**
     * Sets the address of the resource.
     *
     * @param src The address of the resource.
     * @return The instance called.
     */
    public Img src(final String src) {
        addStringAttribute("src", src);
        return this;
    }
}
