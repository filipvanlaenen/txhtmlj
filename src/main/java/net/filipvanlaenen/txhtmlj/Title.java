package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithContent;

/**
 * A class representing a title.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#the-title-element">4.2.2 The title element</a>
 */
public final class Title extends XhtmlElementWithContent<Title> implements MetadataContent {
    /**
     * Constructs a title element with a string as its content.
     *
     * @param content A string.
     */
    public Title(final String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "title";
    }
}
