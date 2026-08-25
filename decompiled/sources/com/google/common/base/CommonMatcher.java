package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
abstract class CommonMatcher {
    public CommonMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int end();

    public abstract boolean find();

    public abstract boolean find(int r1);

    public abstract boolean matches();

    public abstract java.lang.String replaceAll(java.lang.String r1);

    public abstract int start();
}
