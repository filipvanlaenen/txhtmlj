package net.filipvanlaenen.txhtmlj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithMixedContent;

/**
 * Abstract superclass for XHTML elements with mixed content.
 *
 * @param <E> The subclass.
 */
public abstract class XhtmlElementWithMixedContent<E extends XhtmlElementWithMixedContent<E>>
        extends ElementWithMixedContent<E> {
    /**
     * Default constructor.
     */
    public XhtmlElementWithMixedContent() {
        super();
    }

    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public XhtmlElementWithMixedContent(final String content) {
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

    /**
     * Sets the onmousemove event.
     *
     * @param onmousemove The onmousemove event.
     * @return The instance called.
     */
    public E onmousemove(final String onmousemove) {
        addStringAttribute("onmousemove", onmousemove);
        return (E) this;
    }

    /**
     * Sets the onmouseout event.
     *
     * @param onmouseout The onmouseout event.
     * @return The instance called.
     */
    public E onmouseout(final String onmouseout) {
        addStringAttribute("onmouseout", onmouseout);
        return (E) this;
    }

    /**
     * Sets the onmouseover event.
     *
     * @param onmouseover The onmouseover event.
     * @return The instance called.
     */
    public E onmouseover(final String onmouseover) {
        addStringAttribute("onmouseover", onmouseover);
        return (E) this;
    }
}
