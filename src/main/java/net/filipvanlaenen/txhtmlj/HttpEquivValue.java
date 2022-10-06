package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;

/**
 * An enumeration for all the HTTP equiv values.
 */
public enum HttpEquivValue implements AttributeValueEnumeration {
    CONTENT_LANGUAGE, CONTENT_SECURITY_POLICY, CONTENT_TYPE, DEFAULT_STYLE, REFRESH, SET_COOKIE, X_UA_COMPATIBLE;

    /**
     * Converts the attribute value to a string.
     *
     * @return A string representing the value.
     */
    public String asString() {
        return toString().toLowerCase().replaceAll("_", "-");
    }
}
