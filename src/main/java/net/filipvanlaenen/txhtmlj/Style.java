package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithContent;

/**
 * A class representing a style.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#the-style-element">4.2.6 The style element</a>
 */
public final class Style extends ElementWithContent implements MetadataContent {
    /**
     * Constructs a style element with a string as its content.
     *
     * @param content A string.
     */
    public Style(final String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "style";
    }
}
