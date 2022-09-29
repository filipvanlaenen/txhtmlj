package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndContent;

public class Script extends ElementWithAttributesAndContent implements FlowContent, MetadataContent {
    public Script(String content) {
        super(content);
    }

    public Script src(final String src) {
        addStringAttribute("src", src);
        return this;
    }

    @Override
    public String getElementName() {
        return "script";
    }

    public Script type(final JavaScriptMimeTypeValue javaScriptMimeTypeValue) {
        addEnumerationAttribute("type", javaScriptMimeTypeValue);
        return this;
    }
}
