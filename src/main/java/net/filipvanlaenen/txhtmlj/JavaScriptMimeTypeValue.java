package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;

public enum JavaScriptMimeTypeValue implements AttributeValueEnumeration {
    APPLICATION_ECMASCRIPT("application/ecmascript"), APPLICATION_JAVASCRIPT("application/javascript"),
    APPLICATION_X_ECMASCRIPT("application/x-ecmascript"), APPLICATION_X_JAVASCRIPT("application/x-javascript"),
    TEXT_ECMASCRIPT("text/ecmascript"), TEXT_JAVASCRIPT("text/javascript"), TEXT_JAVASCRIPT_1_0("text/javascript1.0"),
    TEXT_JAVASCRIPT_1_1("text/javascript1.1"), TEXT_JAVASCRIPT_1_2("text/javascript1.2"),
    TEXT_JAVASCRIPT_1_3("text/javascript1.3"), TEXT_JAVASCRIPT_1_4("text/javascript1.4"),
    TEXT_JAVASCRIPT_1_5("text/javascript1.5"), TEXT_LIVESCRIPT("text/livescript"), TEXT_JSCRIPT("text/jscript"),
    TEXT_X_ECMASCRIPT("text/x-ecmascript"), TEXT_X_JAVASCRIPT("text/x-javascript");

    private String stringValue;

    JavaScriptMimeTypeValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String asString() {
        return stringValue;
    }
}
