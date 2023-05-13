package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithContent;

/**
 * A class representing a script.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#the-script-element">4.12.1 The script element</a>
 */
public final class Script
        extends XhtmlElementWithContent<Script>
        implements FlowContent, MetadataContent, PhrasingContent {
    /**
     * Constructor taking the content as its parameter.
     *
     * @param content The content.
     */
    public Script(final String content) {
        super(content);
    }

    /**
     * Sets the source.
     *
     * @param src The source.
     * @return The instance called.
     */
    public Script src(final String src) {
        addStringAttribute("src", src);
        return this;
    }

    @Override
    public String getElementName() {
        return "script";
    }

    /**
     * Sets the type.
     *
     * @param javaScriptMimeTypeValue The JavaScript MIME type.
     * @return The instance called.
     */
    public Script type(final JavaScriptMimeTypeValue javaScriptMimeTypeValue) {
        addEnumerationAttribute("type", javaScriptMimeTypeValue);
        return this;
    }
}
