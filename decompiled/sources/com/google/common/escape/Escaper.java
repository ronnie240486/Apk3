package com.google.common.escape;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@com.google.common.annotations.GwtCompatible
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class Escaper {
    private final com.google.common.base.Function<java.lang.String, java.lang.String> asFunction;


    public Escaper() {
            r1 = this;
            r1.<init>()
            com.google.common.escape.Escaper$1 r0 = new com.google.common.escape.Escaper$1
            r0.<init>(r1)
            r1.asFunction = r0
            return
    }

    public final com.google.common.base.Function<java.lang.String, java.lang.String> asFunction() {
            r1 = this;
            com.google.common.base.Function<java.lang.String, java.lang.String> r0 = r1.asFunction
            return r0
    }

    public abstract java.lang.String escape(java.lang.String r1);
}
