package net.filipvanlaenen.txhtmlj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithContent;

public abstract class XhtmlElementWithContent<E extends XhtmlElementWithContent<E>> extends ElementWithContent<E> {
    /**
     * Constructor taking the content as its parameter.
     *
     * @param content The content.
     */
    protected XhtmlElementWithContent(final String content) {
        super(content);
    }

    /**
     * Sets the class.
     *
     * @param clazz The class.
     * @return The instance called.
     */
    public E clazz(final String clazz) {
        addStringAttribute("class", clazz);
        return (E) this;
    }

    /**
     * Sets the onclick event.
     *
     * @param onclick The onclick event.
     * @return The instance called.
     */
    public E onclick(final String onclick) {
        addStringAttribute("onclick", onclick);
        return (E) this;
    }
}
