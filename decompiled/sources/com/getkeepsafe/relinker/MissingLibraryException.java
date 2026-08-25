package com.getkeepsafe.relinker;

/* JADX INFO: loaded from: classes3.dex */
public class MissingLibraryException extends java.lang.RuntimeException {
    public MissingLibraryException(java.lang.String r3, java.lang.String[] r4, java.lang.String[] r5) {
            r2 = this;
            java.lang.String r0 = "Could not find '"
            java.lang.String r1 = "'. Looked for: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r0, r3, r1)
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r3.append(r4)
            java.lang.String r4 = ", but only found: "
            r3.append(r4)
            java.lang.String r4 = java.util.Arrays.toString(r5)
            java.lang.String r5 = "."
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r4, r5)
            r2.<init>(r3)
            return
    }
}
