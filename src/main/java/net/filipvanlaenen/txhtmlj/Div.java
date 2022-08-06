package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndContent;

/**
 * A class representing a div element.
 *
 * @see <a href= "https://html.spec.whatwg.org/multipage/grouping-content.html#the-div-element">4.4.15 The div
 *      element</a>
 */
public final class Div extends ElementWithAttributesAndContent implements FlowContent {
    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public Div(final String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "div";
    }

    /**
     * Sets the class.
     *
     * @param clazz The class.
     * @return The instance called.
     */
    public Div clazz(final String clazz) {
        addStringAttribute("class", clazz);
        return this;
    }
}
