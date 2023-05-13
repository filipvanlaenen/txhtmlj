package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.H;

/**
 * A class representing a h5 element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">4.3.6 The
 *      h1, h2, h3, h4, h5, and h6 elements</a>
 */
public final class H5 extends H<H5> {
    /**
     * The magic number five.
     */
    private static final int FIVE = 5;

    /**
     * Constructs a h5 element with a string as its content.
     *
     * @param content A string.
     */
    public H5(final String content) {
        super(content);
    }

    /**
     * Returns 5, the level of the heading.
     *
     * @return 5, the level of the heading.
     */
    @Override
    protected int getLevel() {
        return FIVE;
    }
}
