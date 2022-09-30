package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Script</code> class.
 */
public class ScriptTest {
    /**
     * Test verifying that a simple script with a source and a type is exported correctly.
     */
    @Test
    void simpleScriptWithSrcAndTypetIsConvertedCorrectlyToString() {
        Script script = new Script(" ").src("_js/foo.js").type(JavaScriptMimeTypeValue.APPLICATION_JAVASCRIPT);
        assertEquals("<script src=\"_js/foo.js\" type=\"application/javascript\"> </script>", script.asString());
    }

}
