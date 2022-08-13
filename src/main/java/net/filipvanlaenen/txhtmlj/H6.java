package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.H;

/**
 * A class representing a h6 element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">4.3.6 The
 *      h1, h2, h3, h4, h5, and h6 elements</a>
 */
public final class H6 extends H {
    /**
     * The magic number six.
     */
    private static final int SIX = 6;

    /**
     * Constructs a h6 element with a string as its content.
     *
     * @param content A string.
     */
    public H6(final String content) {
        super(content);
    }

    /**
     * Returns 6, the level of the heading.
     *
     * @return 6, the level of the heading.
     */
    @Override
    protected int getLevel() {
        return SIX;
    }
}
