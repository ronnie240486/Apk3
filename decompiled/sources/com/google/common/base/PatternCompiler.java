package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
interface PatternCompiler {
    com.google.common.base.CommonPattern compile(java.lang.String r1);

    boolean isPcreLike();
}
