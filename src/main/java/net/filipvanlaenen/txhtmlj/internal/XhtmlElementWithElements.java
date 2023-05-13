package net.filipvanlaenen.txhtmlj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithElements;

/**
 * Abstract superclass for XHTML elements with elements.
 *
 * @param <E> The subclass.
 */
public abstract class XhtmlElementWithElements<E extends XhtmlElementWithElements<E>> extends ElementWithElements<E> {
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
     * Adds a custom data attribute to the table row.
     *
     * @param name  The name of the custom data attribute.
     * @param value The value of the custom data attribute.
     * @return The instance called.
     */
    public E data(final String name, final String value) {
        addStringAttribute("data-" + name, value);
        return (E) this;
    }

    /**
     * Sets the onchange event.
     *
     * @param onchange The onchange event.
     * @return The instance called.
     */
    public E onchange(final String onchange) {
        addStringAttribute("onchange", onchange);
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

    /**
     * Sets the onload event.
     *
     * @param onload The onload event.
     * @return The instance called.
     */
    public E onload(final String onload) {
        addStringAttribute("onload", onload);
        return (E) this;
    }
}
