package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingObject {
    public ForwardingObject() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Object delegate();

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.delegate()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
