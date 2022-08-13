package net.filipvanlaenen.txhtmlj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithContent;
import net.filipvanlaenen.txhtmlj.FlowContent;

public abstract class H extends ElementWithContent implements FlowContent {
    protected H(String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "h" + getLevel();
    }

    protected abstract int getLevel();
}
