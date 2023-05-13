package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.H;

/**
 * A class representing a h3 element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">4.3.6 The
 *      h1, h2, h3, h4, h5, and h6 elements</a>
 */
public final class H3 extends H<H3> {
    /**
     * The magic number three.
     */
    private static final int THREE = 3;

    /**
     * Constructs a h3 element with a string as its content.
     *
     * @param content A string.
     */
    public H3(final String content) {
        super(content);
    }

    /**
     * Returns 3, the level of the heading.
     *
     * @return 3, the level of the heading.
     */
    @Override
    protected int getLevel() {
        return THREE;
    }
}
