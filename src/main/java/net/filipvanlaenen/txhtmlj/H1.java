package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.H;

/**
 * A class representing a h1 element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">4.3.6 The
 *      h1, h2, h3, h4, h5, and h6 elements</a>
 */
public final class H1 extends H {
    /**
     * Constructs a h1 element with a string as its content.
     *
     * @param content A string.
     */
    public H1(final String content) {
        super(content);
    }

    /**
     * Sets the class.
     *
     * @param clazz The class.
     * @return The instance called.
     */
    public H1 clazz(final String clazz) {
        addStringAttribute("class", clazz);
        return this;
    }

    /**
     * Returns 1, the level of the heading.
     *
     * @return 1, the level of the heading.
     */
    @Override
    protected int getLevel() {
        return 1;
    }
}
