package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;

/**
 * An enumeration for all the HTTP equiv values.
 */
public enum HttpEquivValue implements AttributeValueEnumeration {
    /**
     * The <code>content-value</code> value.
     */
    CONTENT_LANGUAGE,
    /**
     * The <code>content-security-policy</code> value.
     */
    CONTENT_SECURITY_POLICY,
    /**
     * The <code>content-type</code> value.
     */
    CONTENT_TYPE,
    /**
     * The <code>default-style</code> value.
     */
    DEFAULT_STYLE,
    /**
     * The <code>refresh</code> value.
     */
    REFRESH,
    /**
     * The <code>set-cookie</code> value.
     */
    SET_COOKIE,
    /**
     * The <code>x-ua-compatible</code> value.
     */
    X_UA_COMPATIBLE;

    /**
     * Converts the attribute value to a string.
     *
     * @return A string representing the value.
     */
    public String asString() {
        return toString().toLowerCase().replaceAll("_", "-");
    }
}
