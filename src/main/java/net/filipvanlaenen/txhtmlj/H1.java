package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.H;

public final class H1 extends H {
    protected H1(String content) {
        super(content);
    }

    @Override
    protected int getLevel() {
        return 1;
    }
}
