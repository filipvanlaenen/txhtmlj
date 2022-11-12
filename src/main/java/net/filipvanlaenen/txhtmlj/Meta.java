package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributes;

/**
 * A class representing a meta element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#the-meta-element">4.2.5 The meta element</a>
 */
public final class Meta extends ElementWithAttributes implements MetadataContent, PhrasingContent {
    /**
     * Sets the content.
     *
     * @param content The content.
     * @return The instance called.
     */
    public Meta content(final String content) {
        addStringAttribute("content", content);
        return this;
    }

    @Override
    public String getElementName() {
        return "meta";
    }

    /**
     * Sets the pragma directive.
     *
     * @param httpEquivValue The pragma directive value.
     * @return The instance called.
     */
    public Meta httpEquiv(final HttpEquivValue httpEquivValue) {
        addEnumerationAttribute("http-equiv", httpEquivValue);
        return this;
    }
}
