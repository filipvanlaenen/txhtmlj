package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.H;

/**
 * A class representing a h2 element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">4.3.6 The
 *      h1, h2, h3, h4, h5, and h6 elements</a>
 */
public final class H2 extends H {
    /**
     * Constructs a h2 element with a string as its content.
     *
     * @param content A string.
     */
    public H2(final String content) {
        super(content);
    }

    /**
     * Returns 2, the level of the heading.
     *
     * @return 2, the level of the heading.
     */
    @Override
    protected int getLevel() {
        return 2;
    }
}
