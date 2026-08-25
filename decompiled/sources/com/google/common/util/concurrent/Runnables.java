package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public final class Runnables {
    private static final java.lang.Runnable EMPTY_RUNNABLE = null;


    static {
            com.google.common.util.concurrent.Runnables$1 r0 = new com.google.common.util.concurrent.Runnables$1
            r0.<init>()
            com.google.common.util.concurrent.Runnables.EMPTY_RUNNABLE = r0
            return
    }

    private Runnables() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Runnable doNothing() {
            java.lang.Runnable r0 = com.google.common.util.concurrent.Runnables.EMPTY_RUNNABLE
            return r0
    }
}
