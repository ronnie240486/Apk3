package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class Ticker {
    private static final com.google.common.base.Ticker SYSTEM_TICKER = null;


    static {
            com.google.common.base.Ticker$1 r0 = new com.google.common.base.Ticker$1
            r0.<init>()
            com.google.common.base.Ticker.SYSTEM_TICKER = r0
            return
    }

    public Ticker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.base.Ticker systemTicker() {
            com.google.common.base.Ticker r0 = com.google.common.base.Ticker.SYSTEM_TICKER
            return r0
    }

    public abstract long read();
}
