package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.EmptyXhtmlElement;

/**
 * A class representing a link element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#the-link-element">4.2.4 The link element</a>
 */
public final class Link extends EmptyXhtmlElement<Link> implements MetadataContent, PhrasingContent {
    @Override
    public String getElementName() {
        return "link";
    }

    /**
     * Sets the hyperreference.
     *
     * @param href The hyperreference.
     * @return The instance called.
     */
    public Link href(final String href) {
        addStringAttribute("href", href);
        return this;
    }

    /**
     * Sets the relationship.
     *
     * @param linkTypeValue The link type value.
     * @return The instance called.
     */
    public Link rel(final LinkTypeValue linkTypeValue) {
        addEnumerationAttribute("rel", linkTypeValue);
        return this;
    }

    /**
     * Sets the type.
     *
     * @param type The type.
     * @return The instance called.
     */
    public Link type(final String type) {
        addStringAttribute("type", type);
        return this;
    }
}
